package cc.fyp.toy.controller;

import cc.fyp.toy.service.evcard.EvcardService;
import cc.fyp.toy.service.evcard.dto.*;
import cc.fyp.toy.service.evcard.outapi.EvcardApi;
import com.alibaba.fastjson.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@RequestMapping(value = "card")
public class EvcardController {

    private final static Logger logger = LoggerFactory.getLogger(EvcardController.class);

    @Autowired
    private EvcardService evcardService;

    @Value("${card.type}")
    private String cardTyp;

    @Value("${card.arae}")
    private String options;

    @Value("${card.host}")
    private String host;

    @RequestMapping(value = "show")
    public String showbase(HttpServletRequest request, HttpServletResponse response){
        logger.info("请求show");
        request.setAttribute("querys",EvcardService.QUERYS);
        request.setAttribute("cardType", Arrays.asList(cardTyp.split(",")));
        List<AreaResq> areaResqList =  JSONArray.parseArray(options,AreaResq.class);
        request.setAttribute("options",areaResqList);
        return "tool/carbt";
    }

    @RequestMapping(value = "go")
    public String go(HttpServletRequest request, QueryDTO queryParam){
        logger.info("启动{}查询",queryParam);
        queryParam.setStartDate(new Date());
        evcardService.loadCard(queryParam);
        request.setAttribute("queryTasks",EvcardService.QUERYS);
        request.setAttribute("flag","启动成功");
        request.setAttribute("cardType", Arrays.asList(cardTyp.split(",")));
        List<AreaResq> areaResqList =  JSONArray.parseArray(options,AreaResq.class);
        request.setAttribute("options",areaResqList);
        request.setAttribute("host",host);
        return "tool/process";
    }

    @RequestMapping(value = "process")
    public String process(HttpServletRequest request, QueryTask queryDTO){
        request.setAttribute("queryTasks",EvcardService.QUERYS);
        request.setAttribute("cardType", Arrays.asList(cardTyp.split(",")));
        List<AreaResq> areaResqList =  JSONArray.parseArray(options,AreaResq.class);
        request.setAttribute("options",areaResqList);
        request.setAttribute("host",host);
        return "tool/process";
    }


    @RequestMapping(value = "cancel")
    public String cancel(HttpServletRequest request,Long taskId){

        if (!EvcardService.QUERYS.isEmpty()){
            QueryTask queryDTO = EvcardService.QUERYS.stream().filter(qt -> qt.getTaskId().equals(taskId)).findFirst().get();
            queryDTO.setFlag(false);
        }

        request.setAttribute("queryTasks",EvcardService.QUERYS);
        request.setAttribute("cardType", Arrays.asList(cardTyp.split(",")));
        List<AreaResq> areaResqList =  JSONArray.parseArray(options,AreaResq.class);
        request.setAttribute("options",areaResqList);
        return "tool/process";
    }


    @RequestMapping(value = "order",method = RequestMethod.GET)
    public String order(HttpServletRequest request,String seq,String vin){
        logger.info("启动预约功能{}-{}",seq,vin);
        EvcardComm result =  evcardService.order(seq,vin);
        request.setAttribute("result","预约结果");
        request.setAttribute("message",result.getMessage());
        return "comm/result";
    }


    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(HttpServletRequest request){
        logger.info("启动登录......");
        EvcardApi api = new EvcardApi();
        String token = api.login(evcardService.getHeader());
        request.setAttribute("result","登录结果");
        request.setAttribute("message",token);
        return "comm/result";
    }

}

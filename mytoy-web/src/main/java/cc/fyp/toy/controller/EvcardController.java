package cc.fyp.toy.controller;

import cc.fyp.toy.service.evcard.EvcardService;
import cc.fyp.toy.service.evcard.dto.EvcardOrderResp;
import cc.fyp.toy.service.evcard.dto.QueryDTO;
import cc.fyp.toy.service.evcard.outapi.EvcardApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping(value = "card")
public class EvcardController {

    private final static Logger logger = LoggerFactory.getLogger(EvcardController.class);

    @Autowired
    private EvcardService evcardService;

    @RequestMapping(value = "show")
    public String showbase(HttpServletRequest request, HttpServletResponse response){

        request.setAttribute("querys",EvcardService.QUERYS);
        return "/pages/tool/card";
    }

    @RequestMapping(value = "go")
    public String go(HttpServletRequest request,QueryDTO queryDTO){
        logger.info("启动{}查询",queryDTO);
        queryDTO.setStartDate(new Date());
        evcardService.loadCard(queryDTO);
        request.setAttribute("flag","启动成功");
        request.setAttribute("querys",EvcardService.QUERYS);
        return "/pages/tool/card";
    }

    @RequestMapping(value = "order",method = RequestMethod.GET)
    public String order(HttpServletRequest request,String seq,String vin){
        logger.info("启动预约功能{}-{}",seq,vin);
        EvcardOrderResp result =  evcardService.order(seq,vin);
        request.setAttribute("result","预约结果");
        request.setAttribute("message",result.getMessage());
        return "/pages/comm/result";
    }


    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(HttpServletRequest request){
        logger.info("启动登录......");
        EvcardApi api = new EvcardApi();
        String token = api.login();
        request.setAttribute("result","登录结果");
        request.setAttribute("message",token);
        return "/pages/comm/result";
    }

}

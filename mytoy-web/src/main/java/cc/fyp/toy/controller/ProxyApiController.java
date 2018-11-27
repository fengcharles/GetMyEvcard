package cc.fyp.toy.controller;

import cc.fyp.toy.service.evcard.EvcardService;
import cc.fyp.toy.service.evcard.dto.EvcardHeader;
import cc.fyp.toy.service.evcard.outapi.EvcardApi;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "api")
public class ProxyApiController {

    private static final Logger logger = LoggerFactory.getLogger(ProxyApiController.class);

    @Autowired
    private EvcardApi evcardApi;


    @Autowired
    private EvcardService evcardService;

    @PostMapping(value = "getVehicleInfoList")
    @ResponseBody
    public String getVehicleInfoList(HttpServletRequest request,@RequestBody String para){

        String sign = request.getHeader("Sign");
        String timeStamp = request.getHeader("TimeStamp");
        String appkey = request.getHeader("appkey");
        String random = request.getHeader("random");
        String token = request.getHeader("token");

        EvcardHeader evcardHeader = new EvcardHeader();
        evcardHeader.setSign(sign);
        evcardHeader.setTimeStamp(timeStamp);
        evcardHeader.setAppkey(appkey);
        evcardHeader.setRandom(random);
        evcardHeader.setToken(token);
        logger.info("请求头部信息:"+evcardHeader);
        logger.info("参数:"+para);

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(evcardHeader);
        evcardService.saveHeader(jsonObject.toString());
        JSONObject infoList = evcardApi.getVehicleInfoList(para, evcardHeader);
        logger.info("返回值:" + infoList);
        return infoList.toJSONString();
    }

}

package cc.fyp.toy.controller;

import cc.fyp.toy.service.evcard.EvcardService;
import cc.fyp.toy.service.evcard.dto.QueryDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}

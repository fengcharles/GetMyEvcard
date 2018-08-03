package cc.fyp.toy.controller;

import cc.fyp.toy.service.evcard.EvcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "card")
public class EvcardController {

    @Autowired
    private EvcardService evcardService;

    @RequestMapping(value = "go")
    public String showbase(HttpServletRequest request, HttpServletResponse response){
        evcardService.loadCard("303");
        return "/pages/tool/t";
    }

}

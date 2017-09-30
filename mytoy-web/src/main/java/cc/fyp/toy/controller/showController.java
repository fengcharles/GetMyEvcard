package cc.fyp.toy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/forlt")
public class showController {

    @RequestMapping(value = "/show")
    public String showbase(HttpServletRequest request, HttpServletResponse response){


        return "/pages/tool/t";
    }

}

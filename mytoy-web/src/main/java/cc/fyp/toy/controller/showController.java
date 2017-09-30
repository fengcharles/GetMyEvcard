package cc.fyp.toy.controller;

import cc.fyp.toy.util.HttpUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/forlt")
public class showController {



    @RequestMapping(value = "/show")
    public String showbase(HttpServletRequest request, HttpServletResponse response){




        HttpUtils.post("","");

        return "/pages/tool/t";
    }

}

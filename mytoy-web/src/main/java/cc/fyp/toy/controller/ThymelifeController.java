package cc.fyp.toy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "tmlf")
public class ThymelifeController {

    private final static Logger logger = LoggerFactory.getLogger(ThymelifeController.class);

    @RequestMapping(value = "index")
    public ModelAndView index(HttpServletRequest request, Model model){
        logger.info("请求tmlf");
        model.addAttribute("content","Hello Thymeleaf");
        return new ModelAndView("index","indexModel",model);
    }

}

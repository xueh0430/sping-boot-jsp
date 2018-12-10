package com.xsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Zerox
 * @date 2018/12/4 9:42
 */
@Controller
@RequestMapping("/test")
public class HelloWorldController {

    @RequestMapping(value = "/sayhello.html")
    public @ResponseBody String say(){
        return "Hello Spring boot";
    }

    @RequestMapping(value ="/morning.html")
    public @ResponseBody String morning() {

        return "good morning";
    }

    // Model 这个是Spring MVC中的一个可识别参数
    @RequestMapping(value="/index.html")
    public String say(Model model) {
        model.addAttribute("name","hello,world");
        return "/index.btl";
    }
}

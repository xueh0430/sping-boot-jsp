package com.xsh.controller;

import com.xsh.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Zerox
 * @date 2018/12/10 11:04
 */
@Controller
@RequestMapping("/index")
public class Sample35Controller {


    @GetMapping("/btl")
    public ModelAndView getUser() {

        ModelAndView modelAndView = new ModelAndView("index");
        User user = new User("zhangsan","123");
        System.out.println("请求已经进来了~");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}

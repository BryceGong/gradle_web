package com.bryce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hello")
    public String list() {
        System.out.println("====================");
        return "list";
    }


    @RequestMapping("/index")
    public ModelAndView index() {
        System.err.println("====================");
        ModelAndView modelAndView = new ModelAndView("list");
        return modelAndView;
    }
}

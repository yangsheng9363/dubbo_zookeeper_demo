package com.dubbo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {



    @RequestMapping (value = "/hello")
    public String hello (){
        return "index";
    }

}

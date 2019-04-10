package com.dubbo.controller;


import com.dubbo.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dubbo")
public class ComsumerController {

    @Autowired
    private IProviderService iProviderService;

    @RequestMapping("/hi.action")
    public String hi() {
        System.out.println("22222222222222222222222");
        String str = iProviderService.getString();
        System.out.println("服务方：" + str);
        return "dubbo";
    }

}

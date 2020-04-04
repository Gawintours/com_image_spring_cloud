package com.ribbon.pro.consumerribbon.controller;

import com.ribbon.pro.consumerribbon.service.RibbonService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/get")
    @ResponseBody
    public String hello(@RequestParam String names){
        return ribbonService.hello("gavin.q.x" + names);
    }
}

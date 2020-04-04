package com.feign.tool.pro.consumerfeign.controller;

import com.feign.tool.pro.consumerfeign.Service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @GetMapping("/get")
    @ResponseBody
    public String sayHello(@RequestParam String name){
        return feignService.sayHello(name);
    }
}

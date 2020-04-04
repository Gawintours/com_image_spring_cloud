package com.spring.cloud.eurek.client.eurekclient.eurekclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name){
        return "Hello!!"+name+",I am from:"+port;
    }
}

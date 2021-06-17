package com.atguigu.boot.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller

@RestController
public class HelloController {
    @Value("${cms.name}")
	private String cmsName;
    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, Spring Boot 2!"+cmsName;
    }
}

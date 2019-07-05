package com.xixi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Springmvc");
        return "success";
    }
}


/*
springmvc入门步骤
1.编写controller
2.在springmvc-servlet.xml中配置视图解析器，并扫描@Controller注解
3.在web.xml中配置dispatcherServlet，指定springmvc-servlet.xml文件
4.编写对应的jsp视图文件
* */
package com.xixi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestView {


    //无论返回的是String、ModelAndView、void，springMVC都会将其转换为ModelAndView对象并交给视图解析器
    @RequestMapping(value = "/testInternalResouceViewAndView")
    public String testInternalResouceViewAndView(){
        System.out.println("testInternalResouceViewAndView");
        return "success";
    }



    //自定义view，会调用继承自View的类的实例
    //这里测试好像有问题，会直接去寻找helloView.jsp文件
    @RequestMapping(value = "/testHelloView")
    public String testHelloView(){
        System.out.println("testHelloView");
        return "helloView";
    }

}

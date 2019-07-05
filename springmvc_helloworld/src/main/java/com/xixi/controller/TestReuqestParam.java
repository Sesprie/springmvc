package com.xixi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/*
* @RequestParam与@PathVariable的区别：
* PathVariable获取的是路径中的值，获取/user/100?usernae=zhang&age=12中的中的100
* RequestParam获取的是/user/100?username=zhang&age=12中的username和age
*
* */
@Controller
public class TestReuqestParam {

    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String username,
                                   @RequestParam(value = "age", required = false, defaultValue = "0") int age, HttpServletRequest request){
        //这里的int age，如果在RequestParam中不给defaultValue值，则会报错，虽然将required设置为了false
        //如果不想设置defaultValue值，则直接将int改为包装类Integer，则不传age时，默认是null，不会报错
        request.setAttribute("msg", "username:"+ username+" age:" + age);

        return "success";
    }


    //@RequestHeader用于获取请求头中的参数
    @RequestMapping(value = "/testRequestHeader")
    public String testReuqestHeader(@RequestHeader("Accept-Language") String al, HttpServletRequest request){
        request.setAttribute("msg", "Accept-Language:" + al);
        return "success";
    }

}

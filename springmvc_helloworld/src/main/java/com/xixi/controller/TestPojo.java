package com.xixi.controller;


import com.xixi.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/*
*
* 在使用lombok的时候注意版本问题，如果莫名其妙报错可以换低版本的使用
* 可能是由于jar包之间的不兼容导致报错
* */


//测试pojo的自动映射
//springmvc还支持级联属性映射，例如user的address属性，支持address.province、address.city的直接绑定
@Controller
public class TestPojo {

    public static final String RESULT = "success";

    @RequestMapping(value = "/testPojo")
    public String testPojo(User user, HttpServletRequest request){
        request.setAttribute("msg", user);
        return RESULT;
    }




}

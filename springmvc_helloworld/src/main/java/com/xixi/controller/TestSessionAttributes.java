package com.xixi.controller;


import com.xixi.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;



//@SessionAttributes注解，会将value中的值所对应的request中的属性放入session中，也会将types中的类型对应的值放入session，其实这里，可以将value去掉，因为types包含String类型的数据
//@SessionAttributes注解只能放在类上
@SessionAttributes(value = {"user"}, types = {String.class})
@Controller
public class TestSessionAttributes {


    public static String RESULT = "success";

    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Map<String, Object> map){
        User user = new User("张三","123");
        map.put("user", user);
        map.put("date", 2019);
        return RESULT;
    }



}

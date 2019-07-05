package com.xixi.controller;


import com.xixi.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


//测试ModelAttribute注解
@Controller
public class TestModelAttribute {




    //@ModelAttribute会在每个目标方法执行之前被调用
    @ModelAttribute
    public void getUser(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map){
        if(id != null){
            //模拟从数据库中取数据
            User user = new User(1,"张三","123");
            System.out.println("从数据库获取的对象：" + user);
            map.put("user", user);//在请求之前将user对象存入，在其覆盖时，没有的数据会保持原样
        }
    }

    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute(User user){
        //如果表单中给出了password的input，则不填写数据那么密码为空串，那么被@ModelAttribute的方法创建的对象的值会被替换为空
        if ("".equals(user.getPassword())) {
            System.out.println("密码为:" + "\'\'");
        }else if(null == user.getPassword()){
            //如果直接不给出password的input，则password为null，而此时被@ModelAttribute的方法创建的属性才不会被修改
            System.out.println("密码为:" + null);
        }
        System.out.println("修改后的对象：" + user);
        return "success";

    }
}

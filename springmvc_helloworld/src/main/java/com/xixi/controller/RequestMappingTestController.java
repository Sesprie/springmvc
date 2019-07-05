package com.xixi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

//RequestMapping除了可以修饰方法还可以修饰类，如果修饰了类，则其下的所有方法的路径前都需要加上修饰类的路径
//@Target({ElementType.METHOD, ElementType.TYPE})
@RequestMapping(value = "/requestmapping")
@Controller
public class RequestMappingTestController {


    public static final String RESULT = "success";


    @RequestMapping(value = "/test")
    public String testRequestMapping() {
        System.out.println("RequestMappingTestController");
        return RESULT;
    }


    @RequestMapping(value = "/testPostSubmit", method = RequestMethod.POST)
    public String testPostSubmit() {
        return RESULT;
    }

    //params中的参数表示必须包含username，且age参数不能等于10，如果不符合条件，则没办法正确处理
    //这里headers要求是Accept-Language: zh-CN,zh;q=0.9,en;q=0.8，如果是别的则不能访问
    @RequestMapping(value = "/testParams", params = {"username","age!=10"}, headers = "Accept-Language=zh-CN,zh;q=0.9,en;q=0.8")
    public String testParams() {
        return RESULT;
    }





    //测试带通配符的路径，注意*不再会去匹配/
    //即该语句只会匹配/testAntPath/fdsfsafsda/hello，而不会匹配/testAntPath/a/b/c/hello
    @RequestMapping(value = "/testAntPath/*/hello")
    public String testAntPath(){
        return RESULT;
    }
    // /user/*/createUser匹配/user/a/createUser、/user/bbb/createUser等URL
    // /user/**/createUser匹配/user/createUser、/user/aa/bb/createUser等URL
    // /user/createUser??匹配/user/createUseraa、/user/createUserbb等URL


    //forward 转发，如return “forward:/hello”; 浏览器的地址栏不会变，但是有视图返回来
    //redirect 重定向，如return “redirect:/hello”; 浏览器的地址栏会变。
    //PathVariable中的参数和RequestMapping中的占位符一致才能映射成功
    @RequestMapping(value = "/testPathVariable/{user_id}")
    public String testPathVariable(@PathVariable(value = "user_id") int id, HttpServletRequest request){
        request.setAttribute("msg", "id="+id);
        return RESULT;
    }





}

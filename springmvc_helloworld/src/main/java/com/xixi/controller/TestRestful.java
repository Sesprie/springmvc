package com.xixi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


/*
* 实现步骤，
* 1.配置org.springframework.web.filter.HiddenHttpMethodFilter过滤器
* 2.配置相应的RequestMapping
* 3.在form表单中配置隐藏域其name为_method，因为HiddenHttpMethodFilter中是根据这个属性来进行请求转换的
*
* */
//测试Restful风格的CRUD
@Controller
public class TestRestful {



    /*
    *
    *
    *
    * Restful风格             以前的风格
    * /user/1 Put           /user/update?id=1
    * /user/1 Delete        /user/delete?id=1
    * /user/1 Get           /user?id=1
    * /user   Post          /user
    *
    *
    *
    * 如何发送PUT和DELETE请求？
    * 在web.xml文件中配置HiddenHttpMethodFilter过滤器，在表单中设置隐藏域，name为_method值为PUT或者DELETE，且表单的method方法只能为POST，因为HiddenHttpMethodFilter过滤器判断的是post中的隐藏域
    * */


    public static final String RESULT = "success";


    @RequestMapping(value = "/testRest/{user_id}", method = RequestMethod.GET)
    public String testRestGet(@PathVariable("user_id") int id, HttpServletRequest request){
        request.setAttribute("msg", "已获取(Get):" + id);
        return RESULT;
    }

    @RequestMapping(value = "/testRest", method = RequestMethod.POST)
    public String testRestPost(int id, HttpServletRequest request){
        request.setAttribute("msg", "已新增(POST):" + id);
        return RESULT;
    }


    @RequestMapping(value = "/testRest/{user_id}", method = RequestMethod.PUT)
    public String testRestPut(@PathVariable("user_id") int id, HttpServletRequest request){
        request.setAttribute("msg", "已新增(PUT):" + id);
        return RESULT;
    }

    @RequestMapping(value = "/testRest/{user_id}", method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable("user_id") int id, HttpServletRequest request){
        request.setAttribute("msg", "已删除(DELETE):" + id);
        return RESULT;
    }









}

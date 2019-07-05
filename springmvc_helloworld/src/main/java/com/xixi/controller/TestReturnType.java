package com.xixi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

//测试SpringMVC的几种返回类型
@Controller
public class TestReturnType {

    public static String RESULT = "success";



    /*
    * ModelAndView的参数viewName： name of the View to render, to be resolved
     * by the DispatcherServlet's ViewResolver
    *
    * */
    //其实无论返回的是什么类型，SpringMVC都会将其转换为ModelAndView类型
    @RequestMapping(value = "/testModelAndView")
    public ModelAndView testModelAndView(){
        //这里传入了渲染的页面
        ModelAndView mav = new ModelAndView(RESULT);
        //这一步的操作会将键值对存入requestScope域中
        mav.addObject("msg", new Date());
        return mav;
    }




    //测试入参
    //可以添加为Map类型、Model类型、ModelMap类型
    @RequestMapping(value = "/testMap")
    public String testMap(Map<String, Object> map){
        //get请求和post过来的键值对不会被存入map中
        //String作为返回值的时候，SpringMVC也是将其转换为ModelAndView返回
        //map作为入参时，其内的键值对在返回给视图解析器时被存入了ModelAndView中
        map.put("msg", Arrays.asList("zhangsan","lisi","liuhua"));
        return RESULT;
    }


}

package com.xixi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/*
*
* MVC的Handler接受的ServletAPI的类型有
* HttpServletRequest
* HttpServletResponse
* HttpSession
* java.security.Principal
* Locale
* InputStream
* OutputStream
* Reader
* Writer
* */
@Controller
public class TestServletAPI {








    @RequestMapping(value = "/testServletApi")
    public void testServletApi(HttpServletRequest request, HttpServletResponse response, Writer out){
        System.out.println("request: " + request);
        System.out.println("response: " + response);
        try {
            out.write("Hello ServletAPI");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

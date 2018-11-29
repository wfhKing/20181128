package com.nf147.test01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@RestController
//@CrossOrigin
@RestController
public class CORSController {

    @RequestMapping("/cors")
    public String cors(@RequestParam(defaultValue = "callback") String callback, HttpServletResponse response, HttpServletRequest request) {

//        跨域请求，加表头的方式
//        response.setHeader("Access-Control-Allow-Origin", "http://169.254.169.79:8081");

//        String originHeader = request.getHeader("Origin");
//        response.setHeader("Access-Control-Allow-Origin",originHeader);

//        response.setHeader("Access-Control-Allow-Origin","*");
        return callback + "('hello')";
    }

    @RequestMapping("/rrr")
    public String rrr(@RequestParam(defaultValue = "callback") String callback) {
        return callback + "('rrr')";
    }
}

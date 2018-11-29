package com.nf147.test01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionHandlerController {

    @RequestMapping("/ddd")
    public String ddd() throws Exception {
        return "ddd";
    }

//    用 @ExceptionHandler 注解，但只作用于本类
    @ExceptionHandler(Exception.class)
    public String handlerExcetion(Exception e, Model model) {
        model.addAttribute("msg", e.getMessage());
        return "err";
    }

//    ...还可以根据要求继续定义对应的异常
}

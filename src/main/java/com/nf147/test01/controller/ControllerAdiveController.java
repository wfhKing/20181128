package com.nf147.test01.controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Component
@ControllerAdvice
public class ControllerAdiveController {
    //    @ExceptionHandler 配合 @ControllerAdvice 使用，可以使得使用的 Contrllor 都可以使用
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.URI_TOO_LONG)
    @ResponseBody
    public String eee(){
        return "处理异常";
    }

//    ...还可以根据要求继续定义对应的异常
}

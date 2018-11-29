package com.nf147.test01.controller;


import com.sun.xml.internal.ws.spi.db.DatabindingException;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 自定义异常
public class MyExceptionResolver extends AbstractHandlerExceptionResolver {
    @Override
    protected ModelAndView doResolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        if (e instanceof DatabindingException) {
            return new ModelAndView("跳转DatabindingException异常处理页面");
        } else if (e instanceof MyBatisSystemException) {
            return new ModelAndView("跳转MyBatisSystemException异常处理页面");
        }
        // ...还可以根据要求继续定义对应的异常
        return null;
    }
}

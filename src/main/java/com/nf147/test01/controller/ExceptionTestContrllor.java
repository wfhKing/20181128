package com.nf147.test01.controller;

import com.sun.xml.internal.ws.spi.db.DatabindingException;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ExceptionTestContrllor {

    //    异常处理
//    1.我们可以直接抛出，使用默认的DefaultHandlerExceptionResolver 来处理
    @RequestMapping("/aaa")
    public String aaa() throws Exception {
        return "aaa";
    }

    //    2.我们也可以使用try...catch的编程式异常处理的方式，将所有相关的异常，进行捕获，在跳转到对应的页面进行处理
    @RequestMapping("/bbb")
    public String bbb(Model model) {
        try {
            System.out.println("内容");
        } catch (DatabindingException e) {
            model.addAttribute("msg", e.getMessage());
            return "input";
        } catch (MyBatisSystemException e) {
            model.addAttribute("msg", e.getMessage());
            return "mb";
        }
        //   ...还可以根据要求继续定义对应的异常
        return "bbb";
    }

//    3.自定义 HandlerExceptionResolver，然后让我们的类去继承我们定义的异常类
//    看 MyExceptionResolver 文件

//    使用注解的方式
//    看 ExceptionHandlerController 和 ControllerAdiveController 文件
}

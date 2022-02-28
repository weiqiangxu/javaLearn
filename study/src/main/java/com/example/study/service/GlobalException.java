package com.example.study.service;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/* 全局异常处理类
 *
 *
 */
@ControllerAdvice
public class GlobalException {
//    /**
//     * java.lang.ArithmeticException 该方法需要返回一个 ModelAndView：目的是可以让我们封装异常信息以及视
//     * 图的指定 参数 Exception e:会将产生异常对象注入到方法中
//     */
//    @ExceptionHandler(value = { java.lang.ArithmeticException.class })
//    public String arithmeticExceptionHandler(Exception e) {
////        ModelAndView mv = new ModelAndView();
////        mv.addObject("error", e.toString());
////        mv.setViewName("error1");
//        return "art error";
//    }

    /**
     * java.lang.NullPointerException 该方法需要返回一个 ModelAndView：目的是可以让我们封装异常信息以及视
     * 图的指定 参数 Exception e:会将产生异常对象注入到方法中
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String nullPointerExceptionHandler(Exception e) {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("error", e.toString());
//        mv.setViewName("error2");
        System.out.println("null ");
        return e.toString();
    }
}
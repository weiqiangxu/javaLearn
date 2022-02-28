package com.example.study.controller;
import com.example.study.model.WebError;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 全局异常处理
 */
//@ControllerAdvice
public class ExceptionHandlerController extends RuntimeException {

    /**
     * 当使用了 @Validated + @RequestBody 注解但是没有在绑定的数据对象后面跟上 Errors 类型的参数声明的话， 
     * Spring MVC 框架会抛出 MethodArgumentNotValidException 异常。
     * 当抛出 MethodArgumentNotValidException 异常,就会被相应的异常处理捕捉到理(有点类似于aop的意思)
     * @param e
     * @return
     */
//    @ExceptionHandler(MethodArgumentNotValidException.class) //指定异常类型
//    @ResponseBody
//    public List<WebError> exception(MethodArgumentNotValidException e) {
//        BindingResult bindingResult = e.getBindingResult();
//        List<ObjectError> allErrors = bindingResult.getAllErrors();
//        List<WebError> errors = new ArrayList<>();
//        for(ObjectError err : allErrors ){
//            // java字符串转整数
//            Integer i = Integer.parseInt(err.getCode());
//            WebError errorMsg = new WebError(i,err.getDefaultMessage());
//            errors.add(errorMsg);
//        }
//        return errors;
//    }
}
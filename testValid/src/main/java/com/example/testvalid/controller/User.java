package com.example.testvalid.controller;

import com.example.testvalid.model.Employee;
import com.example.testvalid.model.Work;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class User {
     /**
     * 注解实现
     * 使用@Valid 注解 实体， 并传入参数bindResult以获取校验结果信息
     * @param employee
     * @return
     */
    @GetMapping("/adds")
    public String addEmployee(Employee employee){
        // 前端访问链接是  /adds?name=jack&age=18
        // 其中name和age都会放进employee的对象之中
        return "adds success "+employee.toString();
    }

    @GetMapping("/add")
    public String add(Employee employee){
        if(employee.getName() == ""){
            // 字段不能为空 - 验证逻辑
            // 这也是最原始的数据校验
            return "error";
        }
        return "add success "+employee.toString();
    }

    @GetMapping("/addTwo")
    public String addTwo(@Valid Employee employee,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return bindingResult.getAllErrors().get(0).getDefaultMessage();
        }
        return "add success "+employee.toString();
    }


    // {"company":{"companyName":"123"},"location":"beijing"} -- 传递数据
    @PostMapping("/work")
    public String work(@Validated @RequestBody Work work, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return bindingResult.getAllErrors().toString();
        }
        return "add success "+work.toString();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}

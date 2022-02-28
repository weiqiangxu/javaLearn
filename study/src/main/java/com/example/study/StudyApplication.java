package com.example.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.zxp.esclientrhl.annotation.EnableESTools;

@SpringBootApplication
//@MapperScan("com.example.study.mapper")
//默认扫描启动类所在包下的所有类
//帮助开发人员自动注入工具服务，简化配置，并引入自动发现es索引结构实体类的功能，识别ESCRepository接口并自动生成代理的功能
// 先不学习elastic的java客户端从零配置,各个版本差异太大,并且和工作项目也有自己独立的封装
//@EnableESTools
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

}

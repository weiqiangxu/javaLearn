package com.example.study.model;

import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
public class UserModel {
    private Integer id;
    private String name;

    public static UserModel  build(Cat c){
        UserModel u = new UserModel();
        // BeanUtils.copyProperties(u, c);
        u.setName(c.getName());
        return u;
    }

}


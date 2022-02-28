package com.example.study.service.impl;

import com.example.study.service.Dog;

// extends 继承 - 只能继承一个
// implements 实现 - 可实现多个
public class DogChild extends DogImpl implements Dog {
    @Override
    public void wang() {
        super.wang();
    }
}

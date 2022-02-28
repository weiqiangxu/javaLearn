package com.example.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.study.model.Cat;
import com.example.study.service.CatService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

//如果不使用注解 -service-spring注解将该对象注入到bean容器之中 - 会出现
// type 'com.example.study.service.UserService' that could not be found
@Service
public class CatServiceImpl implements CatService {
    @Override
    public boolean saveBatch(Collection<Cat> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Cat> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Cat> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Cat entity) {
        return false;
    }

    @Override
    public Cat getOne(Wrapper<Cat> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Cat> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Cat> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<Cat> getBaseMapper() {
        return null;
    }
}

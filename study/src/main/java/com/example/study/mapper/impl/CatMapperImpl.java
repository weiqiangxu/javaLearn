package com.example.study.mapper.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.study.mapper.CatMapper;
import com.example.study.model.Cat;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class CatMapperImpl implements CatMapper {
    @Override
    public int insert(Cat entity) {
        return 0;
    }

    @Override
    public int deleteById(Serializable id) {
        return 0;
    }

    @Override
    public int deleteByMap(Map<String, Object> columnMap) {
        return 0;
    }

    @Override
    public int delete(Wrapper<Cat> wrapper) {
        return 0;
    }

    @Override
    public int deleteBatchIds(Collection<? extends Serializable> idList) {
        return 0;
    }

    @Override
    public int updateById(Cat entity) {
        return 0;
    }

    @Override
    public int update(Cat entity, Wrapper<Cat> updateWrapper) {
        return 0;
    }

    @Override
    public Cat selectById(Serializable id) {
        return null;
    }

    @Override
    public List<Cat> selectBatchIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public List<Cat> selectByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Cat selectOne(Wrapper<Cat> queryWrapper) {
        return null;
    }

    @Override
    public Integer selectCount(Wrapper<Cat> queryWrapper) {
        return null;
    }

    @Override
    public List<Cat> selectList(Wrapper<Cat> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<Cat> queryWrapper) {
        return null;
    }

    @Override
    public List<Object> selectObjs(Wrapper<Cat> queryWrapper) {
        return null;
    }

    @Override
    public <E extends IPage<Cat>> E selectPage(E page, Wrapper<Cat> queryWrapper) {
        return null;
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E selectMapsPage(E page, Wrapper<Cat> queryWrapper) {
        return null;
    }
}

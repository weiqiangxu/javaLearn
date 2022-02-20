package com.example.one.mapper;

import com.example.one.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    // 获取所有部门信息 
    List<Department> getDepartments();

    // 通过id获得部门
    Department getDepartment(Integer id);
}
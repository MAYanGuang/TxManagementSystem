package com.example.mybaitsspringboot.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybaitsspringboot.Entity.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: MA
 * @Date: 2021/11/22 13:49
 */
@Mapper
public interface DepartmentDao extends BaseMapper<Department> {
}

package com.example.mybaitsspringboot.Dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybaitsspringboot.Do.User;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: MA
 * @Date: 2021/11/17 14:54
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

    @Select("select * from user where name=#{name}")
    User selectByName(String name);

    @Select("select * from user")
    List<User> selectAll();

}

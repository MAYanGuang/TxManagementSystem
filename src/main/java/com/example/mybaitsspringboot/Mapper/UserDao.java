package com.example.mybaitsspringboot.Mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybaitsspringboot.Entity.User;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: MA
 * @Date: 2021/11/17 14:54
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    @Select("select * from user where name=#{name}")
    User selectByName(String name);

}

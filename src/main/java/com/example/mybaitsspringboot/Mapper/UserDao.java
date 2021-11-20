package com.example.mybaitsspringboot.Mapper;

import com.example.mybaitsspringboot.Entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: MA
 * @Date: 2021/11/17 14:54
 */
@Mapper
public interface UserDao{

    @Select("select * from user where name=#{user_name}")
    User selectByName(String user_name);


}

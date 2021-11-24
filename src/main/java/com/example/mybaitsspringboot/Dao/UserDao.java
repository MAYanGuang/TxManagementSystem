package com.example.mybaitsspringboot.Dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybaitsspringboot.Do.User;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: MA
 * @Date: 2021/11/17 14:54
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    /**
     * 通过名字找对应用户
     * @param name
     * @return User
     */
    @Select("select * from user where name=#{name}")
    User selectByName(String name);

    /**
     * 查询所有用户
     * @return   List<User>
     */
    @Select("select * from user")
    List<User> selectAll();

    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into user values" +
            "(null,#{name},#{password},#{nickname}," +
            "#{gender},#{state},#{phone_number},#{emaile},now(),now())")
    void insertUser(User user);

}

package com.example.mybaitsspringboot.Mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybaitsspringboot.Entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.websocket.server.PathParam;
import java.util.Set;

/**
 * @author: MA
 * @Date: 2021/11/19 16:48
 */
@Mapper
public interface RoleDao extends BaseMapper<Role> {
    /**
     * 通过用户id查询对应的所有角色名称
     *
     * @param userId 用户id
     * @return roles_name
     */
    @Select("select role_name form role where role_id in" +
            "(select role_id form user_role where user_id=#{user_id})")
    Set<String> selectRole_namesByUserId(@Param("user_id")Integer userId);
    /**
     * 通过用户id查询对应的所有角色id
     *
     * @param userId 用户id
     * @return roles_id
     */
    @Select("select role_id form role where role_id in" +
            "(select role_id form user_role where user_id=#{user_id})")
    Set<Integer> selectRole_idsByUserId(@Param("user_id")Integer userId);


}

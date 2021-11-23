package com.example.mybaitsspringboot.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybaitsspringboot.Entity.Authority;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

/**
 * @author: MA
 * @Date: 2021/11/22 13:53
 */
@Mapper
public interface AuthorityDao extends BaseMapper<Authority> {

    /**
     * 通过角色id查询对应的所有权限
     *
     * @param roleIds 所有角色的id
     * @return Authority_name权限名
     */
    @Select("select Authority_name form Authority where Authority_id in" +
            "(select Authority_id from role_Authority where role_id in#{role_ids})")
    Set<String> selectAuthorityNameByRoleId(@Param(value = "role_id")Set<Integer> roleIds);
}

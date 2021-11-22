package com.example.mybaitsspringboot.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybaitsspringboot.Entity.Menu;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: MA
 * @Date: 2021/11/22 13:50
 */
@Mapper
public interface MenuDao extends BaseMapper<Menu> {
}

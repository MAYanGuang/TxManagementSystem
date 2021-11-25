package com.example.mybaitsspringboot.Vo;

import com.example.mybaitsspringboot.Do.Department;
import com.example.mybaitsspringboot.Do.Role;
import com.example.mybaitsspringboot.Do.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

/**
 * @author: MA
 * @Date: 2021/11/25 23:08
 */
@Mapper
public interface DoToVo {
    DoToVo INSTANCE = Mappers.getMapper(DoToVo.class);

    //前端显示所有用户信息

   ShowAllUserVo doToShowAllUserVo (User user, Role role);
}

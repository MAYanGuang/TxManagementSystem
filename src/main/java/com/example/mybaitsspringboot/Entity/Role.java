package com.example.mybaitsspringboot.Entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


/**
 * @author: MA
 * @Date: 2021/11/19 15:21
 * <p>
 * 角色表 存放职位等级
 */
@TableName
public class Role {
    @TableId
    private int roleId;
    @TableField
    private String roleName;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

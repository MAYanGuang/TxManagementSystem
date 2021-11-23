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
    private int role_id;
    @TableField
    private String role_name;

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}

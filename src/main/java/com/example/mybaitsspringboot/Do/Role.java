package com.example.mybaitsspringboot.Do;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @author: MA
 * @Date: 2021/11/19 15:21
 * <p>
 * 角色表 存放职位等级
 */
@Data
public class Role {
    @TableId
    @TableField(value = "role_id")
    private int roleId;
    @TableField(value = "role_name")
    private String roleName;

}

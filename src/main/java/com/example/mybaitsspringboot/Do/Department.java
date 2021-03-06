package com.example.mybaitsspringboot.Do;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:19
 *
 * 部门表
 * 存放部门id 部门信息
 */
@Data
@TableName
public class Department {
    @TableId
    @TableField(value = "department_id")
    private int departmentId;
    @TableField(value = "department_name")
    private String departmentName;



}

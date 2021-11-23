package com.example.mybaitsspringboot.Entity;


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
    private int department_id;
    private String department_name;



}

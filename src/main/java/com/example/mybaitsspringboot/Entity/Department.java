package com.example.mybaitsspringboot.Entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author: MA
 * @Date: 2021/11/19 15:19
 *
 * 部门表
 * 存放部门id 部门信息
 */
@TableName
public class Department {
    @TableId
    private int departmentId;
    private String departmentName;


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

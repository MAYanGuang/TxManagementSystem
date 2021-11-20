package com.example.mybaitsspringboot.Entity;

import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:19
 *
 * 部门表
 * 存放部门id 部门信息
 */
@Data
public class Department {
    private int departmentId;
    private String departmentName;
}

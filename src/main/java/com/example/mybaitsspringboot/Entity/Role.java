package com.example.mybaitsspringboot.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

/**
 * @author: MA
 * @Date: 2021/11/19 15:21
 *
 * 角色表 存放职位等级
 */
@Data
public class Role implements Serializable {
    private static final long serialVersionUID=1L;

    private int roleId;

    private String roleName;

    public Role() {
    }
}

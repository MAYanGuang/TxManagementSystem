package com.example.mybaitsspringboot.Do;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/25 21:47
 */
@Data
public class RoleDepartment {
    @TableId
    @TableField(value = "role_id")
    private int roleId;
    @TableField(value = "department_id")
    private int departmentId;
}

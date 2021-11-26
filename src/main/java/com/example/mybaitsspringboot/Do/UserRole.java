package com.example.mybaitsspringboot.Do;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/25 21:44
 */
@Data
public class UserRole {
    @TableId
    @TableField(value = "user_id")
    private int userId;
    @TableField(value = "role_id")
    private int roleId;
}

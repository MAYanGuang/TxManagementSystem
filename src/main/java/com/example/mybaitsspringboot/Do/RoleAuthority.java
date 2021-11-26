package com.example.mybaitsspringboot.Do;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/25 21:45
 */
@Data
public class RoleAuthority {
    @TableId
    @TableField(value = "authority_id")
    private int authorityId;
    @TableField(value = "role_id")
    private int roleId;
}

package com.example.mybaitsspringboot.Do;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/25 21:46
 */
@Data
public class MenuAuthority {
    @TableId
    @TableField(value = "menu_id")
    private int menuId;
    @TableField(value = "authority_id")
    private int authorityId;
}

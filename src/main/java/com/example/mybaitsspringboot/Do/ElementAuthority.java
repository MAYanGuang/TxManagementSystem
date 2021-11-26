package com.example.mybaitsspringboot.Do;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/25 21:47
 */
@Data
public class ElementAuthority {
    @TableId
    @TableField(value = "element_id")
    private int elementId;
    @TableField(value = "authority_id")
    private int authorityId;
}

package com.example.mybaitsspringboot.Do;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:34
 * <p>
 * ๆ้่กจ
 */
@Data
@TableName
public class Authority {
    @TableId
    @TableField(value = "authority_id")
    private int authorityId;
    @TableField(value = "authority_kind")
    private String authorityKind;


}

package com.example.mybaitsspringboot.Entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:34
 * <p>
 * 权限表
 */
@Data
@TableName
public class Authority {
    @TableId
    private int authority_id;
    private String authority_kind;


}

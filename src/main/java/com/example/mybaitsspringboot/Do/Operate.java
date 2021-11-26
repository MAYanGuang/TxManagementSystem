package com.example.mybaitsspringboot.Do;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:43
 *
 * 操作表
 * 这里存操作相关
 * 操作id
 * 操作名
 * 操作编码
 * 拦截Url前缀
 */
@TableName
@Data
public class Operate {
    @TableId
    @TableField(value = "operate_id")
    private int operateId;
    @TableField(value = "operate_name")
    private String operateName;
    @TableField(value = "operate_code")
    private String operateCode;
    @TableField(value = "operate_url")
    private String interceptUrl;


}

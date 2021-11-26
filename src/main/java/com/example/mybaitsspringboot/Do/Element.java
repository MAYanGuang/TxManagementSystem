package com.example.mybaitsspringboot.Do;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:41
 *
 * 页面元素表
 * 用这个来控制对应角色用户登录后页面显示哪些元素
 */
@Data
@TableName
public class Element {
    @TableId
    @TableField(value = "element_id")
    private int elementId;
    @TableField(value = "element_code")
    private String elementCode;



}

package com.example.mybaitsspringboot.Entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author: MA
 * @Date: 2021/11/19 15:41
 *
 * 页面元素表
 * 用这个来控制对应角色用户登录后页面显示哪些元素
 */

@TableName
public class Element {
    @TableId
    private int elementId;
    private String elementCode;


    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public String getElementCode() {
        return elementCode;
    }

    public void setElementCode(String elementCode) {
        this.elementCode = elementCode;
    }
}

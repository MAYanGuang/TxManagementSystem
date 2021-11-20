package com.example.mybaitsspringboot.Entity;

import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:41
 *
 * 页面元素表
 * 用这个来控制对应角色用户登录后页面显示哪些元素
 */

@Data
public class Element {
    private int elementId;
    private String elementCode;
}

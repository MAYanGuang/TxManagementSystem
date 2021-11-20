package com.example.mybaitsspringboot.Entity;

import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:36
 * <p>
 * 菜单表
 * 控制个人中心有哪些功能
 */
@Data
public class Menu {
    private int menuId;
    private String menuName;
    private String menuUrl;
}

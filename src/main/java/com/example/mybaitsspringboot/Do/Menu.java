package com.example.mybaitsspringboot.Do;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:36
 * <p>
 * 菜单表
 * 控制个人中心有哪些功能
 */
@Data
@TableName
public class Menu {
    @TableId
    @TableField(value = "menu_id")
    private int menuId;
    @TableField(value = "menu_name")
    private String menuName;
    @TableField(value = "menu_url")
    private String menuUrl;


}

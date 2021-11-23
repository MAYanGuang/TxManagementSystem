package com.example.mybaitsspringboot.Entity;


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
    private int menu_id;
    private String menu_name;
    private String menu_url;


}

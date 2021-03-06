package com.example.mybaitsspringboot.Do;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


/**
 * @author: MA
 * @Date: 2021/11/17 14:52
 * <p>
 * DO 简单说DO就是数据库中的记录，一个DO的数据结构对应着库中表的结构，
 * 表中的一条记录就是一个DO对象通常DO里面除了get，set之外没有别的方法。
 * 对于DO来说，数量是相对固定的，一定不会超过数据库表的数量，等同于常说的Entity
 * DO 现在主要有两个版本：
 * ①阿里巴巴的开发手册中的定义，DO（ Data Object）这个等同于上面的PO   本系统采用该规范命名
 * ②DDD（Domain-Driven Design）领域驱动设计中，DO（Domain Object）这个等同于上面的BO
 * 为所有字段生成 getter，
 * 一个有用的 toString 方法，
 * 以及检查所有非瞬态字段的 hashCode 和 equals 实现。
 * 还将为所有非最终字段以及构造函数生成 setter。
 * 用户表 存放用户账号及用户个人信息
 */
@Data
public class User {

    @TableId
    @TableField(value = "user_id")
    private int userId;

    private String name;

    private String nickname;

    private String password;

    private String gender;

    private String state;
    private String email;
    @TableField(value = "create_time")
    private String createTime;
    @TableField(value = "update_time")
    private String updateTime;
    @TableField(javaType = true)
    private String phoneNumber;
    @TableField(value = "image_path")
    private String imagePath;


}

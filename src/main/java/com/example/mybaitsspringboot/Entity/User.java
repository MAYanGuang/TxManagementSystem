package com.example.mybaitsspringboot.Entity;


/**
 * @author: MA
 * @Date: 2021/11/17 14:52
 * @Data 为所有字段生成 getter，
 * 一个有用的 toString 方法，
 * 以及检查所有非瞬态字段的 hashCode 和 equals 实现。
 * 还将为所有非最终字段以及构造函数生成 setter。
 */

//@AllArgsConstructor
//默认无参所以不需要这个无参构造注释
//@NoArgsConstructor

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 用户表 存放用户账号及用户个人信息
 *
 * @author ma
 */
@Data
@TableName
public class User {

    @TableId
    private int id;

    private String name;

    private String password;


}

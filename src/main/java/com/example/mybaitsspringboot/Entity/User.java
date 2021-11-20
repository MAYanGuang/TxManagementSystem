package com.example.mybaitsspringboot.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.annotation.Generated;

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

/**
 *   用户表 存放用户账号及用户个人信息
 * @author ma
 */
@Data
public class User {

    private int id;
    private String user_name;
    private String password;

}

package com.example.mybaitsspringboot.Vo;

/**
 * @author: MA
 * @Date: 2021/11/24 19:05
 *
 * VO   Value Object  值对象
 * VO就是展示用的数据，不管展示方式是网页，还是客户端，还是APP，只要是这个东西是让人看到的，这就叫VO
 * VO主要的存在形式就是js里面的对象（也可以简单理解成json）
 * 注：在展示业务不复杂的系统，可直接使用DTO
 */
public class ShowAllUser {
    private int id;

    private String name;

    private String nickname;

    private String department_name;

    private String phone_number;

    private String create_time;
    //账号状态
    private String state;
}

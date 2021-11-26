package com.example.mybaitsspringboot.Vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


/**
 * @author: MA
 * @Date: 2021/11/24 19:05
 * <p>
 * VO   Value Object  值对象
 * VO就是展示用的数据，不管展示方式是网页，还是客户端，还是APP，只要是这个东西是让人看到的，这就叫VO
 * VO主要的存在形式就是js里面的对象（也可以简单理解成json）
 * 注：在展示业务不复杂的系统，可直接使用DTO
 */
@Data
public class ShowAllUserVo {
    @TableId
    @TableField(value = "user_id")
    private int userId;
    private String name;
    private String nickname;
    @TableField(value = "department_name")
    private String departmentName;
    @TableField(value = "phone_number")
    private String phoneNumber;
    @TableField(value = "create_time")
    private String createTime;
    private String state;
}

package com.example.mybaitsspringboot.Bo;

import lombok.Builder;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/24 18:22
 *
 * BO  Business Object 业务逻辑对象
 * BO是一个业务对象，一类业务就会对应一个BO，数量上没有限制。
 * 而且BO会有很多业务操作，也就是说除了PO对象的get，set方法以外，BO会有很多针对自身数据进行计算的方法。
 * 现在很多持久层框架自身就提供了数据组合的功能，因此BO有可能是在业务层由业务来拼装PO而成，
 * 也有可能是在数据库访问层由框架直接生成。
 * 很多情况下为了追求查询的效率，框架跳过PO直接生成BO的情况非常普遍，PO只是用来增删改使用。
 */
@Data
@Builder
public class AddUserBo {
    private String name;
    private String nickname;
    private String phoneNumber;
    private String email;
    private String password;
    private String gender;
    private String state;
    private int roleId;
    private int departmentId;

}

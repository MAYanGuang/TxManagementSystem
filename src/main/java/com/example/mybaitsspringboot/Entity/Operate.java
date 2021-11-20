package com.example.mybaitsspringboot.Entity;

import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:43
 *
 * 操作表
 * 这里存操作相关
 * 操作id
 * 操作名
 * 操作编码
 * 拦截Url前缀
 */
@Data
public class Operate {
    private int operateId;
    private String operateName;
    private String operateCode;
    private String interceptUrl;
}

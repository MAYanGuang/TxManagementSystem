package com.example.mybaitsspringboot.Entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName
public class Operate {
    @TableId
    private int operateId;
    private String operateName;
    private String operateCode;
    private String interceptUrl;

    public int getOperateId() {
        return operateId;
    }

    public void setOperateId(int operateId) {
        this.operateId = operateId;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    public String getOperateCode() {
        return operateCode;
    }

    public void setOperateCode(String operateCode) {
        this.operateCode = operateCode;
    }

    public String getInterceptUrl() {
        return interceptUrl;
    }

    public void setInterceptUrl(String interceptUrl) {
        this.interceptUrl = interceptUrl;
    }
}

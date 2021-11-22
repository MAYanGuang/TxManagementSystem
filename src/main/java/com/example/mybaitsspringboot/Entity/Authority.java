package com.example.mybaitsspringboot.Entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author: MA
 * @Date: 2021/11/19 15:34
 * <p>
 * 权限表
 */
@TableName
public class Authority {
    @TableId
    private int authorityId;
    private String authorityKind;

    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityKind() {
        return authorityKind;
    }

    public void setAuthorityKind(String authorityKind) {
        this.authorityKind = authorityKind;
    }
}

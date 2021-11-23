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
    private int operate_id;
    private String operate_name;
    private String operate_code;
    private String intercept_url;

    public int getOperate_id() {
        return operate_id;
    }

    public void setOperate_id(int operate_id) {
        this.operate_id = operate_id;
    }

    public String getOperate_name() {
        return operate_name;
    }

    public void setOperate_name(String operate_name) {
        this.operate_name = operate_name;
    }

    public String getOperate_code() {
        return operate_code;
    }

    public void setOperate_code(String operate_code) {
        this.operate_code = operate_code;
    }

    public String getIntercept_url() {
        return intercept_url;
    }

    public void setIntercept_url(String intercept_url) {
        this.intercept_url = intercept_url;
    }
}

package com.example.mybaitsspringboot.Do;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/25 21:48
 */
@Data
public class FileAuthority {
    @TableId
    @TableField(value = "file_id")
    private int adminFileId;
    @TableField(value = "authority_id")
    private int authorityId;

}

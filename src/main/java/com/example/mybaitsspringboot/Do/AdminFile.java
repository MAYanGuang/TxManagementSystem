package com.example.mybaitsspringboot.Do;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: MA
 * @Date: 2021/11/19 15:38
 *
 * 文件管理表
 */
@Data
@TableName
public class AdminFile {
    @TableId
    @TableField(value = "AdminFile_id")
    private int adminFileId;
    @TableField(value = "AdminFile_name")
    private String adminFileName;
    @TableField(value = "AdminFile_path")
    private String adminFilePath;



}

package com.example.mybaitsspringboot.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author: MA
 * @Date: 2021/11/19 15:38
 *
 * 文件管理表
 */
@Data
public class AdminFile {

    private int fileId;

    private String fileName;

    private String filePath;
}

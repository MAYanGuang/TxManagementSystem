package com.example.mybaitsspringboot.Untils;

import java.util.List;

/**
 * @author: MA
 * @Date: 2021/11/12 16:42
 */
public class StringUtils {

    //判断字符串是否为空
    public static boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }

    //使用指定的连接符，把一系列对象连接起来
    public static String join(List args, String separator) {
        if (args == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer(args.size());
        int i = 0;
        for (Object s : args) {
            sb.append(s);
            i++;
            if (i < args.size()) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

}


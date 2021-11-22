package com.example.mybaitsspringboot.Service;



import javax.servlet.http.HttpSession;

/**
 * @author: MA
 * @Date: 2021/11/18 16:35
 */
public interface UserService  {
    /**
     * 验证用户的验证码
     * @param code
     * @param session
     * @return
     */
    public boolean checkVerify(String code, HttpSession session);



}

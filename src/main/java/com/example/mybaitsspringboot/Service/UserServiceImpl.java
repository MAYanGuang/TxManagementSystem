package com.example.mybaitsspringboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * @author: MA
 * @Date: 2021/11/18 16:35
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserService userService;

    @Override
    public boolean checkVerify(String code, HttpSession session) {
        try {
            //从session中获取随机数
            String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
            if (random == null) {
                return false;
            }
            if (random.equals(code)) {
                System.out.println("正确的验证码");
                return true;
            } else {
                System.out.println("错误的验证码");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



}

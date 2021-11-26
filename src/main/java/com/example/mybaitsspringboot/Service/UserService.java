package com.example.mybaitsspringboot.Service;


import com.example.mybaitsspringboot.Bo.AddUserBo;
import com.example.mybaitsspringboot.Vo.ShowAllUserVo;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author: MA
 * @Date: 2021/11/18 16:35
 */
public interface UserService {
    /**
     * 验证用户的验证码
     *
     * @param code    验证
     * @param session session
     * @return boolean
     */
    boolean checkVerify(String code, HttpSession session);

    /**
     * 添加用户
     *
     * @param userBo 添加用户业务逻辑对象
     *               在此处将添加的用户各个属性分配到对应数据库表中
     */
    void addUser(AddUserBo userBo);

    /**
     * 显示所有用户信息 不单单只User表
     *
     * @return List<ShowAllUserVo>
     */
    List<ShowAllUserVo> showUsers();


}

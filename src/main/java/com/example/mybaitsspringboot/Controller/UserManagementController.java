package com.example.mybaitsspringboot.Controller;

import com.example.mybaitsspringboot.Do.User;
import com.example.mybaitsspringboot.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: MA
 * @Date: 2021/11/23 15:59
 * <p>
 * 用户管理模块的控制器
 */
@RestController
public class UserManagementController {
    @Autowired
    UserDao userDao;

    /**
     * 查询所有用户
     * @return List<ShowAllUserVo>
     */
    @RequestMapping(value = "/SelectUser")
    public List<User> selectUserAction() {
        for (User user:userDao.selectAll()){
            System.out.println(user);
        }
        return userDao.selectAll();
    }

//    @RequestMapping(value = "/addPeopleInfo")
//    public String addPeopleInfo(AddUserBo userBo){
//
//    }
}

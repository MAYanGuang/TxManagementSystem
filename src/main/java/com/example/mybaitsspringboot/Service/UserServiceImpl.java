package com.example.mybaitsspringboot.Service;

import com.example.mybaitsspringboot.Bo.AddUserBo;
import com.example.mybaitsspringboot.Bo.BoToDo;
import com.example.mybaitsspringboot.Dao.*;
import com.example.mybaitsspringboot.Do.*;
import com.example.mybaitsspringboot.Vo.ShowAllUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author: MA
 * @Date: 2021/11/18 16:35
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Autowired
    UserRoleDao userRoleDao;
    @Autowired
    UserDepartmentDao userDepartmentDao;
    @Autowired
    DepartmentDao departmentDao;
    @Autowired
    RoleDao roleDao;

    @Override
    public boolean checkVerify(String code, HttpSession session) {
        try {
            //从session中获取随机数
            String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
            if (random == null) {
                return false;
            }
            return random.equals(code);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void addUser(AddUserBo userBo) {
        //将用户信息添加到用户表 添加后用户表产生自增的id,创建时间,更新时间
        User user = BoToDo.INSTANCE.toDoUser(userBo);
        userDao.insertUser(user);

        //查询出用户id,方便关联表
        int id = userDao.selectByName(user.getName()).getUserId();

        //将查询出的用户id放入关联表User_Role
        UserRole userRole = BoToDo.INSTANCE.toDoRole(userBo);
        userRole.setUserId(id);
        userRoleDao.insert(userRole);


        //将查询出的用户id放入关联表User_Department
        UserDepartment userDepartment = BoToDo.INSTANCE.toDoDepartment(userBo);
        userDepartment.setUserId(id);
        userDepartmentDao.insert(userDepartment);

    }

    @Override
    public List<ShowAllUserVo> showUsers() {
      return null;
    }


}

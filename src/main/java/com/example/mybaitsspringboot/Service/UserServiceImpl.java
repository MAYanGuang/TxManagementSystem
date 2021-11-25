package com.example.mybaitsspringboot.Service;
import com.example.mybaitsspringboot.Bo.AddUserBo;
import com.example.mybaitsspringboot.Bo.BoToDo;
import com.example.mybaitsspringboot.Dao.UserDao;
import com.example.mybaitsspringboot.Do.Authority;
import com.example.mybaitsspringboot.Do.Department;
import com.example.mybaitsspringboot.Do.Role;
import com.example.mybaitsspringboot.Do.User;
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
    @Autowired(required = false)
    UserDao userDao;
    @Autowired(required = false)
    BoToDo boToDo;
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
    @Override
    public void addUser(AddUserBo userBo) {
        //将用户信息添加到用户表 添加后用户表产生自增的id,创建时间,更新时间
        User user = BoToDo.INSTANCE.toDoUser(userBo);
        //查询出用户id,方便关联表
        int id = userDao.selectByName(user.getName()).getId();


        Authority authority = BoToDo.INSTANCE.toDoAuthority(userBo);
        Department department = BoToDo.INSTANCE.toDoDepartment(userBo);
        userDao.insertUser(user);
    }


}

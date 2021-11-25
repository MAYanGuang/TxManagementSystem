package com.example.mybaitsspringboot;
import com.example.mybaitsspringboot.Bo.AddUserBo;
import com.example.mybaitsspringboot.Dao.UserDao;
import com.example.mybaitsspringboot.Service.UserServiceImpl;
//@Test要导入带api这个包 import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybaitsSpringBootApplicationTests {
    @Autowired(required = false)
    UserServiceImpl userService;

    @Autowired(required = false)
    UserDao userDao;

    @Test
    public  void setUserDao(){
        System.out.println(userDao.selectAll());
    }
    @Test
    public void kkkk() {
        AddUserBo addUserBo = AddUserBo.builder()
                .authority_kind("admin")
                .name("myg")
                .nickname("~~")
                .phone_number("15158181")
                .email("13111@qq.com")
                .password("111")
                .gender("男")
                .state("启用")
                .role_name("超级管理员")
                .department_name("人事")
                .build();

       userService.addUser(addUserBo);
    }
}


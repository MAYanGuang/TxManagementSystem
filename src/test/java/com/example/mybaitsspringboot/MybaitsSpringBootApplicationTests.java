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

}


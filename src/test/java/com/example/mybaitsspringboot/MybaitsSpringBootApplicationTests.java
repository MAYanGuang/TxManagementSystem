package com.example.mybaitsspringboot;

import com.example.mybaitsspringboot.Controller.UserManagementController;
import com.example.mybaitsspringboot.Entity.User;
import com.example.mybaitsspringboot.Mapper.UserDao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest

class MybaitsSpringBootApplicationTests {

    @Autowired(required = false)
    private UserDao userDao;

   }

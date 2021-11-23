package com.example.mybaitsspringboot;


import com.example.mybaitsspringboot.Dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

class MybaitsSpringBootApplicationTests {

    @Autowired(required = false)
    private UserDao userDao;

   }

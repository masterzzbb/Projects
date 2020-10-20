package com.example.demo;

import com.example.demo.DAO.UserDAO;
import com.example.demo.POJO.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    private UserDAO userDAO;

    @Test
    void contextLoads() {
        List<User> users = userDAO.getUsers();
        System.out.println(users);
    }

}

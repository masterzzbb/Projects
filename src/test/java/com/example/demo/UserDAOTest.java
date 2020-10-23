package com.example.demo;

import com.example.demo.dao.UserDAO;
import com.example.demo.pojo.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

/**
 * @author zhubin
 * @since 2020-10-22 11:41
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class UserDAOTest {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void  selectAllTest(){
        List<UserDO> users = userDAO.listUsers();
        log.info(users.toString());
    }

    @Test
    public void selectUserByName(){//测试根据用户名获取用户
        List<UserDO> users = userDAO.getUsersByName("二姐");
        log.info(users.toString());
    }

    @Test
    public void insertUserTest(){
        String id = UUID.randomUUID().toString();
        Integer i = userDAO.addUser(new UserDO(id,"二哥","0"));
        log.info(i.toString());
    }
    @Test
    public void  deleteUserTest(){
        String id = "8785b1c3-3d67-407b-9d9f-c8b8ca0b1663";
        Integer i = userDAO.deleteUserById(id);
        log.info(i.toString());
    }

    @Test
    public void updateUserTest(){
        String id = "94485750-c5e1-4eda-bace-9c05a1cc020b";
        Integer i = userDAO.updateUser(new UserDO(id,"大姐","1"));
        log.info(i.toString());
    }
}

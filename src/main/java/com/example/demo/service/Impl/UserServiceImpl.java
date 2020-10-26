package com.example.demo.service.Impl;

import com.example.demo.dao.UserDAO;
import com.example.demo.dto.UserDTO;
import com.example.demo.pojo.UserDO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhubin
 * @since 2020-10-20 13:39
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<UserDO> listUsers() {
        return userDAO.listUsers();
    }

    @Override
    public List<UserDO> getUser(String name) {
        return userDAO.getUsersByName(name);
    }

    @Override
    public Integer updateUser(UserDO userDO) {
        return userDAO.updateUser(userDO);
    }

    @Override
    public Integer deleteUser(String id) {
        return userDAO.deleteUserById(id);
    }

    @Override
    public Integer insertUser(UserDO userDO) {
        return userDAO.addUser(userDO);
    }

    @Override
    public UserDO getUserById(String id) {
        return userDAO.getUserById(id);
    }


}

package com.example.demo.service;

import com.example.demo.pojo.UserDO;

import java.util.List;

/**
 * @author zhubin
 * @since 2020-10-20 13:37
 */
public interface UserService {

    List<UserDO> listUsers();

    List<UserDO> getUser(String name);

    Integer updateUser(UserDO userDO);

    Integer deleteUser(String id);

    Integer insertUser(UserDO userDO);

    UserDO getUserById(String id);
}

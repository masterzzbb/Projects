package com.example.demo.DAO;

import com.example.demo.POJO.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhubin
 * @since 2020-10-20 11:48
 */
@Repository
public interface UserDAO {
    List<User> getUsers();
}

package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhubin
 * @since 2020-10-20 11:48
 */
@Repository
public interface UserDAO {
    /**获取所有用户
     * @return List<user>
     */
    List<User> getUsers();

    /**根据用户名获取用户
     * @param name 用户名
     * @return
     */
    List<User> getUsersByName(@Param("name") String name);
}

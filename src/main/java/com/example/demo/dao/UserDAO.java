package com.example.demo.dao;

import com.example.demo.pojo.UserDO;
import org.apache.catalina.User;
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
    List<UserDO> listUsers();

    /**根据用户名获取用户
     * @param name 用户名
     * @return 返回获取的用户列表
     */
    List<UserDO> getUsersByName(@Param("name") String name);

    /**根据用户名删除用户
     *
     * @param id 用户id
     * @return 返回删除的条数
     */
    Integer deleteUserById(@Param("id") String id);

    /**向用户表中插入数据
     *
     * @param user 用户
     * @return 影响条数
     */
    Integer addUser(@Param("user") UserDO user);

    /**更新用户信息
     *
     * @param user 用户
     * @return 影响条数
     */
    Integer updateUser(@Param("user") UserDO user);

    UserDO getUserById(@Param("id") String id);
}

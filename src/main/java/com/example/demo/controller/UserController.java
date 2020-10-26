package com.example.demo.controller;

import com.example.demo.pojo.UserDO;
import com.example.demo.service.UserService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author zhubin
 * @since 2020-10-20 17:49
 */
@RestController
@RequestMapping("user")
@Api(tags = "UserController",value = "用户管理")
public class UserController {
    //变量注入
    @Autowired
    private UserService userService;

    /**测试
     *
     * @return 测试
     */
    @ApiOperation(value = "first app",notes = "test app")
    @GetMapping(value = "/hello")
    public String sayHello(){
        return UUID.randomUUID().toString();
    }

    /**获取所有用户数据
     *
     * @return 返回所有用户数据
     */
    @ApiOperation(value = "获取所有用户",notes = "获取所有用户")
    @GetMapping(value = "/listAll")
    public List<UserDO> listUser(){
        return userService.listUsers();
    }

    /**根据用户名获取用户的业务
     *
     * @param name 用户姓名
     * @return 返回给页面的数据
     */
    @ApiOperation(value = "list",notes = "list")
    @GetMapping(value = "/getByName")
    @ApiOperationSupport(includeParameters = {"name"})
    public List<UserDO> getUserByName(@RequestParam("name") String name){
        return userService.getUser(name);
    }

    @ApiOperation(value = "getById",notes = "getById")
    @GetMapping(value = "/getById")
    public UserDO getUserById(@RequestParam("id") String id){
        return userService.getUserById(id);
    }

    @ApiOperation(value = "update",notes = "update")
    @GetMapping(value = "/update")
    public Integer updateUser(@ModelAttribute("user") UserDO user){
        return userService.updateUser(user);
    }
    @ApiOperation(value = "delete",notes = "delete")
    @GetMapping(value = "/delete")
    public Integer deleteUser(@RequestParam("id") String id){
        return userService.deleteUser(id);
    }
    @ApiOperation(value = "save",notes = "save")
    @GetMapping(value = "/save")
    public Integer saveUser(@ModelAttribute("user") UserDO user){
        String id = UUID.randomUUID().toString();
        user.setId(id);
        return userService.insertUser(user);
    }
}

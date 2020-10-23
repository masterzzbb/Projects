package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author zhubin
 * @since 2020-10-20 17:49
 */
@RestController
@RequestMapping("user")
public class UserController {
//    @Autowired
//    private UserService userService;

    @ApiOperation(value = "first app",notes = "test app")
    @GetMapping(value = "/hello")
    public String sayHello(){
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}

package com.example.demo.dto;

import com.example.demo.pojo.UserDO;
import lombok.Data;

/**
 * @author zhubin
 * @since 2020-10-22 18:14
 */
@Data
public class UserDTO {
    private String newMessage;
    private UserDO user;

}

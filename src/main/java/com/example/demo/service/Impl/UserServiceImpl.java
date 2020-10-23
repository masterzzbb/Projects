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

//    private List<UserDTO> listUsers(){
//        List<UserDO> userDOS = userDAO.listUsers(); //?大写后面必须大写?<规范>
//        List<UserDTO> userDTOS = new ArrayList<>();
//        int index = 0;
//        for (UserDO userDO:userDOS){
//
//        }
//        return
//
//    }

}

package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhubin
 * @since 2020-10-20 11:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDO {
    private String id;
    private  String name;
    private  String gender;
}

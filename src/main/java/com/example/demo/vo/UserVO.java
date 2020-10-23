package com.example.demo.vo;

import com.example.demo.pojo.UserDO;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhubin
 * @since 2020-10-22 18:29
 */
@Data
@NoArgsConstructor
public class UserVO {
    private UserDO userDO;
    private Integer currentPage;
    private Integer pageSize;
    private Integer startPage;
    private Integer total;
}

package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "user",description = "用户")
public class UserDO {
    @ApiModelProperty(name = "id",value = "主键（uuid）",dataType = "java.lang.String")
    private String id;
    @ApiModelProperty(name = "name",value = "姓名",dataType = "java.lang.String")
    private  String name;
    @ApiModelProperty(name = "gender",value = "性别",dataType = "java.lang.String")
    private  String gender;
}

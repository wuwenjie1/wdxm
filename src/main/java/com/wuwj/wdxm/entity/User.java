package com.wuwj.wdxm.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 用户实体类
 * @Date 2022-07-08 11:26
 */
@Data
public class User {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    private String password;
}

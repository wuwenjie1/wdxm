package com.wuwj.wdxm.controller;

import com.wuwj.wdxm.entity.User;
import com.wuwj.wdxm.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 用户模块controller
 * @Date 2022-07-08 14:52
 */
@Api(tags = "用户模块")
@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
    * @Description
    * @Date 2022/7/8 14:56
    * @Param []
    * @return java.util.List<com.wuwj.wdxm.entity.User>
    **/
    @ApiOperation("查询所有用户")
    @GetMapping("findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
}

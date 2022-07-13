package com.wuwj.wdxm.service;

import com.wuwj.wdxm.entity.User;

import java.util.List;

/**
 * @Description 用户模块服务接口
 * @Date 2022-07-08 14:46
 */
public interface IUserService {

    List<User> findAll();
}

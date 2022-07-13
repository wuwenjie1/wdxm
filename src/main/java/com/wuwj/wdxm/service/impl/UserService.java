package com.wuwj.wdxm.service.impl;

import com.wuwj.wdxm.entity.User;
import com.wuwj.wdxm.mapper.UserMapper;
import com.wuwj.wdxm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description 用户模块服务接口实现
 * @Date 2022-07-08 14:48
 */
@Service
public class UserService implements IUserService {

    @Resource
    private UserMapper userMapper;

    /**
    * @Description 查询所有用户
    * @Date 2022/7/8 14:50
    * @Param []
    * @return java.util.List<com.wuwj.wdxm.entity.User>
    **/
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}

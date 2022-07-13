package com.wuwj.wdxm.mapper;

import com.wuwj.wdxm.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description 用户模块数据库操作
 * @Date 2022-07-08 11:30
 */
@Mapper
public interface UserMapper {

    List<User> findAll();
}

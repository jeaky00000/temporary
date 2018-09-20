package com.example.demo.mapper;

import com.example.demo.model.User;

import java.util.List;



public interface UserMapper {
    List<User> selectAllUser();

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
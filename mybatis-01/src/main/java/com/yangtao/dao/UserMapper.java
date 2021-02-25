package com.yangtao.dao;

import com.yangtao.pojo.User;

import java.util.List;

/**
 * @author yangtao
 * @description
 * @create 2021-02-18 14:42
 */
public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}

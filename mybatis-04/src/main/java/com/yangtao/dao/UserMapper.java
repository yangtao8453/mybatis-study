package com.yangtao.dao;

import com.yangtao.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author yangtao
 * @description
 * @create 2021-02-18 14:42
 */
public interface UserMapper {

    User getUserById(int id);

    List<User> getUserByLimit(Map<String, Integer> map);

    List<User> getUserByRowBounds();

}

package com.yangtao.dao;

import com.yangtao.pojo.User;
import org.apache.ibatis.type.Alias;

import java.util.List;
import java.util.Map;

/**
 * @author yangtao
 * @description
 * @create 2021-02-18 14:42
 */
@Alias("User")
public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    int addUser2(Map<String, Object> map);

    List<User> getUserLike(String value);

}

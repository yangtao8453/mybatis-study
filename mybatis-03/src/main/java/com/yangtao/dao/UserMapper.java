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
public interface UserMapper {



    User getUserById(int id);



}

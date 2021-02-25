package com.yangtao.dao;

import com.yangtao.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author yangtao
 * @description
 * @create 2021-02-25 15:53
 */
public interface UserMapper {

    //根据id查询用户
    User queryUserById(@Param("id") int id);

}

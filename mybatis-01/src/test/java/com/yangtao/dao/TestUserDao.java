package com.yangtao.dao;

import com.yangtao.pojo.User;
import com.yangtao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.awt.*;
import java.util.List;

/**
 * @author yangtao
 * @description
 * @create 2021-02-18 14:46
 */
public class TestUserDao {

    @Test
    public void getUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user1 = mapper.getUserById(1);
        System.out.println(user1);

        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int result = mapper.addUser(new User(4, "赵六", "123456"));
        if (result>0){
            System.out.println("添加用户成功");
        }else{
            System.out.println("添加用户失败");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void udpateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int result = mapper.updateUser(new User(4, "zhaoliu", "123456"));
        if (result>0){
            System.out.println("修改用户成功");
        }else{
            System.out.println("修改用户失败");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int result = mapper.deleteUser(4);
        if (result>0){
            System.out.println("删除用户成功");
        }else{
            System.out.println("删除用户失败");
        }

        sqlSession.commit();
        sqlSession.close();
    }

}

package com.yangtao.dao;

import com.yangtao.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yangtao
 * @description
 * @create 2021-02-23 20:20
 */
public interface TeacherMapper {

    //获取老师
    List<Teacher> getTeacher();

    //获取指定老师下所有学生及老师的信息
    Teacher getTeacher(@Param("tid") int tid);

    Teacher getTeacher2(@Param("tid") int tid);

}

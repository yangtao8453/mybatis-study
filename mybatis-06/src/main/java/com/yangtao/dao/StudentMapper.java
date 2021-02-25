package com.yangtao.dao;

import com.yangtao.pojo.Student;

import java.util.List;

/**
 * @author yangtao
 * @description
 * @create 2021-02-23 20:19
 */
public interface StudentMapper {

    //查询所有的学生信息，以及对应的老师的信息
    public List<Student> getStudent();

    public List<Student> getStudent2();

}

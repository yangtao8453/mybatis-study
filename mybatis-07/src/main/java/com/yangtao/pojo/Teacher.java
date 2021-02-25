package com.yangtao.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author yangtao
 * @description
 * @create 2021-02-23 20:18
 */
@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师拥有多个学生
    private List<Student> students;
}

package com.yangtao.pojo;

import lombok.Data;

/**
 * @author yangtao
 * @description
 * @create 2021-02-23 20:17
 */
@Data
public class Student {
    private int id;
    private String name;

    //学生关联老师
    private Teacher teacher;
}

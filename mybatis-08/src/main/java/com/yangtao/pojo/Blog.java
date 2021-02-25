package com.yangtao.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author yangtao
 * @description
 * @create 2021-02-25 9:00
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;    //属性名与字段名不一致，mybatis-config中开启驼峰命名映射
    private int views;

    public Blog(String id, String title, String author, Date createTime, int views) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.createTime = createTime;
        this.views = views;
    }
}

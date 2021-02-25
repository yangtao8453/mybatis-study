package com.yangtao.dao;

import com.yangtao.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author yangtao
 * @description
 * @create 2021-02-25 9:03
 */
public interface BlogMapper {

    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogCHOOSE(Map map);

    //更新博客
    int updateBlog(Map map);

    //查询第 1 2 3 号记录的博客
    List<Blog> queryBlogForeach(Map map);

}

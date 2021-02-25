package com.yangtao.dao;

import com.yangtao.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author yangtao
 * @description
 * @create 2021-02-23 20:20
 */
public interface TeacherMapper {

    @Select("select * from teacher where id=#{tid}")
    Teacher getTeacher(@Param("tid") int id);

}

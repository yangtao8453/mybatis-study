import com.yangtao.dao.StudentMapper;
import com.yangtao.dao.TeacherMapper;
import com.yangtao.pojo.Student;
import com.yangtao.pojo.Teacher;
import com.yangtao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author yangtao
 * @description
 * @create 2021-02-23 20:25
 */
public class MyTest {

    @Test
    public void testStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudent();
        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void testStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudent2();
        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();
    }

}

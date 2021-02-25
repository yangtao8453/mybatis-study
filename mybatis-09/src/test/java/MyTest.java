import com.yangtao.dao.UserMapper;
import com.yangtao.pojo.User;
import com.yangtao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author yangtao
 * @description
 * @create 2021-02-25 15:58
 */
public class MyTest {

    @Test
    public void test(){
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = mapper1.queryUserById(1);
        System.out.println(user1);
        sqlSession1.close();        //会话关闭，一级缓存保存到二级缓存中

        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        sqlSession2.close();

        System.out.println(user1 == user2);
    }

}

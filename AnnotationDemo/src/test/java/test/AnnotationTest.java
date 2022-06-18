package test;

import org.example.config.UserConfig;
import org.example.dao.UserDao;
import org.example.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AnnotationTest {

    UserDao userDao;

    @Before
    public void init(){
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        userDao = context.getBean("userDao", UserDao.class);
    }

    @Test
    public void testAnnotation(){
        List<User> userList = userDao.selectAll();
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}

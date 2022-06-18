package test;

import org.example.dao.UserDao;
import org.example.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateTest {

    UserDao userDao;

    @Before
    public void init(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao dao = context.getBean("userDao", UserDao.class);
        userDao = dao;
    }

    @Test
    public void testQuery(){
        List<User> userList = userDao.selectAll();
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}

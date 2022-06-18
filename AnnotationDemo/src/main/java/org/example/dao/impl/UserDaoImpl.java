package org.example.dao.impl;

import org.example.dao.UserDao;
import org.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int insert(User user) {
        String sql = "insert into user values(?,?,?)";
        int update = jdbcTemplate.update(sql, user.getId(), user.getName(), user.getAge());
        return update;
    }

    public int delete(int id) {
        String sql = "delete from user where id=?";
        int update = jdbcTemplate.update(sql, id);
        return update;
    }

    public User selectById(int id) {
        String sql = "select * from user where id=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        return user;
    }

    public List<User> selectAll() {
        String sql = "select * from user";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return userList;
    }
}

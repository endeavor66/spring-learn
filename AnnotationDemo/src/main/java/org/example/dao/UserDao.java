package org.example.dao;

import org.example.entity.User;

import java.util.List;

public interface UserDao {
    int insert(User user);
    int delete(int id);
    User selectById(int id);
    List<User> selectAll();
}

package com.example.dao;

import java.util.List;
import com.example.model.User;

public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(Integer id);
    void updateUser(User user);
    void deleteUser(Integer id);
}
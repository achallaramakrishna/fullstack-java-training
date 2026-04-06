package com.example.service;

import java.util.List;
import com.example.model.User;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(Integer id);
    void updateUser(User user);
    void deleteUser(Integer id);
}
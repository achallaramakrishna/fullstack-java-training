package com.example.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession()
                .createQuery("from User", User.class)
                .list();
    }

    @Override
    public void saveUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void deleteUser(Integer id) {
        User user = sessionFactory.getCurrentSession().get(User.class, id);
        if (user != null) {
            sessionFactory.getCurrentSession().delete(user);
        }
    }
}
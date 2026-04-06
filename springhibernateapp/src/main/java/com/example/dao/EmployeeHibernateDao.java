package com.example.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Employee;

@Repository
@Transactional
public class EmployeeHibernateDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Employee> findAll() {
        return sessionFactory
                .getCurrentSession()
                .createQuery("FROM Employee", Employee.class)
                .list();
    }

    public void save(Employee emp) {
        sessionFactory.getCurrentSession().persist(emp);
    }

    public Employee findById(Long id) {
        return sessionFactory.getCurrentSession().get(Employee.class, id);
    }
}
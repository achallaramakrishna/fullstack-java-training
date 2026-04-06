package com.example.dao;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeDao {

	void save(Employee emp);

	Employee findById(int id);

	List<Employee> findAll();

	int updateSalary(int id, double newSalary);

	int deleteById(int id);

	int countEmployees();

}

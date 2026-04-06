package com.example.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.model.BREmployee;

// this is a comment
public interface BREmployeeDao {
	
	List<BREmployee> findAll() throws SQLException ;
	
	int save(BREmployee employee) throws SQLException;
	
	int update(BREmployee employee) throws SQLException;;

	int delete(BREmployee employee) throws SQLException;
	
	BREmployee findById(int id) throws SQLException; // code ready
}

package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.model.BRUser;

public interface BRUserDao {
	
List<BRUser> findAll() throws SQLException ;
	
	int save(BRUser employee) throws SQLException;
	
	int update(BRUser employee) throws SQLException;;

	int delete(BRUser employee) throws SQLException;
	
	BRUser findById(int id) throws SQLException; // code ready
	
	BRUser checkLogin(String email, String password) throws SQLException; 

}

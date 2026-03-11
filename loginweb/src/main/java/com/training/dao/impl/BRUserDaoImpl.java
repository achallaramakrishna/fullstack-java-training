package com.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.dao.BRUserDao;
import com.training.model.BRUser;
import com.training.util.DBConnection;

public class BRUserDaoImpl implements BRUserDao {

	public List<BRUser> findAll() throws SQLException {
		
    	String sql = "select * from br_users";

		Connection connection = DBConnection.getConnection();
		List<BRUser> userList = null;
		if(connection!=null) {
			
			// get the statement
    		Statement statement = null;
    		ResultSet resultSet = null;
    		
    		userList = new ArrayList<BRUser>();
    		
    		// get the result set
    		
    		BRUser user = null;
    		
    		if(connection !=null) {
    			
    			statement = connection.createStatement();
    			resultSet = statement.executeQuery(sql);
    			while(resultSet.next()) {
    				user = new BRUser();
    				user.setUserId(0);
    				user.setFistName(resultSet.getString(2));
    				user.setLastName(resultSet.getString(3));
    				user.setUserName(resultSet.getString(4));

    				user.setUserPwd(resultSet.getString(5));

    				
    				user.setMobile(resultSet.getString(6));
    				user.setEmail(resultSet.getString(6));
    				
    				userList.add(user);
    			}
    			
    		} else {
    			System.out.println("Connection not Successful");
    		}
    	
		}
		return userList;
	}

	@Override
	public int save(BRUser user) throws SQLException {
		Connection connection = DBConnection.getConnection();
		String sql = "insert into br_users (first_name,last_name,user_name,user_pwd,mobile,email,profile_id) "
				+ "values (?,?,?,?.?)";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, user.getFistName());
		pStatement.setString(2, user.getLastName());
		pStatement.setString(3, user.getUserName());
		pStatement.setString(4, user.getUserPwd());
		pStatement.setString(5, user.getMobile());
		pStatement.setString(5, user.getEmail());
		pStatement.setInt(5, user.getProfileId());

		int rowsAffected = pStatement.executeUpdate();
		return rowsAffected;
	}

	@Override
	public int update(BRUser user) throws SQLException {
		Connection connection = DBConnection.getConnection();
		String sql = "update br_users set first_name = ? , last_name = ? , "
				+ "user_name = ?, email =?, mobile = ? "
				+ "where user_id = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, user.getFistName());
		pStatement.setString(2, user.getLastName());
		pStatement.setString(3, user.getUserName());
		pStatement.setString(4, user.getUserPwd());
		pStatement.setString(5, user.getMobile());
		pStatement.setString(6, user.getEmail());
		
		pStatement.setInt(6, user.getUserId());
		

		int rowsAffected = pStatement.executeUpdate();
		return rowsAffected;
	}

	@Override
	public int delete(BRUser user) throws SQLException {
		Connection connection = DBConnection.getConnection();
		String sql = " delete from br_users where user_id = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		
		pStatement.setInt(1, user.getUserId());
		int rowsAffected = pStatement.executeUpdate();
		return rowsAffected;}

	@Override
	public BRUser findById(int id) throws SQLException {
		Connection connection = DBConnection.getConnection();
		String sql = "select * from br_users where user_id = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setInt(1, id);
		
		ResultSet rs = pStatement.executeQuery();
		BRUser user =null;
		if(rs.next()) {
			user = new BRUser();
			user.setUserId(rs.getInt(1));;
			user.setFistName(rs.getString(2));
			user.setLastName(rs.getString(3));
			user.setUserName(rs.getString(4));
			user.setUserPwd(rs.getString(5));
			user.setMobile(rs.getString(6));
			user.setEmail(rs.getString(7));
		}
		return user;
	}

	@Override
	public BRUser checkLogin(String email, String password) throws SQLException {
		Connection connection = DBConnection.getConnection();
		String sql = "select * from br_users where email = ? and user_pwd = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, email);
		pStatement.setString(2, password);
		
		ResultSet rs = pStatement.executeQuery();
		BRUser user =null;
		if(rs.next()) {
			user = new BRUser();
			user.setUserId(rs.getInt(1));;
			user.setFistName(rs.getString(2));
			user.setLastName(rs.getString(3));
			user.setUserName(rs.getString(4));
			user.setUserPwd(rs.getString(5));
			user.setMobile(rs.getString(6));
			user.setEmail(rs.getString(7));
		}
		return user;
	}

}

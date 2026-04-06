package com.example.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	private JdbcTemplate jdbcTemplate;
	
	 public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
    }

	    private static final class EmployeeRowMapper implements RowMapper<Employee> {
	        @Override
	        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	            return new Employee(
	                rs.getInt("id"),
	                rs.getString("name"),
	                rs.getString("department"),
	                rs.getDouble("salary")
	            );
	        }
	    }

	    private static final EmployeeRowMapper ROW_MAPPER = new EmployeeRowMapper();

	@Override
	public void save(Employee emp) {
		
		String insertSql = "insert into employees (name,department,salary) values (?,?,?)";
		
		jdbcTemplate.update(insertSql, emp.getName(), emp.getDepartment(), emp.getSalary());

	}
	  @Override
	    public Employee findById(int id) {
	        String sql = "SELECT * FROM employees WHERE id = ?";
	        try {
	            return jdbcTemplate.queryForObject(sql, ROW_MAPPER, id);
	        } catch (org.springframework.dao.EmptyResultDataAccessException e) {
	            return null;
	        }
	    }

	    @Override
	    public List<Employee> findAll() {
	        String sql = "SELECT * FROM employees ORDER BY name";
	        return jdbcTemplate.query(sql, ROW_MAPPER);
	    }

	    @Override
	    public int updateSalary(int id, double newSalary) {
	        String sql = "UPDATE employees SET salary = ? WHERE id = ?";
	        return jdbcTemplate.update(sql, newSalary, id);
	    }

	    @Override
	    public int deleteById(int id) {
	        String sql = "DELETE FROM employees WHERE id = ?";
	        return jdbcTemplate.update(sql, id);
	    }

	    @Override
	    public int countEmployees() {
	        String sql = "SELECT COUNT(*) FROM employees";
	        return jdbcTemplate.queryForObject(sql, Integer.class);
	    }
	
	
	
	

}

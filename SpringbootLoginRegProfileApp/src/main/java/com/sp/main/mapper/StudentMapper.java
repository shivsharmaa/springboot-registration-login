package com.sp.main.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sp.main.bean.Student;

public class StudentMapper implements org.springframework.jdbc.core.RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		 
		Student std = new Student();
		
		
		std.setName(rs.getString("name"));
		std.setEmail(rs.getString("email"));
		std.setPassword(rs.getString("password"));
		std.setGender(rs.getString("gender"));
		std.setCity(rs.getString("city"));
		
		
		return std;
	}

}

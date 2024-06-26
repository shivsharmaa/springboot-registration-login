package com.sp.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sp.main.bean.Student;
import com.sp.main.mapper.StudentMapper;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerDao(Student std) {

		boolean status = false;
		
		String mysql_query = "INSERT INTO register values(?,?,?,?,?)";

		int count = jdbcTemplate.update(mysql_query,
				new Object[] { std.getName(), std.getEmail(), std.getPassword(), std.getGender(), std.getCity() });
		
		if(count > 0 ) {
		status = true;
			
		}else {
			status = false;
		}
		return status;
	}

}

package com.sp.main.dao;

import java.util.List;

import com.sp.main.bean.Student;

public interface LoginDao {
	
	public List<Student> loginDao(String email, String password);
}

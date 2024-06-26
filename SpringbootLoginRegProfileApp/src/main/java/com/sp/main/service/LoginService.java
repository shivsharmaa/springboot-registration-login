package com.sp.main.service;

import java.util.List;

import com.sp.main.bean.Student;

public interface LoginService {
	
	public List<Student> loginService(String email,String password);
}

package com.sp.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.main.bean.Student;
import com.sp.main.dao.LoginDao;

@Service
public class LoginServiceimpl implements LoginService{
	
	@Autowired // insert the object of implemented class
	LoginDao loginDao;
	
	@Override
	public List<Student> loginService(String email, String password) {
		
		List<Student> student_list = loginDao.loginDao(email, password);
		
		return student_list;
	}
	
	
}

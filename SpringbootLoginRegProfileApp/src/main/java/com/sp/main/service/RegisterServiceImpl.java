package com.sp.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.main.bean.Student;
import com.sp.main.dao.RegisterDao;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterDao registerDao;
	
	@Override
	public boolean registerStudent(Student std) {
		
		boolean status = registerDao.registerDao(std);
		return status;
	}

}

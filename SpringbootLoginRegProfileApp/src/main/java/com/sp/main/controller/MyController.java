package com.sp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sp.main.bean.Student;
import com.sp.main.service.LoginService;
import com.sp.main.service.RegisterService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String openHomePage() {
		
		return "home-Page";
	}
	
	@GetMapping("/homePage")
	public String openHomePagee() {
		
		return "home-Page";
	}
	
	@GetMapping("/aboutUsPage")
	public String openAboutUsPage() {
		return "about-us-page";
	}
	
	@GetMapping("/contactUsPage")
	public String openConntactusPage() {
		return "contact-us-page";
	}
	
	@GetMapping("/loginPage")
	public String openLoginPage() {
		return "login-page";
	}
	
	@GetMapping("/registerPage")
	public String openRegisterPage() {
		return "register-page";
	}
	
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/loginForm")
	public String login(@RequestParam("email1") String email, @RequestParam("pass1") String password, HttpSession session) {
		
		String page= "error-page";
		List<Student> student_list = loginService.loginService(email, password);
		
		if(student_list.size() != 0) {
			
			session.setAttribute("session_name", student_list.get(0).getName());
			session.setAttribute("session_email", student_list.get(0).getEmail());
			session.setAttribute("session_gender", student_list.get(0).getGender());
			session.setAttribute("session_city", student_list.get(0).getCity());
			
			page="profile-page";
		}else {
			
			page = "error-page";
		}
		
		return page;
	}
	
	@GetMapping("/profilePage")
	public String openProfilePage() {
		
		return "profile-page";
	}
	
	
	@GetMapping("/logoutPage")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "login-page";
	}
	
	
	@Autowired
	RegisterService registerService;
	
	@PostMapping("/regForm")
	public String register( 
						@RequestParam("name1") String name,
							@RequestParam("email1") String email,
								@RequestParam("pass1") String passowrd,
								@RequestParam("gender1") String gender,
								@RequestParam("city1") String city,
								Model model)
	{
		
		
		String page = "error-page";
		Student std = new Student();
		std.setName(name);
		std.setEmail(email);
		std.setPassword(passowrd);
		std.setGender(gender);
		std.setCity(city);
		
		boolean status = registerService.registerStudent(std);
		
		if(status) {
				model.addAttribute("model_message", "Student registered successfully!");
				model.addAttribute("model_pagename", "register");
				page = "success-page";
		}else {
			model.addAttribute("model_message", "Student not registered!");
			model.addAttribute("model_pagename", "register");
			page = "error-page";

		}
		
		
		return page;
	}
	
}


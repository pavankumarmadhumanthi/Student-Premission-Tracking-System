package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bindings.StudentLoginForm;
import com.example.serviceImpl.StudentServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceImpl studentservice;
	
	@Autowired
	private HttpSession session;
	
	@GetMapping("/studentdata")
	public String showStudentDashboard(Model model) {
		studentservice.findStudent((Integer)session.getAttribute("studentid"));
		model.addAttribute("studentdata", model);
		return "studnetdashboard";
	}
	@GetMapping("/")
	public String showIndexDashBoard(Model model) {
		return "index";
	}
	public String showStudentLoginForm(Model model) {
	return "studentloginform";
	}
	
	@PostMapping("/studentverify")
	@ResponseBody
	public String verifyStudentLogin(@RequestBody StudentLoginForm loginform) {
		return studentservice.verifyLogin(loginform.getEmail(),loginform.getPassword())?"redirect:/studentdashboard":"invalid Credintals";
		
	}
	

}

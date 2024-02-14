package com.example.service;

import java.util.List;

import com.example.entity.Student_Info;

public interface StudentService {
	public String insertStudent(Student_Info student);
	public Student_Info findStudent(Integer studentid);
	public void deleteStudent(Integer studentid);
	public List<Student_Info> findAllStudents();
	public String updatepwd();
	public String makePermission();
	public boolean verifyLogin(String email,String password);
		
	
	

}

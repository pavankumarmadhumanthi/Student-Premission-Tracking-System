package com.example.service;

import java.util.List;

import com.example.entity.Admin_Info;
import com.example.entity.Counsellor_Info;
import com.example.entity.Student_Info;


public interface AdminService {
	public String addStudent(Student_Info student);
	
	public Student_Info getStudent(Integer studentid);
	public List<Student_Info> getAllStudents();
	public void deleteStudent(Integer studentid);
	public String addCounsellor(Counsellor_Info counsellor);
	public Counsellor_Info getCounsellor(Integer counsellorid);
	public List<Counsellor_Info> getAllCounsellors();
	public void deleteCounsellor(Integer counsellorid);
	public String addAdmin(Admin_Info admin);
	public String verifyLogin();

}

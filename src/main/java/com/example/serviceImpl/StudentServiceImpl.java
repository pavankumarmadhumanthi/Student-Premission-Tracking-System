package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Student_Info;
import com.example.repositories.StudentRepo;
import com.example.service.StudentService;

import jakarta.servlet.http.HttpSession;

public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepo studentrepo;
	
	@Autowired
	private HttpSession session;

	@Override
	public String insertStudent(Student_Info student) {
		return studentrepo.save(student)!=null?"Success":"failed";		
	}

	@Override
	public Student_Info findStudent(Integer studentid) {
		Optional<Student_Info> findById = studentrepo.findById(studentid);
		return findById.isPresent()?findById.get():null;
	}

	@Override
	public void deleteStudent(Integer studentid) {
		studentrepo.deleteById(studentid);
	}

	@Override
	public List<Student_Info> findAllStudents() {
		return studentrepo.findAll();
	}

	@Override
	public String updatepwd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String makePermission() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifyLogin(String email,String password) {
		Student_Info student = studentrepo.findByEmailAndPassword(email,password);
		if(student!=null) {
			session.setAttribute("studentid",student.getStudentid());
		}
		return student!=null?true:false;
	}

}

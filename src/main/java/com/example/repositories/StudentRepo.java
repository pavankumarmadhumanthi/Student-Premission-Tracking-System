package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Student_Info;

public interface StudentRepo extends JpaRepository<Student_Info, Integer>{
	public Student_Info findByEmailAndPassword(String email,String password);
}

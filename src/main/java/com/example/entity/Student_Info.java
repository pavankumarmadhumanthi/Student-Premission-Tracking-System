package com.example.entity;

import java.sql.Blob;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentid;
	private String studentname;
	private Long phone;
	private String dept;
	private String email;
	private String password;
	private Date enrolled;
	private Integer counsellorid;
	private Blob photo;
}

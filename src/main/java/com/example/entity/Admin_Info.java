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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminid;
	private String name;
	private String subject;
	private String email;
	private String password;
	private Long phone;
	private Date enrolled;
	private Blob image;

}

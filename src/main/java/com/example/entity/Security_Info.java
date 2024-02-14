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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Security_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer securityid;
	private String name;
	private String subject;
	private String email;
	private String password;
	private Long phone;
	private Date enrolled;
	private Blob image;


}

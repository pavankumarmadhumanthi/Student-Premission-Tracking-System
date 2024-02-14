package com.example.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Permission_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer permissionid;
	
	private Date permissiondate;
	private String studentname;
	private Integer studentid;
	private String email;
	private Integer counsellorid;
	private String permissionstatus;
	
	

}

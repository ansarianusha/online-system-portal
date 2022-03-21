package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Users {
	
	@Id
	@GeneratedValue
	private int user_Id;
	
	private String user_Name;
	
	@Column(unique = true)
	private String user_Mail;
	
	@Column(unique = true)
	private long mobile_No;
	private String address;
	private LocalDate dob;
	private String password;

}

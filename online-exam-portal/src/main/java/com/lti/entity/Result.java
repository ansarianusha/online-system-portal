package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Result {
	@Id
	@GeneratedValue
	private int result_Id;
	
	private String status;
	private double score;
	private int rlevel;
	@ManyToOne
	@JoinColumn(name="subject_Id")
	private Subject subject1;
	
	@OneToOne
	@JoinColumn(name="user_Id")
	private Users users;

	public int getResult_Id() {
		return result_Id;
	}

	public void setResult_Id(int result_Id) {
		this.result_Id = result_Id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getRlevel() {
		return rlevel;
	}

	public void setRlevel(int rlevel) {
		this.rlevel = rlevel;
	}

	public Subject getSubject() {
		return subject1;
	}

	public void setSubject(Subject subject) {
		this.subject1 = subject;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
	


}

package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Subject {
	@Id
	@GeneratedValue
	private int subject_Id;
	private String subject_Name;
	private int slevel;
	private LocalDate exam_Date;
	
	@OneToMany(mappedBy = "subject")
	List <Subject_Question> subject_question;
	
	@OneToMany(mappedBy = "subject1")
	List<Result> result;

	public int getSubject_Id() {
		return subject_Id;
	}

	public void setSubject_Id(int subject_Id) {
		this.subject_Id = subject_Id;
	}

	public String getSubject_Name() {
		return subject_Name;
	}

	public void setSubject_Name(String subject_Name) {
		this.subject_Name = subject_Name;
	}

	public int getSlevel() {
		return slevel;
	}

	public void setSlevel(int slevel) {
		this.slevel = slevel;
	}

	public LocalDate getExam_Date() {
		return exam_Date;
	}

	public void setExam_Date(LocalDate exam_Date) {
		this.exam_Date = exam_Date;
	}

	public List<Subject_Question> getSubject_question() {
		return subject_question;
	}

	public void setSubject_question(List<Subject_Question> subject_question) {
		this.subject_question = subject_question;
	}

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}
	
	

}

package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Subject_Question {
	
	@Id
	@GeneratedValue
	private int subject_Qid;
	
	@OneToOne
	@JoinColumn(name="question_Id")
	private Question question;
	
	@ManyToOne
	@JoinColumn(name="subject_Id")
	private Subject subject;

	public int getSubject_Qid() {
		return subject_Qid;
	}

	public void setSubject_Qid(int subject_Qid) {
		this.subject_Qid = subject_Qid;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	

}

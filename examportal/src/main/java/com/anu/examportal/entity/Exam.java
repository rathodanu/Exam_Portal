package com.anu.examportal.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Exam {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDgenerator")
	private String examId;
	private String studentID;
	private String questionNumber;
	private String optionMarked;
	private Date examDate;
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(String examId, String studentID, String questionNumber, String optionMarked, Date examDate) {
		super();
		this.examId = examId;
		this.studentID = studentID;
		this.questionNumber = questionNumber;
		this.optionMarked = optionMarked;
		this.examDate = examDate;
	}
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(String questionNumber) {
		this.questionNumber = questionNumber;
	}
	public String getOptionMarked() {
		return optionMarked;
	}
	public void setOptionMarked(String optionMarked) {
		this.optionMarked = optionMarked;
	}
	public Date getExamDate() {
		return examDate;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", studentID=" + studentID + ", questionNumber=" + questionNumber
				+ ", optionMarked=" + optionMarked + ", examDate=" + examDate + "]";
	}
	
	

}

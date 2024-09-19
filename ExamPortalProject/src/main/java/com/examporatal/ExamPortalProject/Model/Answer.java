package com.examporatal.ExamPortalProject.Model;

import javax.persistence.Entity;


public class Answer {
	
	int qno;
	private String qtext;
	private String submittedanswer;
	private String correctanswer;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int qno, String qtext, String submittedanswer, String correctanswer) {
		super();
		this.qno = qno;
		this.qtext = qtext;
		this.submittedanswer = submittedanswer;
		this.correctanswer = correctanswer;
	}
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQtext() {
		return qtext;
	}
	public void setQtext(String qtext) {
		this.qtext = qtext;
	}
	public String getSubmittedanswer() {
		return submittedanswer;
	}
	public void setSubmittedanswer(String submittedanswer) {
		this.submittedanswer = submittedanswer;
	}
	public String getCorrectanswer() {
		return correctanswer;
	}
	public void setCorrectanswer(String correctanswer) {
		this.correctanswer = correctanswer;
	}
	@Override
	public String toString() {
		return "Answer [qno=" + qno + ", qtext=" + qtext + ", submittedanswer=" + submittedanswer + ", correctanswer="
				+ correctanswer + "]";
	}
	
	
	

}

package com.examporatal.ExamPortalProject.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question implements Serializable{
	@Id
	private String qno;
	private String qtext;
	private String op1;
	private String op2;
	private String op3;
	private String op4;
	private String answer;
	@Id
	private String subject;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String qno, String qtext, String op1, String op2, String op3, String op4, String answer,
			String subject) {
		super();
		this.qno = qno;
		this.qtext = qtext;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.op4 = op4;
		this.answer = answer;
		this.subject = subject;
	}
	public String getQno() {
		return qno;
	}
	public void setQno(String qno) {
		this.qno = qno;
	}
	public String getQtext() {
		return qtext;
	}
	public void setQtext(String qtext) {
		this.qtext = qtext;
	}
	public String getOp1() {
		return op1;
	}
	public void setOp1(String op1) {
		this.op1 = op1;
	}
	public String getOp2() {
		return op2;
	}
	public void setOp2(String op2) {
		this.op2 = op2;
	}
	public String getOp3() {
		return op3;
	}
	public void setOp3(String op3) {
		this.op3 = op3;
	}
	public String getOp4() {
		return op4;
	}
	public void setOp4(String op4) {
		this.op4 = op4;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Question [qno=" + qno + ", qtext=" + qtext + ", op1=" + op1 + ", op2=" + op2 + ", op3=" + op3 + ", op4="
				+ op4 + ", answer=" + answer + ", subject=" + subject + "]";
	}
	
	
	

}

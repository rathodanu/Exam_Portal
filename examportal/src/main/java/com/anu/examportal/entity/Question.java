package com.anu.examportal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	private String questionNumber;
	private String question;
	private String optionA;
	private String optionB;
	private String optionc;
	private String optionD;
	private String answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String questionNumber, String question, String optionA, String optionB, String optionc,
			String optionD, String answer) {
		super();
		this.questionNumber = questionNumber;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionc = optionc;
		this.optionD = optionD;
		this.answer = answer;
	}
	public String getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(String questionNumber) {
		this.questionNumber = questionNumber;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionc() {
		return optionc;
	}
	public void setOptionc(String optionc) {
		this.optionc = optionc;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [questionNumber=" + questionNumber + ", question=" + question + ", optionA=" + optionA
				+ ", optionB=" + optionB + ", optionc=" + optionc + ", optionD=" + optionD + ", answer=" + answer + "]";
	}
	
	
	
	

}

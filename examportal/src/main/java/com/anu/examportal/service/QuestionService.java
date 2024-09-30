package com.anu.examportal.service;

import com.anu.examportal.entity.Question;

public interface QuestionService {

    Question addQuestion(Question question);

    Question getQuestion(String questionNumber);
}

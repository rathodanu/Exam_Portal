package com.anu.examportal.service;

import com.anu.examportal.ExamportalApplication;
import com.anu.examportal.entity.Exam;

public interface ExamService {

    Exam addExam(Exam exam) throws Exception;

    Exam updateExam(Exam exam) throws Exception;
}

package com.anu.examportal.service.serviceImpl;

import com.anu.examportal.Validator.ExamValidator;
import com.anu.examportal.dao.ExamRepository;
import com.anu.examportal.entity.Exam;
import com.anu.examportal.service.ExamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    ExamRepository examRepository;

    @Autowired
    ExamValidator examValidator;



    @Override
    public Exam addExam(Exam exam) throws Exception {
        examValidator.validateExam(exam);
      return  examRepository.save(exam);

    }

    @Override
    public Exam updateExam(Exam exam) throws Exception {
        examValidator.validateExam(exam);
      boolean exist= examRepository.existsById(exam.getExamId());
      if (exist){
          return examRepository.save(exam);
      }
      return null;
    }
}

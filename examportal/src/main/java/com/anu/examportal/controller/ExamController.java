package com.anu.examportal.controller;
import com.anu.examportal.entity.Exam;
import com.anu.examportal.dto.ResponseDto;
import com.anu.examportal.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/examController")
public class ExamController {

    @Autowired
    ExamService examService;

    @PostMapping("/add")
    public Exam addExam(@RequestBody Exam exam) throws Exception {
        Exam savedExam = examService.addExam(exam);
        if(null!=savedExam){
            return savedExam;
        }
        return null;
    }

    public ResponseDto updateExam(@RequestBody Exam exam) throws Exception {
        Exam updatedExam=examService.updateExam(exam);
        if(null!=exam){
            return new ResponseDto(true,updatedExam,"updated Successfully ");
        }
        return new ResponseDto(false,updatedExam," unable to update");
    }


}

package com.anu.examportal.controller;

import com.anu.examportal.dto.AnswerSheetDto;
import com.anu.examportal.dto.ResponseDto;
import com.anu.examportal.dto.ResultDto;
import com.anu.examportal.entity.Student;
import com.anu.examportal.service.ResultService;
import com.anu.examportal.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentController")
public class StudentController {


    @Autowired
    StudentService studentService;

    @Autowired
    ResultService resultService;


    @PostMapping("/insertstudent")
    public ResponseDto insertdata(@RequestBody Student student) {
        Student savedStudent = studentService.insertStudent(student);
        if (null != savedStudent) {
            return new ResponseDto(true,savedStudent,"saved Successfully ");
        }
        return new ResponseDto(false,null,"unable to save");
    }

    @PutMapping("/updatestudent")
    public ResponseDto updatedata(@RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(student);
        if (null!= updatedStudent){
            return new ResponseDto(true,updatedStudent,"updated Successfully ");
        }
        return new ResponseDto(false,null,"unable to update ");


    }

    @DeleteMapping("/deletestudent/{studentId}")
    public ResponseDto deletedata(@PathVariable("studentId") String studentId) {
        Boolean isdeleted = studentService.deleteStudent(studentId);
        if(isdeleted){
            return new ResponseDto(true,isdeleted,"deleted successfully");
        }
        return new ResponseDto(false,null,"unable to delete");

    }

    @GetMapping("/getstudent/{studentId}")
    public ResponseDto getdata(@PathVariable("studentId") String studentId) {
        Student student = studentService.getStudent(studentId);
        if(null != student){
            return new ResponseDto(true,student,"data retrieved successfully ");
        }
        return new ResponseDto(false,null,"data not found ");
    }


    @GetMapping("/getResultData")
    public ResultDto getResultData(@RequestBody List<AnswerSheetDto> answerSheetDtoList) {
        ResultDto result = resultService.getResult(answerSheetDtoList);
        return result;
    }
}

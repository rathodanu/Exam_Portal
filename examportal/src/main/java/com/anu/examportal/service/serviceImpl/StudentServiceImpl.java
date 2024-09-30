package com.anu.examportal.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anu.examportal.dao.StudentRepository;
import com.anu.examportal.entity.Student;
import com.anu.examportal.service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentRepository studentRepository;


    @Override
    public Student insertStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        boolean exists = studentRepository.existsById(student.getStudentId());
        if (exists) {
            return studentRepository.save(student);
        }
        return null;
    }

    @Override
    public Boolean deleteStudent(String studentId) {

        boolean exists = studentRepository.existsById(studentId);
        if (exists) {
            studentRepository.deleteById(studentId);
            return true;
        }
        return false;
    }

    @Override
    public Student getStudent(String studentId) {
        return studentRepository.findByStudentId(studentId);
    }

}

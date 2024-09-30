package com.anu.examportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anu.examportal.entity.Exam;

public interface ExamRepository extends JpaRepository<Exam,String> {


}

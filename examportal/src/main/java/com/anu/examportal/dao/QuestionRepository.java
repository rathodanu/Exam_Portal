package com.anu.examportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anu.examportal.entity.Question;

public interface QuestionRepository extends JpaRepository<Question,String> {
}

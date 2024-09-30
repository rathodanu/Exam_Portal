package com.anu.examportal.service.serviceImpl;

import com.anu.examportal.dto.AnswerSheetDto;
import com.anu.examportal.dto.ResultDto;
import com.anu.examportal.entity.Question;
import com.anu.examportal.service.QuestionService;
import com.anu.examportal.service.ResultService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {


    @Autowired
    QuestionService questionService;


    @Override
    public ResultDto getResult(List<AnswerSheetDto> answerSheetDtoList) {

        int marksObtained=0;
        ResultDto resultDto =new ResultDto();
        for ( AnswerSheetDto a:answerSheetDtoList) {

            Question question = questionService.getQuestion(a.getQuestioNumber());
            if(a.getOptionMarked().equals(question.getAnswer())){
                marksObtained+=2;
            }

        }
        resultDto.setMarkObtained(marksObtained);
        resultDto.setTotal(answerSheetDtoList.size()*2);
        resultDto.setStudentId(answerSheetDtoList.get(0).getStudentId());
        resultDto.setExamId(answerSheetDtoList.get(0).getExamId());

        return resultDto;
    }
}

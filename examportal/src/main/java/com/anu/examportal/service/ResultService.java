package com.anu.examportal.service;

import java.util.List;

import com.anu.examportal.dto.AnswerSheetDto;
import com.anu.examportal.dto.ResultDto;

public interface ResultService {



    ResultDto getResult(List<AnswerSheetDto> answerSheetDtoList);
}

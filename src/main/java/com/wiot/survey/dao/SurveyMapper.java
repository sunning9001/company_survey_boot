package com.wiot.survey.dao;

import com.wiot.survey.core.Mapper;
import com.wiot.survey.model.Survey;
import com.wiot.survey.model.SurveyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyMapper extends Mapper<Survey> {
    long countByExample(SurveyExample example);

    int deleteByExample(SurveyExample example);

    List<Survey> selectByExample(SurveyExample example);

    int updateByExampleSelective(@Param("record") Survey record, @Param("example") SurveyExample example);

    int updateByExample(@Param("record") Survey record, @Param("example") SurveyExample example);
}
package com.wiot.survey.service.impl;

import com.wiot.survey.dao.SurveyMapper;
import com.wiot.survey.model.Survey;
import com.wiot.survey.service.SurveyService;
import com.wiot.survey.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/14.
 */
@Service
@Transactional
public class SurveyServiceImpl extends AbstractService<Survey> implements SurveyService {
    @Resource
    private SurveyMapper surveyMapper;

}

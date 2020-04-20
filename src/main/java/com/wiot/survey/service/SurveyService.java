package com.wiot.survey.service;
import com.wiot.survey.model.Survey;

import java.util.List;

import com.wiot.survey.core.Service;


/**
 * Created by CodeGenerator on 2020/04/16.
 */
public interface SurveyService extends Service<Survey> {

	public List<Survey> queryByExample(Survey survey);
}

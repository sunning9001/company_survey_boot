package com.wiot.survey.service.impl;

import com.wiot.survey.dao.SurveyMapper;
import com.wiot.survey.model.Survey;
import com.wiot.survey.model.SurveyExample;
import com.wiot.survey.service.SurveyService;

import tk.mybatis.mapper.entity.Example;

import com.wiot.survey.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2020/04/16.
 */
@Service
@Transactional
public class SurveyServiceImpl extends AbstractService<Survey> implements SurveyService {
	@Resource
	private SurveyMapper surveyMapper;

	@Override
	public List<Survey> queryByExample(Survey survey) {

		SurveyExample example = new SurveyExample();
		if (survey.getCompanyname() != null)
			example.or().andCompanynameLike(survey.getCompanyname());
		if (survey.getCompanyinfo() != null)
			example.or().andCompanyinfoLike(survey.getCompanyinfo());
		if (survey.getLinkname() != null)
			example.or().andLinknameLike(survey.getLinkname());
		if (survey.getBusinessname() != null)
			example.or().andBusinessnameLike(survey.getBusinessname());
		return this.surveyMapper.selectByExample(example);
	}

}

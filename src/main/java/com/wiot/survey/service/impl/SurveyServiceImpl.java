package com.wiot.survey.service.impl;

import com.wiot.survey.dao.SurveyMapper;
import com.wiot.survey.model.Survey;
import com.wiot.survey.model.SurveyExample;
import com.wiot.survey.service.SurveyService;

import tk.mybatis.mapper.entity.Example;

import com.wiot.survey.core.AbstractService;

import org.apache.commons.lang3.StringUtils;
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
		if (!StringUtils.isBlank(survey.getCompanyname()))
			example.or().andCompanynameLike(survey.getCompanyname());
		if (!StringUtils.isBlank(survey.getCompanyinfo()))
			example.or().andCompanyinfoLike(survey.getCompanyinfo());
		if (!StringUtils.isBlank(survey.getLinkname() ))
			example.or().andLinknameLike(survey.getLinkname());
		if (!StringUtils.isBlank(survey.getBusinessname() ))
			example.or().andBusinessnameLike(survey.getBusinessname());
		if(example.getOredCriteria().size() > 0) {
			return this.surveyMapper.selectByExample(example);
		}
		return this.surveyMapper.selectAll();
	}

}

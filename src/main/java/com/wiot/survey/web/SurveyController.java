package com.wiot.survey.web;
import com.wiot.survey.core.Result;
import com.wiot.survey.core.ResultGenerator;
import com.wiot.survey.model.Survey;
import com.wiot.survey.service.SurveyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/14.
*/
@RestController
@RequestMapping("/survey")
public class SurveyController {
	private Logger logger =LoggerFactory.getLogger(SurveyController.class);
    @Resource
    private SurveyService surveyService;

    @PostMapping("/add")
    public Result add(Survey survey) {
    	
    	logger.debug("SurveyController  survey  add");
        surveyService.save(survey);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        surveyService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Survey survey) {
        surveyService.update(survey);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Survey survey = surveyService.findById(id);
        return ResultGenerator.genSuccessResult(survey);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Survey> list = surveyService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

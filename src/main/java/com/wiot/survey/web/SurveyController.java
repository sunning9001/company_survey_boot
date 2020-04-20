package com.wiot.survey.web;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wiot.survey.core.Result;
import com.wiot.survey.core.ResultGenerator;
import com.wiot.survey.model.Survey;
import com.wiot.survey.model.User;
import com.wiot.survey.service.SurveyService;
import com.wiot.survey.util.MapUtil;
import com.wiot.survey.util.PageQuery;
import com.wiot.survey.util.SurveyConfig;

/**
 * Created by CodeGenerator on 2020/04/14.
 */
@RestController
@RequestMapping("/survey")
public class SurveyController {
	private Logger logger = LoggerFactory.getLogger(SurveyController.class);
	@Resource
	private SurveyService surveyService;

	@Autowired
	private MapUtil mapUtil;

	@PostMapping("/add")
	public Result add(Survey survey) {

		logger.debug("SurveyController  survey  add");
		surveyService.save(survey);
		return ResultGenerator.genSuccessResult();
	}

	@PostMapping("/getLocationAddress")
    public Result add(Tude tude) {
		try {
			String  address=mapUtil.getAddress(tude.getLatitude(), tude.getLongitude());
			return ResultGenerator.genSuccessResult(address);
		} catch (Exception e) {
			ResultGenerator.genFailResult(e.getMessage());
		}
		return ResultGenerator.genFailResult("获取位置失败");
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

     @PostMapping("/search")
    public Result searchSurvey(PageQuery<Survey> pageQuery) {
        PageHelper.startPage(pageQuery.getPage(), pageQuery.getSize());
        List<Survey> list = surveyService.queryByExample( (Survey)pageQuery.getObj(Survey.class));
    	PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

	  
	@PostMapping("/list")
	public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
		PageHelper.startPage(page, size);
		List<Survey> list = surveyService.findAll();
		PageInfo pageInfo = new PageInfo(list);
		return ResultGenerator.genSuccessResult(pageInfo);
	}
	
	@Autowired
	private  SurveyConfig  surveyConfig;

    @ResponseBody
    @RequestMapping("upload")
    public Result upload(@RequestParam(value = "file", required = false) MultipartFile file) {
    	
        String fileName = file.getOriginalFilename();
        String type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
        
        try {
			String qcFileName = writeToDisk(type,file.getBytes());
			if(qcFileName!=null) 
				return ResultGenerator.genSuccessResult(qcFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return ResultGenerator.genFailResult("上传图片失败");
    }
    //根据文件类型保存到本地硬盘
    public  String  writeToDisk(String imageType,byte[] data) {

			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
			String datePath = sdf.format(date);
			String fileName = UUID.randomUUID().toString()+"."+imageType;
			String dir =surveyConfig.getImagepath() +File.separator+datePath;
			String qcFileName = dir+File.separator+fileName;
			String fileUrl = datePath +"/"+fileName;
			
			try {
			
				FileUtils.forceMkdir(new File(dir));
				FileUtils.writeByteArrayToFile(new File(qcFileName), data);
				return fileUrl;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
    	
    }

 
}

package com.wiot.survey.web;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.wiot.survey.model.User;
import com.wiot.survey.service.UserService;

/**
* Created by CodeGenerator on 2020/04/14.
*/
@RestController
@RequestMapping("/user")
public class UserController {
	private Logger  logger =LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public Result add(User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    
  
 
    private static final String PROJECT_PATH = System.getProperty("user.dir");//项目在硬盘上的基础路径

    private static final String RESOURCES_PATH = "/src/main/resources/static/";//资源文件路径
    
    
	    @ResponseBody
	    @RequestMapping("upload")
	    public Result upload(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file) {
	        System.out.println("执行upload");
	        try {
				request.setCharacterEncoding("UTF-8");
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        logger.info("执行图片上传");
	        String user = request.getParameter("user");
	        logger.info("user:"+user);
	        if(!file.isEmpty()) {
	            logger.info("成功获取照片12");
	            String fileName = file.getOriginalFilename();
	            String path = null;
	            String type = null;
	            type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
	            logger.info("图片初始名称为：" + fileName + " 类型为：" + type);
	            if (type != null) {
	                if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
	                    // 项目在容器中实际发布运行的根路径
	                    String realPath = "d:";
	                    // 自定义的文件名称
	                    String trueFileName = String.valueOf(System.currentTimeMillis()) + "."+type;
	                    // 设置存放图片文件的路径
	                    path =  PROJECT_PATH+RESOURCES_PATH  + trueFileName;
	                    logger.info("存放图片文件的路径:" + path);
	                    try {
							file.transferTo(new File(path));
						} catch (IllegalStateException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                    logger.info("文件成功上传到指定目录下");
	                    return ResultGenerator.genSuccessResult("http://localhost:8080/1586851724002.jpg");
	                }else {
	                    logger.info("不是我们想要的文件类型,请按要求重新上传");
	                    return ResultGenerator.genFailResult("error");
	                }
	            }else {
	                logger.info("文件类型为空");
	                return ResultGenerator.genFailResult("error");
	            }
	        }else {
	            logger.info("没有找到相对应的文件");
	            return ResultGenerator.genFailResult("error");
	        }
	    }
	 
}

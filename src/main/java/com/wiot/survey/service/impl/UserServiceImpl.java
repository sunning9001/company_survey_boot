package com.wiot.survey.service.impl;

import com.wiot.survey.dao.UserMapper;
import com.wiot.survey.model.User;
import com.wiot.survey.service.UserService;
import com.wiot.survey.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/16.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}

package com.jqq.service.impl;

import com.jqq.dao.UserDao;
import com.jqq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
/*
    //get方法数据注入
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
*/

//Spring注解方式

    @Autowired
    @Qualifier("userDao")

    private UserDao userDao;


    public void UserDemo() {
        userDao.save();
    }


}

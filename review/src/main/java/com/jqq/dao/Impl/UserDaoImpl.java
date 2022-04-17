package com.jqq.dao.Impl;

import com.jqq.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDaoImpl implements UserDao {


    public void save() {
        System.out.println("我是Save");
    }
}

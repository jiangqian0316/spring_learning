package com.jqq.Factory;

import com.jqq.dao.Impl.UserDaoImpl;

import com.jqq.dao.UserDao;

public class StaticFactory {

    public static UserDao getUserDao(){

        return new UserDaoImpl();

    }
}

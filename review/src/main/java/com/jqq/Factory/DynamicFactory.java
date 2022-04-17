package com.jqq.Factory;

import com.jqq.dao.Impl.UserDaoImpl;
import com.jqq.dao.UserDao;

public class DynamicFactory {

    public  UserDao getUserDao(){

        return new UserDaoImpl();

    }
}

package com.jqq.dao.Impl;


import com.jqq.Factory.DynamicFactory;
import com.jqq.Factory.StaticFactory;
import com.jqq.dao.UserDao;
import com.jqq.test.Injection;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class   UserDaoTest {

    @Test
    public void userDaoTest(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
        System.out.println(userDao);
        System.out.println(userDao2);
        //StaticFactory.getUserDao(); //工厂静态方法
       /* DynamicFactory dynamicFactory= new DynamicFactory();
        dynamicFactory.getUserDao(); //工厂实例方法*/


    }

    @Test
    public void Injection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         Injection injection = applicationContext.getBean(Injection.class);
         injection.test();
    }

    @Test
    //测试Spring容器产生对象源
    public void test() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
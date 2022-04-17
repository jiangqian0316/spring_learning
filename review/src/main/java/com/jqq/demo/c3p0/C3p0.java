package com.jqq.demo.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;

public class C3p0 {
    public static void main(String[] args) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://124.223.155.157:3306/blog?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai");
        dataSource.setUser("blog");
        dataSource.setPassword("jianqqian");
        Connection connection = dataSource.getConnection();
        System.out.println("connection:"+connection);
        connection.close();
    }
}

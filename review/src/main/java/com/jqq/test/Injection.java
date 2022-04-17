package com.jqq.test;

import com.jqq.dao.UserDao;
import com.jqq.date.User;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Injection {
    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void test(){
        System.out.println(stringList);
        System.out.println(userMap);
        System.out.println(properties);
    }
}

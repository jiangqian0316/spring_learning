package com.jqq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//把此类注解为Spring的配置类
@Configuration

//<context:component-scan base-package="com.jqq"/> 组件扫描
@ComponentScan("com.jqq")



public class SpringConfiguration {


}

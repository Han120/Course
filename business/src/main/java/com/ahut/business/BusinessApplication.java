package com.ahut.business;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.ahut")
@MapperScan("com.ahut.server.mapper")
public class BusinessApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessApplication.class);

    public static void main(String[] args) {
        SpringApplication application=new SpringApplication(BusinessApplication.class);
        Environment environment=application.run(args).getEnvironment();
        LOGGER.info("启动成功");
        LOGGER.info("Business地址：\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
    }
}
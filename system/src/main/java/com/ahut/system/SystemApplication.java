package com.ahut.system;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.ahut.system.mapper")
public class SystemApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemApplication.class);

    public static void main(String[] args) {
        SpringApplication application=new SpringApplication(SystemApplication.class);
        Environment environment=application.run(args).getEnvironment();
        LOGGER.info("启动成功");
        LOGGER.info("System地址：\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
    }
}

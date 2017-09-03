package com.example.SpringBootDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@MapperScan("com.example.SpringBootDemo.dao")
@EnableTransactionManagement(proxyTargetClass = false,mode = AdviceMode.ASPECTJ)
@SpringBootApplication
@PropertySource("")
@EnableLoadTimeWeaving
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringBootDemoApplication.class);
//        springApplication.setWebEnvironment(true);
//        springApplication.setApplicationContextClass();
//        springApplication.addListeners(new ApplicationReadyEventListener());
        springApplication.setAddCommandLineProperties(true);
        springApplication.run(args);
    }

}

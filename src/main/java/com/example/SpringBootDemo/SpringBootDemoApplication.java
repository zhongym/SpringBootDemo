package com.example.SpringBootDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@MapperScan("com.example.SpringBootDemo.dao")
@EnableTransactionManagement
@SpringBootApplication
public class SpringBootDemoApplication {
//	@Bean
//	public PlatformTransactionManager txManager(DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}

	@Bean
	public ObjectMapper objectMapper(){
		System.out.println("objectMapper()");
		return new ObjectMapper();
	}

	@Bean
	public HttpMessageConverter httpMessageConverter(){
		System.out.println("httpMessageConverter()");
		return new MappingJackson2HttpMessageConverter(this.objectMapper());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}

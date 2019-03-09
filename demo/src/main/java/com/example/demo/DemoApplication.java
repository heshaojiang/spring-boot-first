package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DruidDataSourceAutoConfigure.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

package com.example.demo.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan("com.example.demo.user.mapper")
public class MybatisPlusConfig {

}

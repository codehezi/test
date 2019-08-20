package com.hezi.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.hezi.mapper")  //扫描mybatis接口
@ComponentScan(basePackages= {"com.hezi.pojo","com.hezi.controller"})
public class App {
 public static void main(String[] args) {
	 SpringApplication.run(App.class, args);
}
}

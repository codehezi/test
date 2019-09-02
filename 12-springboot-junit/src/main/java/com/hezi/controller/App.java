package com.hezi.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.hezi.Daoimpl","com.hezi.controller","com.hezi.serviceimpl"})
public class App {
 public static void main(String[] args) {
	 SpringApplication.run(App.class, args);
}
}

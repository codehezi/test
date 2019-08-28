package com.hezi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaApp {
 public static void main(String[] args) {
	 SpringApplication.run(EurekaApp.class, args);
}
}

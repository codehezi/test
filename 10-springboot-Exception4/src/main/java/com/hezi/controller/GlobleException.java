package com.hezi.controller;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Configuration
public class GlobleException {
//此异常处理的缺点，不能将异常信息显示到异常页面	
	
	@Bean
	public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
		SimpleMappingExceptionResolver bean=new SimpleMappingExceptionResolver();
		Properties mapping=new Properties();
		/*
		 * 参数一:异常全名，必须全名
		 * 参数二:跳转视图
		 */
		mapping.put("java.lang.ArithmeticException", "error1");
		mapping.put("java.lang.NullPointerException", "error2");
		
		/*
		 * 设置异常与视图映射信息
		 */
		bean.setExceptionMappings(mapping);
		
		return bean;
		
	}
}

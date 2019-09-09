package com.hezi.controller;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class GlobleException implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception e) {
		ModelAndView mv=new ModelAndView();
		if(e instanceof ArithmeticException) {
			mv.setViewName("error1");
		}
		if(e instanceof NullPointerException) {
			mv.setViewName("error2");
		}
		
		  mv.addObject("mv",e.toString());
		return mv;
	}
	
	
	
}

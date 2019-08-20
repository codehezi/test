package com.hezi.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobleException {
	/**
	 * java.lang.ArithmeticException
	 * 该方法需要返回一个ModelAndView：目的是为了可以打印出异常信息和返回指定的视图
	 * 参数Exception e：会将产生异常的对象注入到方法中
	 */
	@ExceptionHandler(value= { java.lang.ArithmeticException.class})
	public ModelAndView arithmeticException(Exception e) {
		ModelAndView mv=new ModelAndView ();
		mv.addObject("mv", e.toString());
		mv.setViewName("error1");
		return mv;
	}
	/**
	 * java.lang.NullPointerException
	 * 该方法需要返回一个ModelAndView：目的是为了可以打印出异常信息和返回指定的视图
	 * 参数Exception e：会将产生异常的对象注入到方法中
	 */
	@ExceptionHandler(value= { java.lang.NullPointerException.class})
	public ModelAndView nullPointerException(Exception e) {
		ModelAndView mv=new ModelAndView ();
		mv.addObject("mv1", e.toString());
		mv.setViewName("error2");
		return mv;
	}
}

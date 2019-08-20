package com.hezi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hezi.pojo.user;

@Controller
public class addUser {
	@RequestMapping("/add")
	public String show( String page,user user) {
         String str=null;
         str.length();
		return "list";
	}
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

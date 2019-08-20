package com.hezi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hezi.pojo.user;

@Controller
public class addUser {
	@RequestMapping("/{page}")
	public String show(@PathVariable String page,user user) {
		return page;
	}
	/*
	 * @valid 对user对象开启验证
	 * @BindingResult 封装了验证的结果 
	 */
	@RequestMapping("/save")
	public String save(@Valid user user,BindingResult result) {
		System.out.println(user); 
		if(result.hasErrors()) {
              return "add";			 
		 }
		return "index";
	}
} 

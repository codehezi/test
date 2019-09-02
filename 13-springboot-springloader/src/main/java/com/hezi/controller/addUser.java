package com.hezi.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class addUser {
	@RequestMapping("/add")
	public String show() {
		System.out.println("hi....ggg");
		return "list";
	}
} 

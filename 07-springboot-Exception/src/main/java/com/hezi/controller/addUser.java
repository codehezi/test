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
	@RequestMapping("/add")
	public String show( String page,user user) {
		int a=10/0;
		return "list";
	}
} 

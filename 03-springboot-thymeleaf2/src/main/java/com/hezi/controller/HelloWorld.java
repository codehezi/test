package com.hezi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hezi.pojo.user;

@Controller
public class HelloWorld {
    @RequestMapping("/{page}")
	public String show(@PathVariable String page,Integer id,String name){
    	 System.out.println(id+"--"+name);
    	return page;
    }   
}

package com.hezi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hezi.pojo.user;
import com.hezi.service.userService;

@Controller
public class addUser {
	@Autowired
	private userService userservice;
	
	@RequestMapping("/{page}")
	public String show(@PathVariable String page) {
		System.out.println("shuchu");
		return page;
	}
    @RequestMapping("/add")
	public String add(user u){
    	int i=this.userservice.add(u);
    	System.out.println(i);
    	 return "index";
	}
    @RequestMapping("/del")
	public String del(String id){
         int idl=Integer.parseInt(id); 	
    	int i=this.userservice.del(idl);
    	System.out.println(i);
    	 return "redirect:/selAll";
	}
    @RequestMapping("/selAll")
	public String selAll(Model m){
		List<user> list=new ArrayList<user>();
		list=userservice.selAll();
		m.addAttribute("list", list);
    	 return "index";
	}
    @RequestMapping("/update")
	public String update(Model m,user u){
		List<user> list=new ArrayList<user>();
		 userservice.update(u);
		list=userservice.selAll();
		m.addAttribute("list", list);
		System.out.println("测史成功");
    	 return "index";
	}
    @RequestMapping("/sel")
   	public String sel(Model m,Integer id){
   		user u=new user();
   		u=userservice.sel(id);
   		m.addAttribute("u", u);
       	 return "list";
   	}
} 

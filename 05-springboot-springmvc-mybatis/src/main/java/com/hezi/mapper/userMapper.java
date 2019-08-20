package com.hezi.mapper;

import java.util.List;


import com.hezi.pojo.user;
public interface userMapper { 
	int add(user u);
	 
	int del(int id);
	
	List<user> selAll();
	
	int update(user u);
	
	user sel(int id);
}

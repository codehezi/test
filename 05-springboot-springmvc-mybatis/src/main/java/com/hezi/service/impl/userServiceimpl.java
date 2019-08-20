package com.hezi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hezi.mapper.userMapper;
import com.hezi.pojo.user;
import com.hezi.service.userService;
@Service
@Transactional
public class userServiceimpl implements userService{
		@Autowired
		private userMapper usermapper;
			@Override
			public int add(user u) {
				return usermapper.add(u);
			}
			@Override
			public int del(int id) {
				return usermapper.del(id);
			}
			@Override
			public List<user> selAll() {
				return usermapper.selAll();
			}
			@Override
			public int update(user u) {
				return usermapper.update(u);
			}
			@Override
			public user sel(int id) {
				return usermapper.sel(id);
			}
			
}
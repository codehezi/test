package com.hezi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hezi.Daoimpl.userDaoimpl;

@Service
public class userServiceimpl {
    @Autowired
     private userDaoimpl userdaoimpl;
    public void saveUser() {
       this.userdaoimpl.save();
    }
	
}

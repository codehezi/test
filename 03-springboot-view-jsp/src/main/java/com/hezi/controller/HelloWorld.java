package com.hezi.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hezi.pojo.user;

@Controller
public class HelloWorld {
    @RequestMapping("/fileupload")
    @ResponseBody
	public Map<String,Object> get(MultipartFile file,HttpServletRequest req)throws Exception{
    	System.out.println(req.getServletContext().getRealPath("imge"));
    	file.transferTo(new File(req.getServletContext().getRealPath("imge"),file.getOriginalFilename()));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("msg", "ok");
		return map;
	}
    @RequestMapping("/showuser")
    public String show(Model m){
    	List<user> list=new ArrayList<user>();
    	user u=new user();
    	u.setAge(18);
    	u.setName("张三");
    	user u1=new user();
    	u1.setAge(20);
    	u1.setName("李四");
    	list.add(u);
    	list.add(u1);
    	
    	m.addAttribute("list", list);
    	return "hello";
    }
    
}

package com.hezi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
   @RequestMapping("/test")
	public String test() {
	   int a=10/0;
	   return "list";
   }
}

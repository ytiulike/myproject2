package com.mySpring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	@RequestMapping("/helloWorld")
	public String helloWorld(){
		System.out.println("HelloWorld성공");
		return "helloWorld";
	}
	
	
}

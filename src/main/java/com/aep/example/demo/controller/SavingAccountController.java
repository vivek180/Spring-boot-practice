package com.aep.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SavingAccountController {
	@GetMapping(path="/hello") 
	public String dipositMoney()  
	{  
		System.out.println("--------------");
	return "Hello World welcome to spring-boot session";  
	}  
	}  



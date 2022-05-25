package com.cos.reflect.controller;

import com.cos.reflect.anno.RequestMapping;
import com.cos.reflect.dto.JoinDto;
import com.cos.reflect.dto.LoginDto;

public class UserController {
	
	@RequestMapping("/join")
	public String join(JoinDto dto) { // username, password, email
		System.out.println("username : " + dto.getUsername());
		System.err.println("password : " + dto.getPassword());
		return "/";
	}
	
	@RequestMapping("/login")
	public String login(LoginDto dto) { // username, password
		return "/";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "/";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "/";
	}
}

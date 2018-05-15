package com.bhagyesh.springbootheroku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello Spring Boot Heroku!";
	}
}

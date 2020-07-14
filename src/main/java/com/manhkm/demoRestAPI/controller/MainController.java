package com.manhkm.demoRestAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome to first Spring Boot Demo";
	}
	@RequestMapping("/home")
	public String index() {
		return "index";
	}
	@RequestMapping("/home1")
	public String index1() {
		return "index1";
	}
	@RequestMapping("/home2-nothing")
	public String index2() {
		return "index2";
	}
}


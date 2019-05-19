package com.cgboa.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class PageController {

	@RequestMapping("home")
	public String doHome() {
		return "home/home";
	}
	
}

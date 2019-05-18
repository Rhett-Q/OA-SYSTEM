package com.cgboa.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class UserController {
	
	@RequestMapping("usermanage")
	public String doUserManage() {
		return "user/usermanage";
	}
	
}

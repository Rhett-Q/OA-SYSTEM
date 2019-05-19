package com.cgboa.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class PlanController {

	@RequestMapping("planview")
	public String doPlanView(){
		return "plan/planview";
	}
	
	
	
}

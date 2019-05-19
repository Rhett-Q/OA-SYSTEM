package com.cgboa.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cgboa.sys.entity.SysUser;
import com.cgboa.sys.service.SysUserService;

@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("index")
	public String doIndex(Model model) {
		SysUser sysUser = sysUserService.findObjectByUserId(1);
		model.addAttribute("user", sysUser);
		return "index/index";
	}
	
	
}	

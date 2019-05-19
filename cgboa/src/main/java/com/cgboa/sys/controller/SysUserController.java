package com.cgboa.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cgboa.sys.entity.SysUser;
import com.cgboa.sys.service.SysUserService;

@RequestMapping("/")
@Controller
public class SysUserController {
	
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("usermanage")
	public String doUserManage(Model model) {
		
		return "user/usermanage";
	}
	
}

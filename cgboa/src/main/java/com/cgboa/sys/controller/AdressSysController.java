package com.cgboa.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdressSysController {

	@RequestMapping("addrmanage")
	public String addrmanage() {
		return "address/addrmanage";
	}
}

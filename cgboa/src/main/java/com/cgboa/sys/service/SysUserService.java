package com.cgboa.sys.service;

import com.cgboa.sys.entity.SysUser;

public interface SysUserService {
	
	SysUser findObjectByUserId(Integer userId);
	
}

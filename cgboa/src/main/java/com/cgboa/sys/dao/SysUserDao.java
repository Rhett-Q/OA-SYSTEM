package com.cgboa.sys.dao;

import com.cgboa.sys.entity.SysUser;

public interface SysUserDao {
	
	SysUser findObjectByUserId(Integer userId);
	
}

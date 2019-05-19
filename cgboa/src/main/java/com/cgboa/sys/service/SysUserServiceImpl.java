package com.cgboa.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgboa.sys.dao.SysUserDao;
import com.cgboa.sys.entity.SysUser;
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserDao sysUserDao;
	
	@Override
	public SysUser findObjectByUserId(Integer userId) {
		return sysUserDao.findObjectByUserId(userId);
	}

}

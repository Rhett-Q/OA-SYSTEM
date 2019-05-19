package com.cgboa.sys.plan;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cgboa.sys.dao.PlanDao;

public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanDao planDao;
	
	@Override
	public int deleteObjects(Integer... ids) {
		if(ids==null||ids.length==0)
		throw new IllegalArgumentException("请选择");
		int rows;
		try {
			rows = planDao.deleteObjects(ids);
		} catch (Throwable e) {
			e.printStackTrace();
			throw new ServiceException("系统正在维护中");
		}
		
		if(rows==0)
		throw new ServiceException("该记录可能已不存在");

		return rows;
	}

}

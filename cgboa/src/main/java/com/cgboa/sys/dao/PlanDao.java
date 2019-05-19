package com.cgboa.sys.dao;

import org.apache.ibatis.annotations.Param;

public interface PlanDao {

	
	int deleteObjects(@Param("ids")Integer...id);
}

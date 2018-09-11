package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.Objective;
import edu.njxzc.tcs.bean.SchoolSystemDegree;
import edu.njxzc.tcs.bean.SchoolSystemDegreeExample;

public interface SchoolsysDegreeService {
	int addSchoolsysDegree(SchoolSystemDegree ssd);//添加学制学位

	int updateSchoolsysDegree(SchoolSystemDegree ssd);//修改学制学位
	
	//根据培养方案创建年份查询学制学位
	List<SchoolSystemDegree> selectByExample(SchoolSystemDegreeExample example);
	
	// 根据培养方案id查询学制学位
	SchoolSystemDegree SelectSSDByCultivationId(Integer culId);
}

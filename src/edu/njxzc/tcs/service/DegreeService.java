package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.Degree;


public interface DegreeService {
	
	// 查询所有学位
    List<Degree> SelectAllDegrees();
    
    // 根据id查找该学位
    Degree getByID(int id);
}

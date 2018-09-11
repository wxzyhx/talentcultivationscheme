package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.SpecialityClassification;
import edu.njxzc.tcs.bean.SpecialityClassificationExample;

public interface SpecialityClassificationService {
	
	// 查询所有的专业类别
    List<SpecialityClassification> selectByExample(SpecialityClassificationExample example);
    
    // 根据id查找该专业类别
    SpecialityClassification selectByPrimaryKey(Integer speciaclassid);
}

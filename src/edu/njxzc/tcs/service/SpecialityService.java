package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.Speciality;
import edu.njxzc.tcs.bean.SpecialityClassification;

public interface SpecialityService {
	
	// 查询所有的专业
    List<Speciality> SelectAllSpeciality();
    
   // 根据专业类别查询相关专业
    List<Speciality> SelectSpecialitiesByClassificationId(Integer classificationId);
    
    // 根据id查找该专业
    Speciality getByID(int id);
}

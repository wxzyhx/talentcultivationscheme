package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.CourseClassification;
import edu.njxzc.tcs.bean.CourseClassificationExample;


public interface CourseClassificationService {
	
	// 查询所有的课程类别
    List<CourseClassification> SelectAllCourseClassification();
    
	// 根据条件查询课程类别
    List<CourseClassification> SelectCourseClassificationByExample(CourseClassificationExample example);
    
    // 根据id查找该课程类别
    CourseClassification getByID(int id);
}

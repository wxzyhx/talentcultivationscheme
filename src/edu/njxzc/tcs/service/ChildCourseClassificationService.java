package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.ChildCourseClassification;

public interface ChildCourseClassificationService {

   //  根据父课程类别描述查询子课程类别
    List<ChildCourseClassification> selectByClassificationDesc(String courseclassifcationdesc);
    
    // 根据id查找该子课程类别
    ChildCourseClassification getByID(int id);
    
}

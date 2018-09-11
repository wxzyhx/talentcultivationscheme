package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.Course;
import edu.njxzc.tcs.bean.CourseExample;
import edu.njxzc.tcs.bean.GenenalCourse;
import edu.njxzc.tcs.bean.GenenalCourseExample;
import edu.njxzc.tcs.bean.genenalCourseCultivationScheme;
import edu.njxzc.tcs.bean.genenalCourseCultivationSchemeExample;

/**
 * created by 2018-06-26 
 * added method of SelectGenenalCourseByClassificationId  at 2018-07-10
 * @author wxz
 *
 */
public interface CourseService {
	
	// 查询所有的课程
    List<Course> SelectAllCourses();
    
   // 根据培养方案查询课程列表
    List<Course> SelectCourseByCultivationId(CourseExample example);
    
    // 根据id查找课程
    Course getByID(int id);
    
    //保存课程
     int addCourse(Course course);
    
   //修改课程
     int updateCourse(Course course);
     
     //删除课程
     int DelCourse(Integer id);
     
     // 根据课程类别查询通识课程列表
     List<GenenalCourse> SelectGenenalCourseByClassificationId(GenenalCourseExample example);
     
  // 根据通识课程id查询通识课程
    GenenalCourse SelectGenenalCourseByGenCourseId(Integer coursid);
    
     // 保存选中的通识课程列表
     int addGenenalCourse(List<genenalCourseCultivationScheme> itemList);
     
     // 根据培养方案id查询培养方案关联通识课程列表
     List<genenalCourseCultivationScheme> SelectGenCourseCulByCulId(genenalCourseCultivationSchemeExample example);
     
     //删除已关联的通识课程
     int DelGenCourse(Integer cultivationid,Integer id);
}

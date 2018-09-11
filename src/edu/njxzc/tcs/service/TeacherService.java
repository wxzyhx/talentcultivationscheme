package edu.njxzc.tcs.service;


import java.util.List;

import edu.njxzc.tcs.bean.Teacher;

public interface TeacherService {
	
	Teacher getByID(Integer id);
	
	Teacher getByTeacherID(String teacher_ID);
	
	List<Teacher> getAllTeachers();
		
	List<Teacher> listByTeacherID(String teacher_ID);
	
	List<Teacher> listByName(String teacher_name);
	
}

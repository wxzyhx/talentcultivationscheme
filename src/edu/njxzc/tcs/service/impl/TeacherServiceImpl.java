package edu.njxzc.tcs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.Teacher;
import edu.njxzc.tcs.bean.TeacherExample;
import edu.njxzc.tcs.dao.TeacherMapper;
import edu.njxzc.tcs.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	TeacherMapper teacherMapper;
	/**
	 * 根据teacher表中的主键查找teacher
	 */
	@Override
	public Teacher getByID(Integer id) {
		return teacherMapper.selectByPrimaryKey(id);
	}
	
	// 查询出所有的teacher信息
	@Override
	public List<Teacher> getAllTeachers() {
		TeacherExample example = new TeacherExample();
		return teacherMapper.selectByExample(example);
	}
	
	/**
	 * 根据teacher的ID模糊查询
	 */
	@Override
	public List<Teacher> listByTeacherID(String teacher_ID) {
		TeacherExample example = new TeacherExample();
		example.createCriteria().andTeacher_IDLike("%"+teacher_ID+"%");
		if(teacherMapper.selectByExample(example).isEmpty()) {
			return null;
		}
		return teacherMapper.selectByExample(example);
	}
	/**
	 * 根据Teacher的Name的模糊查询
	 */
	@Override
	public List<Teacher> listByName(String teacher_name) {
		TeacherExample example = new TeacherExample();
		example.createCriteria().andTeacher_nameLike("%"+teacher_name+"%");
		return teacherMapper.selectByExample(example);
	}

	/**
	 * 根据teacher的id精确查询
	 */
	@Override
	public Teacher getByTeacherID(String teacher_ID) {
		TeacherExample example = new TeacherExample();
		example.createCriteria().andTeacher_IDEqualTo(teacher_ID);
		if(teacherMapper.selectByExample(example).isEmpty()) {
			return null;
		}
		return teacherMapper.selectByExample(example).get(0);
	}


}

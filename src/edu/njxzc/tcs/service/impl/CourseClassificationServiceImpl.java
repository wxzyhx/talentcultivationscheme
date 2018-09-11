package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.CourseClassification;
import edu.njxzc.tcs.bean.CourseClassificationExample;
import edu.njxzc.tcs.dao.CourseClassificationMapper;
import edu.njxzc.tcs.service.CourseClassificationService;
/**
 * 2018-06-29创建
 * @author wxz
 *
 */

@Service
public class CourseClassificationServiceImpl implements CourseClassificationService {

	@Resource
	private CourseClassificationMapper ccMapper;
	
	public CourseClassificationServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<CourseClassification> SelectAllCourseClassification() {
		// TODO Auto-generated method stub
		return ccMapper.selectByExample(null);
	}

	@Override
	public CourseClassification getByID(int id) {
		// TODO Auto-generated method stub
		return ccMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<CourseClassification> SelectCourseClassificationByExample(CourseClassificationExample example) {
		// TODO Auto-generated method stub
		return ccMapper.selectByExample(example);
	}

}

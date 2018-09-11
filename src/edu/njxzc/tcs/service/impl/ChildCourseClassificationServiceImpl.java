package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.ChildCourseClassification;
import edu.njxzc.tcs.dao.ChildCourseClassificationMapper;
import edu.njxzc.tcs.service.ChildCourseClassificationService;

/**
 * 2018-07-10创建
 * @author wxz
 *
 */

@Service

public class ChildCourseClassificationServiceImpl implements ChildCourseClassificationService {


	@Resource
	private ChildCourseClassificationMapper ccMapper;
	
	public ChildCourseClassificationServiceImpl() {
		// TODO Auto-generated constructor stub
	}

//  根据父课程类别描述查询子课程类别
	@Override
	public List<ChildCourseClassification> selectByClassificationDesc(String courseclassifcationdesc) {
		// TODO Auto-generated method stub
		return ccMapper.selectByClassificationDesc(courseclassifcationdesc);
	}

	@Override
	public ChildCourseClassification getByID(int id) {
		// TODO Auto-generated method stub
		return ccMapper.selectByPrimaryKey(id);
	}

}

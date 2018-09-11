package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.SpecialityClassification;
import edu.njxzc.tcs.bean.SpecialityClassificationExample;
import edu.njxzc.tcs.dao.SpecialityClassificationMapper;
import edu.njxzc.tcs.service.SpecialityClassificationService;

/**
 * 2018-06-18创建
 * @author wxz
 *
 */

@Service
public class SpecialityClassificationServiceImpl implements SpecialityClassificationService {

	public SpecialityClassificationServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Resource
	private SpecialityClassificationMapper specialityClassificationMapper;
	
	@Override
	public List<SpecialityClassification> selectByExample(SpecialityClassificationExample example) {
		// TODO Auto-generated method stub
		return specialityClassificationMapper.selectByExample(example);
	}

	@Override
	public SpecialityClassification selectByPrimaryKey(Integer speciaclassid) {
		// TODO Auto-generated method stub
		return specialityClassificationMapper.selectByPrimaryKey(speciaclassid);
	}

}

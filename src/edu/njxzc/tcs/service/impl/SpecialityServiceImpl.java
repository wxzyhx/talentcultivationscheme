package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.Speciality;
import edu.njxzc.tcs.bean.SpecialityClassification;
import edu.njxzc.tcs.dao.SpecialityMapper;
import edu.njxzc.tcs.service.SpecialityService;
/**
 * 2018-06-18创建
 * @author wxz
 *
 */

@Service
public class SpecialityServiceImpl implements SpecialityService {

	@Resource
	private SpecialityMapper specialityMapper;
	
	// 查询所有的专业
	@Override
	public List<Speciality> SelectAllSpeciality() {
		return specialityMapper.selectByExample(null);
	}

	// 根据id查找该专业
	@Override
	public Speciality getByID(int id) {
		return specialityMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Speciality> SelectSpecialitiesByClassificationId(Integer classificationId) {
		// TODO Auto-generated method stub
		return specialityMapper.selectByClassificationId(classificationId);
	}

}

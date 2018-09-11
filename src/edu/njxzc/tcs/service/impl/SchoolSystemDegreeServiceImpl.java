package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.SchoolSystemDegree;
import edu.njxzc.tcs.bean.SchoolSystemDegreeExample;
import edu.njxzc.tcs.dao.SchoolSystemDegreeMapper;
import edu.njxzc.tcs.service.SchoolsysDegreeService;

/**
 * created at 2018-06-29 by wxz
 * @author wxz
 *
 */
@Service
public class SchoolSystemDegreeServiceImpl implements SchoolsysDegreeService {

	@Resource
	private SchoolSystemDegreeMapper ssdMapper;
	
	public SchoolSystemDegreeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addSchoolsysDegree(SchoolSystemDegree ssd) {
		// TODO Auto-generated method stub
		return ssdMapper.insert(ssd);
	}

	@Override
	public int updateSchoolsysDegree(SchoolSystemDegree ssd) {
		// TODO Auto-generated method stub
		return ssdMapper.updateByPrimaryKey(ssd);
	}

	@Override
	public List<SchoolSystemDegree> selectByExample(SchoolSystemDegreeExample example) {
		// TODO Auto-generated method stub
		return ssdMapper.selectByExample(example);
	}

	@Override
	public SchoolSystemDegree SelectSSDByCultivationId(Integer culId) {
		// TODO Auto-generated method stub
		return ssdMapper.SelectSSDByCultivationId(culId);
	}

}

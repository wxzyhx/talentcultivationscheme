package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.Degree;
import edu.njxzc.tcs.bean.DegreeExample;
import edu.njxzc.tcs.dao.DegreeMapper;
import edu.njxzc.tcs.service.DegreeService;

/**
 * created at 2018-06-29 by wxz
 * @author wxz
 *
 */

@Service
public class DegreeServiceImpl implements DegreeService {

	@Resource
	private DegreeMapper degreeMapper;
	
	public DegreeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Degree> SelectAllDegrees() {
		// TODO Auto-generated method stub
		DegreeExample degreeExample=new DegreeExample();
		return degreeMapper.selectByExample(degreeExample);
	}

	@Override
	public Degree getByID(int id) {
		// TODO Auto-generated method stub
		return degreeMapper.selectByPrimaryKey(id);
	}

}

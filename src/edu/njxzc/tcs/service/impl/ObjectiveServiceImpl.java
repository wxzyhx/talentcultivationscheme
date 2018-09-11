package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.Objective;
import edu.njxzc.tcs.dao.ObjectiveMapper;
import edu.njxzc.tcs.service.ObjectiveService;

/**
 * 2018-06-24创建
 * @author wxz
 *
 */

@Service
public class ObjectiveServiceImpl implements ObjectiveService {

	@Resource
	private ObjectiveMapper objMapper;
	
	public ObjectiveServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Objective> SelectAllObjectives() {
		// TODO Auto-generated method stub
		return null;
	}

	//根据培养方案id查询目标
	@Override
	public Objective SelectObjectiveByCultivationId(Integer culId) {
		// TODO Auto-generated method stub
		return objMapper.selectByCulId(culId);
	}

	@Override
	public Objective getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addObjective(Objective obj) {
		// TODO Auto-generated method stub
		return objMapper.insert(obj);
	}

	@Override
	public int updateObjective(Objective obj) {
		// TODO Auto-generated method stub
		return objMapper.updateByPrimaryKey(obj);
	}

}

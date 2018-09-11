package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.Requirementitem;
import edu.njxzc.tcs.dao.RequirementitemMapper;
import edu.njxzc.tcs.service.RequirementItemService;

@Service
public class ReqirementItemServiceImpl implements RequirementItemService {

	@Resource
	private RequirementitemMapper reqItemMapper;
	
	public ReqirementItemServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Requirementitem> SelectReqItemByRequireId(Integer reqId) {
		// TODO Auto-generated method stub
		return reqItemMapper.SelectReqItemByRequireId(reqId);
	}

	@Override
	public Requirementitem getByID(int id) {
		// TODO Auto-generated method stub
		return reqItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addReqItem(Requirementitem reqItem) {
		// TODO Auto-generated method stub
		return reqItemMapper.insertSelective(reqItem);
	}

	@Override
	public int updateReqItem(Requirementitem reqItem) {
		// TODO Auto-generated method stub
		return reqItemMapper.updateByPrimaryKeyWithBLOBs(reqItem);
	}

	@Override
	public int DelReqItem(Integer id) {
		// TODO Auto-generated method stub
		return reqItemMapper.deleteByPrimaryKey(id);
	}

}

package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.ObjectiveItem;
import edu.njxzc.tcs.dao.ObjectiveItemMapper;
import edu.njxzc.tcs.service.ObjectiveItemService;

@Service
public class ObjectiveItemServiceImpl implements ObjectiveItemService {
	
	@Resource
	private ObjectiveItemMapper objItemMapper;
	
	public ObjectiveItemServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ObjectiveItem> SelectObjItemByObjectiveId(Integer objId) {
		// TODO Auto-generated method stub
		return objItemMapper.SelectObjItemByObjectiveId(objId);
	}

	@Override
	public ObjectiveItem getByID(int id) {
		// TODO Auto-generated method stub
		return objItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addObjItem(ObjectiveItem objItem) {
		// TODO Auto-generated method stub
		return objItemMapper.insert(objItem);
	}

	@Override
	public int updateObjItem(ObjectiveItem objItem) {
		// TODO Auto-generated method stub
		return objItemMapper.updateByPrimaryKeySelective(objItem);
	}

	@Override
	public int DelObjItem(Integer id) {
		// TODO Auto-generated method stub
		return objItemMapper.deleteByPrimaryKey(id);
	}

}

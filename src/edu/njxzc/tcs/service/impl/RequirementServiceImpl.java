package edu.njxzc.tcs.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.njxzc.tcs.bean.Requirement;
import edu.njxzc.tcs.bean.RequirementObjectiveItem;
import edu.njxzc.tcs.dao.RequirementMapper;
import edu.njxzc.tcs.dao.RequirementObjectiveItemMapper;
import edu.njxzc.tcs.service.RequirementService;
import edu.njxzc.tcs.util.basicutils.NumberUtil;

/**
 * created at 2018-06-26 
 * modified by addRequirement(),updateRequirement(),DelRequirement() at 2018-07-07 
 * @author wxz
 *
 */
@Service
@Transactional
public class RequirementServiceImpl implements RequirementService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Resource
	private RequirementMapper reqMapper;
	@Resource
	private RequirementObjectiveItemMapper requireObjMapper;
	
	public RequirementServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Requirement> SelectAllRequirements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Requirement> SelectRequirementsByCultivationId(Integer culId) {
		// TODO Auto-generated method stub
		return reqMapper.selectByCulId(culId);
	}

	@Override
	public Requirement getByID(int id) {
		// TODO Auto-generated method stub
		return reqMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addRequirement(Requirement req) {
		// TODO Auto-generated method stub
		int tag=reqMapper.insert(req);
		if(tag>0) {//毕业要求保存成功
			if(req.getObjectiveitems()!=null && req.getObjectiveitems()!="")//毕业要求关联毕业目标分解项不为空
			{
				String[] items = req.getObjectiveitems().split(";");
				List<RequirementObjectiveItem> itemList = new ArrayList<RequirementObjectiveItem>();
				for(String tmp:items) {
					RequirementObjectiveItem item=new RequirementObjectiveItem();
					item.setRequirementid(req.getRequirementid());
					item.setObjectiveitemid(Integer.parseInt(tmp));
					itemList.add(item);
				}
				requireObjMapper.insertByBatch(itemList);//批量插入数据
			}
		}
		return tag;
	}

	@Override
	public int updateRequirement(Requirement req) {
		// TODO Auto-generated method stub
		int tag=0;
		tag=reqMapper.updateByPrimaryKeyWithBLOBs(req);
		if(tag>0) {//毕业要求修改成功
			//删除之前的关联项
			tag=requireObjMapper.deleteByBatch(req.getRequirementid());//根据要求id批量删除数据
			//再添加关联项
			if(req.getObjectiveitems()!=null && req.getObjectiveitems()!="")//毕业要求关联毕业目标分解项不为空
			{
				String[] items = req.getObjectiveitems().split(";");
				List<RequirementObjectiveItem> itemList = new ArrayList<RequirementObjectiveItem>();
				for(String tmp:items) {
					RequirementObjectiveItem item=new RequirementObjectiveItem();
					item.setRequirementid(req.getRequirementid());
					item.setObjectiveitemid(Integer.parseInt(tmp));
					itemList.add(item);
				}
				tag = requireObjMapper.insertByBatch(itemList);//批量插入数据
			}			
		}
		return tag;
		
	}

	@Override
	public int DelRequirement(Integer id) {
		// TODO Auto-generated method stub
		//先删除关联记录
		Requirement req = reqMapper.selectByPrimaryKey(id);
		logger.info("删除要求id:"+req.getRequirementid());
		Integer tag=0;
		tag=requireObjMapper.deleteByBatch(req.getRequirementid());//根据要求id批量删除数据
//		if(req.getObjectiveitems()!=null && req.getObjectiveitems()!="")//毕业要求关联毕业目标分解项不为空
//		{
//			String[] items = req.getObjectiveitems().split(";");
//			int[] objIds=NumberUtil.strsToInts(items);
//		}
		if(tag>=0) {//再删除毕业要求记录
			tag=reqMapper.deleteByPrimaryKey(id);
		}
		return tag;
	}

}

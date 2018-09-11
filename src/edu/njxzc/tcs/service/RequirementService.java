package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.Requirement;

/**
 * created by 2018-06-26 
 * @author wxz
 *
 */
public interface RequirementService {
	
	// 查询所有的毕业要求
    List<Requirement> SelectAllRequirements();
    
   // 根据培养方案查询毕业要求列表
    List<Requirement> SelectRequirementsByCultivationId(Integer culId);
    
    // 根据id查找毕业要求
    Requirement getByID(int id);
    
    //保存毕业要求
     int addRequirement(Requirement req);
    
   //修改毕业要求
     int updateRequirement(Requirement req);
     
     //删除毕业要求
     int DelRequirement(Integer id);
}

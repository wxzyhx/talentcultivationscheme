package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.Objective;


public interface ObjectiveService {
	
	// 查询所有的目标
    List<Objective> SelectAllObjectives();
    
   // 根据培养方案查询培养目标
    Objective SelectObjectiveByCultivationId(Integer culId);
    
    // 根据id查找培养目标
    Objective getByID(int id);
    
    //保存培养目标
     int addObjective(Objective obj);
    
   //修改培养目标
     int updateObjective(Objective obj);
}

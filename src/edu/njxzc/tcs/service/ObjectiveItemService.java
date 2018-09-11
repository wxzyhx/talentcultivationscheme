package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.ObjectiveItem;

public interface ObjectiveItemService {
	
   // 根据培养目标查询查询所有的目标分解项
    List<ObjectiveItem> SelectObjItemByObjectiveId(Integer objId);
    
    // 根据id查找分解目标项
    ObjectiveItem getByID(int id);
    
    //保存目标分解项
     int addObjItem(ObjectiveItem objItem);
    
   //修改目标分解项
     int updateObjItem(ObjectiveItem objItem);
     
     //删除目标分解项
     int DelObjItem(Integer id);
}

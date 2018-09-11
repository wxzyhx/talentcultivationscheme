package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.ObjectiveItem;
import edu.njxzc.tcs.bean.Requirementitem;

/**
 * created by 2018-06-26 
 * @author wxz
 *
 */

public interface RequirementItemService {
	
   // 根据毕业要求查询查询所有的分解项
    List<Requirementitem> SelectReqItemByRequireId(Integer reqId);
    
    // 根据id查找毕业要求分解项
    Requirementitem getByID(int id);
    
    //保存毕业要求分解项
     int addReqItem(Requirementitem reqItem);
    
   //修改毕业要求分解项
     int updateReqItem(Requirementitem reqItem);
     
     //删除毕业要求分解项
     int DelReqItem(Integer id);
}

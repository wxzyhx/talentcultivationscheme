package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.ObjectiveItem;
import edu.njxzc.tcs.bean.ObjectiveItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * 2018-06-25修改 增加方法SelectObjItemByObjectiveId
 * @author wxz
 *
 */
public interface ObjectiveItemMapper {
    long countByExample(ObjectiveItemExample example);

    int deleteByExample(ObjectiveItemExample example);

    int deleteByPrimaryKey(Integer objectiveitemid);

    int insert(ObjectiveItem record);

    int insertSelective(ObjectiveItem record);

    List<ObjectiveItem> selectByExampleWithBLOBs(ObjectiveItemExample example);

    List<ObjectiveItem> selectByExample(ObjectiveItemExample example);

    ObjectiveItem selectByPrimaryKey(Integer objectiveitemid);

    int updateByExampleSelective(@Param("record") ObjectiveItem record, @Param("example") ObjectiveItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ObjectiveItem record, @Param("example") ObjectiveItemExample example);

    int updateByExample(@Param("record") ObjectiveItem record, @Param("example") ObjectiveItemExample example);

    int updateByPrimaryKeySelective(ObjectiveItem record);

    int updateByPrimaryKeyWithBLOBs(ObjectiveItem record);

    int updateByPrimaryKey(ObjectiveItem record);
    
    //根据培养目标查询查询所有的目标分解项
    List<ObjectiveItem> SelectObjItemByObjectiveId(Integer objId);
} 
    
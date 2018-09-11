package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.RequirementObjectiveItem;
import edu.njxzc.tcs.bean.RequirementObjectiveItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 2018-07-07 增加方法insertByBatch、deleteByBatch、updateByBatch
 * @author wxz
 *
 */

public interface RequirementObjectiveItemMapper {
    long countByExample(RequirementObjectiveItemExample example);

    int deleteByExample(RequirementObjectiveItemExample example);

    int deleteByPrimaryKey(Integer requireObjid);

    int insert(RequirementObjectiveItem record);

    int insertSelective(RequirementObjectiveItem record);

    List<RequirementObjectiveItem> selectByExample(RequirementObjectiveItemExample example);

    RequirementObjectiveItem selectByPrimaryKey(Integer requireObjid);

    int updateByExampleSelective(@Param("record") RequirementObjectiveItem record, @Param("example") RequirementObjectiveItemExample example);

    int updateByExample(@Param("record") RequirementObjectiveItem record, @Param("example") RequirementObjectiveItemExample example);

    int updateByPrimaryKeySelective(RequirementObjectiveItem record);

    int updateByPrimaryKey(RequirementObjectiveItem record);
    
    //批量添加
    int insertByBatch(List<RequirementObjectiveItem> itemList);
    //批量删除
//    int deleteByBatch(@Param("requireId") Integer requireId, @Param("objIds") int[] ids);
    int deleteByBatch(@Param("requireId") Integer requireId);
    //批量修改
//    int updateByBatch(List<RequirementObjectiveItem> itemList);
}
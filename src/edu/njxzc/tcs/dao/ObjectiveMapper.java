package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.Objective;
import edu.njxzc.tcs.bean.ObjectiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * 2018-06-24修改 增加方法selectByCulId
 * @author wxz
 *
 */
public interface ObjectiveMapper {
    long countByExample(ObjectiveExample example);

    int deleteByExample(ObjectiveExample example);

    int deleteByPrimaryKey(Integer objectiveid);

    int insert(Objective record);

    int insertSelective(Objective record);

    List<Objective> selectByExampleWithBLOBs(ObjectiveExample example);

    List<Objective> selectByExample(ObjectiveExample example);

    Objective selectByPrimaryKey(Integer objectiveid);

    int updateByExampleSelective(@Param("record") Objective record, @Param("example") ObjectiveExample example);

    int updateByExampleWithBLOBs(@Param("record") Objective record, @Param("example") ObjectiveExample example);

    int updateByExample(@Param("record") Objective record, @Param("example") ObjectiveExample example);

    int updateByPrimaryKeySelective(Objective record);

    int updateByPrimaryKeyWithBLOBs(Objective record);

    int updateByPrimaryKey(Objective record);
    
    Objective selectByCulId(Integer culid);//根据培养方案id查询培养目标
}
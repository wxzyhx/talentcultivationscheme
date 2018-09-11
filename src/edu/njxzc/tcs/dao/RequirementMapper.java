package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.Requirement;
import edu.njxzc.tcs.bean.RequirementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 2018-06-26修改 增加方法selectByCulId
 * @author wxz
 *
 */

public interface RequirementMapper {
    long countByExample(RequirementExample example);

    int deleteByExample(RequirementExample example);

    int deleteByPrimaryKey(Integer requirementid);

    int insert(Requirement record);

    int insertSelective(Requirement record);

    List<Requirement> selectByExampleWithBLOBs(RequirementExample example);

    List<Requirement> selectByExample(RequirementExample example);

    Requirement selectByPrimaryKey(Integer requirementid);

    int updateByExampleSelective(@Param("record") Requirement record, @Param("example") RequirementExample example);

    int updateByExampleWithBLOBs(@Param("record") Requirement record, @Param("example") RequirementExample example);

    int updateByExample(@Param("record") Requirement record, @Param("example") RequirementExample example);

    int updateByPrimaryKeySelective(Requirement record);

    int updateByPrimaryKeyWithBLOBs(Requirement record);

    int updateByPrimaryKey(Requirement record);
    
    List<Requirement> selectByCulId(Integer culid);//根据培养方案id查询毕业要求
}
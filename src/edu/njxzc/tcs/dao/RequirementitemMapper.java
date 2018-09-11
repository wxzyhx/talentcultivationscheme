package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.Requirementitem;
import edu.njxzc.tcs.bean.RequirementitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequirementitemMapper {
    long countByExample(RequirementitemExample example);

    int deleteByExample(RequirementitemExample example);

    int deleteByPrimaryKey(Integer requirementitemid);

    int insert(Requirementitem record);

    int insertSelective(Requirementitem record);

    List<Requirementitem> selectByExampleWithBLOBs(RequirementitemExample example);

    List<Requirementitem> selectByExample(RequirementitemExample example);

    Requirementitem selectByPrimaryKey(Integer requirementitemid);

    int updateByExampleSelective(@Param("record") Requirementitem record, @Param("example") RequirementitemExample example);

    int updateByExampleWithBLOBs(@Param("record") Requirementitem record, @Param("example") RequirementitemExample example);

    int updateByExample(@Param("record") Requirementitem record, @Param("example") RequirementitemExample example);

    int updateByPrimaryKeySelective(Requirementitem record);

    int updateByPrimaryKeyWithBLOBs(Requirementitem record);

    int updateByPrimaryKey(Requirementitem record);
    
    List<Requirementitem> SelectReqItemByRequireId(Integer reqId);//根据毕业要求id查询分解项
}
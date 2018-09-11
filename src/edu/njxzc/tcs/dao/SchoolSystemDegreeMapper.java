package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.SchoolSystemDegree;
import edu.njxzc.tcs.bean.SchoolSystemDegreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolSystemDegreeMapper {
    long countByExample(SchoolSystemDegreeExample example);

    int deleteByExample(SchoolSystemDegreeExample example);

    int deleteByPrimaryKey(Integer schoolsystemdegreeid);

    int insert(SchoolSystemDegree record);

    int insertSelective(SchoolSystemDegree record);

    List<SchoolSystemDegree> selectByExample(SchoolSystemDegreeExample example);

    SchoolSystemDegree selectByPrimaryKey(Integer schoolsystemdegreeid);

    int updateByExampleSelective(@Param("record") SchoolSystemDegree record, @Param("example") SchoolSystemDegreeExample example);

    int updateByExample(@Param("record") SchoolSystemDegree record, @Param("example") SchoolSystemDegreeExample example);

    int updateByPrimaryKeySelective(SchoolSystemDegree record);

    int updateByPrimaryKey(SchoolSystemDegree record);
    
    //自定义
    SchoolSystemDegree SelectSSDByCultivationId(Integer culId);
}
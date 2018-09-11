package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.Degree;
import edu.njxzc.tcs.bean.DegreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DegreeMapper {
    long countByExample(DegreeExample example);

    int deleteByExample(DegreeExample example);

    int deleteByPrimaryKey(Integer degreeid);

    int insert(Degree record);

    int insertSelective(Degree record);

    List<Degree> selectByExample(DegreeExample example);

    Degree selectByPrimaryKey(Integer degreeid);

    int updateByExampleSelective(@Param("record") Degree record, @Param("example") DegreeExample example);

    int updateByExample(@Param("record") Degree record, @Param("example") DegreeExample example);

    int updateByPrimaryKeySelective(Degree record);

    int updateByPrimaryKey(Degree record);
}
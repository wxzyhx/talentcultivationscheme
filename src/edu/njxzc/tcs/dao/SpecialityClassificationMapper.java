package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.SpecialityClassification;
import edu.njxzc.tcs.bean.SpecialityClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialityClassificationMapper {
    long countByExample(SpecialityClassificationExample example);

    int deleteByExample(SpecialityClassificationExample example);

    int deleteByPrimaryKey(Integer speciaclassid);

    int insert(SpecialityClassification record);

    int insertSelective(SpecialityClassification record);

    List<SpecialityClassification> selectByExample(SpecialityClassificationExample example);

    SpecialityClassification selectByPrimaryKey(Integer speciaclassid);

    int updateByExampleSelective(@Param("record") SpecialityClassification record, @Param("example") SpecialityClassificationExample example);

    int updateByExample(@Param("record") SpecialityClassification record, @Param("example") SpecialityClassificationExample example);

    int updateByPrimaryKeySelective(SpecialityClassification record);

    int updateByPrimaryKey(SpecialityClassification record);
}
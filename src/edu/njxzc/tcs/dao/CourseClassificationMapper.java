package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.CourseClassification;
import edu.njxzc.tcs.bean.CourseClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseClassificationMapper {
    long countByExample(CourseClassificationExample example);

    int deleteByExample(CourseClassificationExample example);

    int deleteByPrimaryKey(Integer courseclassificationid);

    int insert(CourseClassification record);

    int insertSelective(CourseClassification record);

    List<CourseClassification> selectByExample(CourseClassificationExample example);

    CourseClassification selectByPrimaryKey(Integer courseclassificationid);

    int updateByExampleSelective(@Param("record") CourseClassification record, @Param("example") CourseClassificationExample example);

    int updateByExample(@Param("record") CourseClassification record, @Param("example") CourseClassificationExample example);

    int updateByPrimaryKeySelective(CourseClassification record);

    int updateByPrimaryKey(CourseClassification record);
}
package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.ChildCourseClassification;
import edu.njxzc.tcs.bean.ChildCourseClassificationExample;
import edu.njxzc.tcs.bean.Speciality;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChildCourseClassificationMapper {
    long countByExample(ChildCourseClassificationExample example);

    int deleteByExample(ChildCourseClassificationExample example);

    int deleteByPrimaryKey(Integer childcourseclassificationid);

    int insert(ChildCourseClassification record);

    int insertSelective(ChildCourseClassification record);

    List<ChildCourseClassification> selectByExample(ChildCourseClassificationExample example);

    ChildCourseClassification selectByPrimaryKey(Integer childcourseclassificationid);

    int updateByExampleSelective(@Param("record") ChildCourseClassification record, @Param("example") ChildCourseClassificationExample example);

    int updateByExample(@Param("record") ChildCourseClassification record, @Param("example") ChildCourseClassificationExample example);

    int updateByPrimaryKeySelective(ChildCourseClassification record);

    int updateByPrimaryKey(ChildCourseClassification record);
    
    /**
     * 2018-07-10 added by wxz
     * 根据父课程类别描述查询子课程类别
     * @return
     */
    List<ChildCourseClassification> selectByClassificationDesc(String Classificationdesc);
}
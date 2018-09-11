package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.GenenalCourse;
import edu.njxzc.tcs.bean.GenenalCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GenenalCourseMapper {
    long countByExample(GenenalCourseExample example);

    int deleteByExample(GenenalCourseExample example);

    int deleteByPrimaryKey(Integer coursid);

    int insert(GenenalCourse record);

    int insertSelective(GenenalCourse record);

    List<GenenalCourse> selectByExample(GenenalCourseExample example);

    GenenalCourse selectByPrimaryKey(Integer coursid);

    int updateByExampleSelective(@Param("record") GenenalCourse record, @Param("example") GenenalCourseExample example);

    int updateByExample(@Param("record") GenenalCourse record, @Param("example") GenenalCourseExample example);

    int updateByPrimaryKeySelective(GenenalCourse record);

    int updateByPrimaryKey(GenenalCourse record);
}
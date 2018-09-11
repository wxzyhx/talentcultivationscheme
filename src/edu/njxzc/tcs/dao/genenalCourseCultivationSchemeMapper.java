package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.RequirementObjectiveItem;
import edu.njxzc.tcs.bean.genenalCourseCultivationScheme;
import edu.njxzc.tcs.bean.genenalCourseCultivationSchemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 2018-07-10 增加方法insertByBatch、deleteByBatch
 * @author wxz
 *
 */

public interface genenalCourseCultivationSchemeMapper {
    long countByExample(genenalCourseCultivationSchemeExample example);

    int deleteByExample(genenalCourseCultivationSchemeExample example);

    int deleteByPrimaryKey(Integer culGenenalcourseid);

    int insert(genenalCourseCultivationScheme record);

    int insertSelective(genenalCourseCultivationScheme record);

    List<genenalCourseCultivationScheme> selectByExample(genenalCourseCultivationSchemeExample example);

    genenalCourseCultivationScheme selectByPrimaryKey(Integer culGenenalcourseid);

    int updateByExampleSelective(@Param("record") genenalCourseCultivationScheme record, @Param("example") genenalCourseCultivationSchemeExample example);

    int updateByExample(@Param("record") genenalCourseCultivationScheme record, @Param("example") genenalCourseCultivationSchemeExample example);

    int updateByPrimaryKeySelective(genenalCourseCultivationScheme record);

    int updateByPrimaryKey(genenalCourseCultivationScheme record);
    
    //批量添加
    int insertByBatch(List<genenalCourseCultivationScheme> itemList);
    
    //批量删除
    int deleteByBatch(@Param("culId") Integer culId, @Param("courseIds") int[] ids);
}
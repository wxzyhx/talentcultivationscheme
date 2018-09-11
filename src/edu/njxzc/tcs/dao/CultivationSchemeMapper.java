package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.CultivationScheme;
import edu.njxzc.tcs.bean.CultivationSchemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CultivationSchemeMapper {
    long countByExample(CultivationSchemeExample example);

    int deleteByExample(CultivationSchemeExample example);

    int deleteByPrimaryKey(Integer cultivationid);

    int insert(CultivationScheme record);

    int insertSelective(CultivationScheme record);

    List<CultivationScheme> selectByExample(CultivationSchemeExample example);

    CultivationScheme selectByPrimaryKey(Integer cultivationid);

    int updateByExampleSelective(@Param("record") CultivationScheme record, @Param("example") CultivationSchemeExample example);

    int updateByExample(@Param("record") CultivationScheme record, @Param("example") CultivationSchemeExample example);

    int updateByPrimaryKeySelective(CultivationScheme record);

    int updateByPrimaryKey(CultivationScheme record);
}
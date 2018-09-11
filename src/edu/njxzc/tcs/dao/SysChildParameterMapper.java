package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.SysChildParameter;
import edu.njxzc.tcs.bean.SysChildParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysChildParameterMapper {
    int countByExample(SysChildParameterExample example);

    int deleteByExample(SysChildParameterExample example);

    int deleteByPrimaryKey(Integer childParmId);

    int insert(SysChildParameter record);

    int insertSelective(SysChildParameter record);

    List<SysChildParameter> selectByExample(SysChildParameterExample example);

    SysChildParameter selectByPrimaryKey(Integer childParmId);

    int updateByExampleSelective(@Param("record") SysChildParameter record, @Param("example") SysChildParameterExample example);

    int updateByExample(@Param("record") SysChildParameter record, @Param("example") SysChildParameterExample example);

    int updateByPrimaryKeySelective(SysChildParameter record);

    int updateByPrimaryKey(SysChildParameter record);
}
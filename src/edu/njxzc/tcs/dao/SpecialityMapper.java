package edu.njxzc.tcs.dao;

import edu.njxzc.tcs.bean.Speciality;
import edu.njxzc.tcs.bean.SpecialityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialityMapper {
    long countByExample(SpecialityExample example);

    int deleteByExample(SpecialityExample example);

    int deleteByPrimaryKey(Integer specialityid);

    int insert(Speciality record);

    int insertSelective(Speciality record);

    List<Speciality> selectByExample(SpecialityExample example);

    Speciality selectByPrimaryKey(Integer specialityid);

    int updateByExampleSelective(@Param("record") Speciality record, @Param("example") SpecialityExample example);

    int updateByExample(@Param("record") Speciality record, @Param("example") SpecialityExample example);

    int updateByPrimaryKeySelective(Speciality record);

    int updateByPrimaryKey(Speciality record);
    
    /**
     * 2018-06-20 added by wxz
     * 根据专业类别id查询专业列表
     * @return
     */
    List<Speciality> selectByClassificationId(Integer speciaclassid);
}
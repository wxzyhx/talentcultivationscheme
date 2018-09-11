package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.CultivationScheme;
import edu.njxzc.tcs.bean.CultivationSchemeExample;

public interface CultivationSchemeService {
	int addCultivationScheme(CultivationScheme cul);//添加培养方案

	int updateCultivationScheme(CultivationScheme cul);//修改培养方案
	
	//根据培养方案创建年份查询培养方案
	List<CultivationScheme> selectByExample(CultivationSchemeExample example);
}

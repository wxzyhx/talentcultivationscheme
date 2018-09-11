package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.CultivationScheme;
import edu.njxzc.tcs.bean.CultivationSchemeExample;
import edu.njxzc.tcs.dao.CultivationSchemeMapper;
import edu.njxzc.tcs.service.CultivationSchemeService;

/**
 * 2018-06-23创建
 * @author wxz
 *
 */
@Service
public class CultivationSchemeImpl implements CultivationSchemeService {

	@Resource
	private CultivationSchemeMapper culMapper;
	
	public CultivationSchemeImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addCultivationScheme(CultivationScheme cul) {
		// TODO Auto-generated method stub
		return culMapper.insert(cul);
	}

	@Override
	public int updateCultivationScheme(CultivationScheme cul) {
		// TODO Auto-generated method stub
		return culMapper.updateByPrimaryKey(cul);
	}

	@Override
	public List<CultivationScheme> selectByExample(CultivationSchemeExample example) {
		// TODO Auto-generated method stub
		return culMapper.selectByExample(example);
	}
}

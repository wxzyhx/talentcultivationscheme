package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.Department;
import edu.njxzc.tcs.dao.DepartmentMapper;
import edu.njxzc.tcs.service.DepartmentService;

/**
 * 2018-06-23创建
 * @author wxz
 *
 */

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Resource
	private DepartmentMapper depMapper;
	
	public DepartmentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Department> SelectAllDepartment() {
		// TODO Auto-generated method stub
		return depMapper.selectByExample(null);
	}

	@Override
	public Department getByID(int id) {
		// TODO Auto-generated method stub
		return depMapper.selectByPrimaryKey(id);
	}

}

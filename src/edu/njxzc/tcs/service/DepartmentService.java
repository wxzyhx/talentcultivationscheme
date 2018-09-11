package edu.njxzc.tcs.service;

import java.util.List;

import edu.njxzc.tcs.bean.Department;


public interface DepartmentService {
	
	// 查询所有的 部门
    List<Department> SelectAllDepartment();
    
    // 根据id查找该部门
    Department getByID(int id);
}

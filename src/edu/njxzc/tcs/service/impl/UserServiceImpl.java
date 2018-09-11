package edu.njxzc.tcs.service.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.User;
import edu.njxzc.tcs.bean.UserRole;
import edu.njxzc.tcs.bean.UserRoleExample;
import edu.njxzc.tcs.bean.UserRoleExample.Criteria;
import edu.njxzc.tcs.dao.UserMapper;
import edu.njxzc.tcs.dao.UserRoleMapper;
import edu.njxzc.tcs.service.UserService;

/**
 * 2018-06-18创建
 * 2018-08-06修改userLogin方法
 * 2018-08-28增加userIsExist方法
 * @author wxz
 *
 */

@Service
public class UserServiceImpl implements UserService {

	private Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private UserMapper userMapper;
	@Resource 
	private UserRoleMapper userRoleMapper;
	
//	@Override
	public String userLogin(User user, HttpServletRequest request) {
		logger.info("service " + user.getName() + " 登录 ");
		User tmpuser = userMapper.selectByPrimaryKey(user.getSn());
		if (null==tmpuser) {
			return "用户不存在";	
		}else if(!tmpuser.getPassword().equals(user.getPassword())){
			return "密码错误";
		}else {
			request.getSession().setAttribute("user", tmpuser);
			UserRoleExample example=new UserRoleExample();
			Criteria criteria=example.createCriteria();
			criteria.andSnEqualTo(tmpuser.getSn());
			UserRole userRole=userRoleMapper.selectByExample(example).get(0);
			switch(userRole.getRoleCode()) {
			case "101":
				return "专业负责人";
			case "103":
				return "管理员";
			}
		}
		return "";
	}

//	@Override
	public int userRegister(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public boolean userIsExist(String sn) {
		// TODO Auto-generated method stub
		if(userMapper.selectByPrimaryKey(sn)==null)
			return false;
		else
			return true;
	}

}

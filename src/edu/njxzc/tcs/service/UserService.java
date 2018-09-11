package edu.njxzc.tcs.service;

import javax.servlet.http.HttpServletRequest;

import edu.njxzc.tcs.bean.User;

public interface UserService {
	//登录
	String userLogin(User user, HttpServletRequest request);
    //注册
    int userRegister(User user);
    //修改用户信息
    int updateUser(User user);
    
    //判断用户是否存在
    boolean userIsExist(String sn);
}

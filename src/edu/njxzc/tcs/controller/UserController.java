package edu.njxzc.tcs.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.njxzc.tcs.bean.Speciality;
import edu.njxzc.tcs.bean.SpecialityClassification;
import edu.njxzc.tcs.bean.SpecialityClassificationExample;
import edu.njxzc.tcs.bean.User;
import edu.njxzc.tcs.service.CultivationSchemeService;
import edu.njxzc.tcs.service.SpecialityClassificationService;
import edu.njxzc.tcs.service.SpecialityService;
import edu.njxzc.tcs.service.UserService;

/**
 * 2018-06-18创建
 * 2018-06-19添加
 * 2018-08-06修改userLogin方法
 * 2018-08-07添加adminLogin方法
 * 2018-08-29添加sncheck、pwdcheck方法
 * @author wxz
 *
 */

@Controller
public class UserController {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Resource
	private UserService userService;
	@Resource
	private SpecialityService speService;//实例化专业service
	@Resource
	private SpecialityClassificationService speClassifiService;//实例化专业类别service
	@Resource
	private CultivationSchemeService culService;//实例化培养方案service
	
	@RequestMapping("userRegister")
	public String userRegister(Model model, User user,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("用户注册    进入");
//		System.out.println(ptUser);
		userService.userRegister(user);
		return "login";	
	}
	
	//获取专业类别列表
	@RequestMapping("getClassifications")
	public ModelAndView toListClassifications() {
		ModelAndView mav = new ModelAndView("jsonView");
		SpecialityClassificationExample speClassifiExample=new SpecialityClassificationExample();
		List<SpecialityClassification> specialitieclasses=speClassifiService.selectByExample(speClassifiExample);
		mav.addObject("specialitieclasses", specialitieclasses);
		return mav;
	}
	
	//根据专业类别获取相关专业列表
	@RequestMapping("getSpecialitiesByClassificationId")
	public ModelAndView toListSpecialities(Integer speciaclassid) {
		ModelAndView mav = new ModelAndView("jsonView");
		List<Speciality> specialities=speService.SelectSpecialitiesByClassificationId(speciaclassid);
		mav.addObject("specialities", specialities);
		return mav;
	}
	
	@RequestMapping("userLogin")
	public String userLogin(Model model,User user,
			SpecialityClassification speclassification,
			Speciality specia,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("用户登录    进入");
		request.getSession().setAttribute("errormsg", "");
//		System.out.println("用户名："+loginName+"，密码："+password);
		String loginInfo=userService.userLogin(user,request);
		switch(loginInfo) {//只有专业负责人角色可以正常进入
		case "专业负责人":
			SpecialityClassification classification=
			speClassifiService.selectByPrimaryKey(speclassification.getSpeciaclassid());
			request.getSession().setAttribute("speclassification", classification);//保存专业类别
			Speciality speciality=speService.getByID(specia.getSpecialityid());
			request.getSession().setAttribute("speciality", speciality);//保存相关专业
			return "index";	
		case "密码错误":
			request.getSession().setAttribute("errormsg", loginInfo);
			return "login/login";
		default:
			return "login/login";
		}
	}
	
	/**
	 * 管理员登录
	 * @param model
	 * @param user
	 * @param speclassification
	 * @param specia
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("adminLogin")
	public String adminLogin(Model model,User user,
			SpecialityClassification speclassification,
			Speciality specia,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("管理员登录    进入");
		String loginInfo=userService.userLogin(user,request);
		logger.info(loginInfo);
		switch(loginInfo) {//只有管理员角色可以正常进入
		case "管理员":
			return "admin/index";
		default:
			return "login/login";
		}
	}
	
	 @RequestMapping("logout")
	 public ModelAndView logout( HttpServletRequest request,
	                               HttpServletResponse response) throws Exception {
		  request.getSession().invalidate();//清除session
	      return new ModelAndView("login/login");
	    }
	  
	@RequestMapping("updatePassword")
	public ModelAndView updatePassword(User user,HttpServletRequest request,
				HttpServletResponse response){
			logger.info("用户密码修改");
			ModelAndView mav = new ModelAndView("jsonView");
			int i=userService.updateUser(user);
			if(i>0) {
				mav.addObject("isError",false);
			}
			return mav;
	}
	
	@RequestMapping("sncheck")
	@ResponseBody
	public String sncheck(@RequestParam String sn){
		logger.info("工号验证");
		boolean result = false;
		result=userService.userIsExist(sn);
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("valid", result);
		ObjectMapper mapper = new ObjectMapper();
		String resultString = "";
		try {
			resultString = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return resultString;
	}
	
	@RequestMapping("pwdcheck")
	@ResponseBody
	public String pwdcheck(@RequestParam String sn,String password,HttpServletRequest request){
		logger.info("密码验证");
		boolean result = false;
		User usertmp=new User();
		usertmp.setSn(sn);
		usertmp.setPassword(password);
		String loginInfo=userService.userLogin(usertmp,request);
		if(!loginInfo.equals("密码错误"))
			result=true;
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("valid", result);
		ObjectMapper mapper = new ObjectMapper();
		String resultString = "";
		try {
			resultString = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return resultString;
	}
}

package edu.njxzc.tcs.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.njxzc.tcs.bean.CultivationScheme;
import edu.njxzc.tcs.bean.CultivationSchemeExample;
import edu.njxzc.tcs.bean.CultivationSchemeExample.Criteria;
import edu.njxzc.tcs.bean.Department;
import edu.njxzc.tcs.bean.Speciality;
import edu.njxzc.tcs.bean.User;
import edu.njxzc.tcs.service.CultivationSchemeService;
import edu.njxzc.tcs.service.DepartmentService;
import edu.njxzc.tcs.service.SpecialityClassificationService;
import edu.njxzc.tcs.service.SpecialityService;
import edu.njxzc.tcs.util.basicutils.DateUtil;

/**
 * 2018-06-23创建
 * 2016-06-24添加方法setExampleByTwo、setExampleByThree
 * @author wxz
 *
 */

@Controller
public class CultivationSchemeController {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Resource
	private CultivationSchemeService culService;
	@Resource
	private SpecialityService speService;//实例化专业service
	@Resource
	private SpecialityClassificationService speClassifiService;//实例化专业类别service
	@Resource
	private DepartmentService depService;//实例化部门service
	//获取培养方案列表
	@RequestMapping("getCulSchemes")
	public ModelAndView toListClassifications(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("jsonView");
		CultivationSchemeExample example=new CultivationSchemeExample();
		setExampleByTwo(example,request);
		List<CultivationScheme> culs=culService.selectByExample(example);//查询所有培养方案
		if(!culs.isEmpty()) {
			mav.addObject("culs", culs);
		}
		return mav;
	}
	
	//设置培养方案example的查询条件（所属专业、创建用户）
	public void setExampleByTwo(CultivationSchemeExample example,HttpServletRequest request) {
		Criteria criteria =example.createCriteria();
		Speciality spetmp=(Speciality)request.getSession().getAttribute("speciality");//获取当前选择的专业
		criteria.andSpecialityIdEqualTo(spetmp.getSpecialityid());
		User usertmp=(User)request.getSession().getAttribute("user");//获取当前登录用户信息
		criteria.andCreatedUserSnEqualTo(usertmp.getSn());
	}
	
	//设置培养方案example的查询条件（所属专业、创建用户、创建日期）
		public void setExampleByThree(CultivationSchemeExample example,HttpServletRequest request,String culcreatetime) {
			Criteria criteria =example.createCriteria();
			Speciality spetmp=(Speciality)request.getSession().getAttribute("speciality");//获取当前选择的专业
			criteria.andSpecialityIdEqualTo(spetmp.getSpecialityid());
			User usertmp=(User)request.getSession().getAttribute("user");//获取当前登录用户信息
			criteria.andCreatedUserSnEqualTo(usertmp.getSn());
			criteria.andCulcreatetimeEqualTo(DateUtil.getDate(culcreatetime,DateUtil.DEFAULT_DATE_PATTERN));
		}
	
	//获取部门信息列表
	@RequestMapping("getDepartments")
	public ModelAndView toListDepartments() {
		ModelAndView mav = new ModelAndView("jsonView");
		List<Department> deps=depService.SelectAllDepartment();//查询所有部门信息
		mav.addObject("departments", deps);
		return mav;
	}
	
	//根据年份获取培养方案列表
	@RequestMapping("getCulSchemesByYear")
	public ModelAndView toListClassificationsByYear(String culcreatetime,HttpServletRequest request) {
		logger.info("时间:"+culcreatetime);
		ModelAndView mav = new ModelAndView("jsonView");
		CultivationSchemeExample example=new CultivationSchemeExample();
		setExampleByThree(example,request,culcreatetime);
		List<CultivationScheme> culs=culService.selectByExample(example);//查询所有培养方案
		List<Department> deps=depService.SelectAllDepartment();//查询所有部门信息
		mav.addObject("departments", deps);
		if(!culs.isEmpty()) {
			mav.addObject("cul", culs.get(0));//只获取培养方案第一条记录
			Department dep=depService.getByID(culs.get(0).getDepartmentId());//根据部门id获取部门对象
			mav.addObject("dep", dep);
		}
		return mav;
	}
	
	//保存新建培养方案
	@RequestMapping("addCulScheme")
	public ModelAndView addCulScheme(CultivationScheme cul,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("添加培养方案");
		logger.info(cul.getCulcreatetime());
		ModelAndView mav = new ModelAndView("jsonView");
		int tag=culService.addCultivationScheme(cul);
		if(tag>0) {
			mav.addObject("success", "true");
		}
		return mav;	
	}
	
	//保存修改培养方案
	@RequestMapping("updateCulScheme")
	public ModelAndView updateCulScheme(CultivationScheme cul,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("修改培养方案");
		logger.info(cul.getCultivationid());
		ModelAndView mav = new ModelAndView("jsonView");
		int tag=culService.updateCultivationScheme(cul);
		if(tag>0) {
			mav.addObject("success", "true");
		}
		return mav;	
	}
	
}

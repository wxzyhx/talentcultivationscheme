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
import edu.njxzc.tcs.bean.Degree;
import edu.njxzc.tcs.bean.Department;
import edu.njxzc.tcs.bean.Objective;
import edu.njxzc.tcs.bean.Requirement;
import edu.njxzc.tcs.bean.SchoolSystemDegree;
import edu.njxzc.tcs.bean.Speciality;
import edu.njxzc.tcs.bean.User;
import edu.njxzc.tcs.service.CultivationSchemeService;
import edu.njxzc.tcs.service.DegreeService;
import edu.njxzc.tcs.service.DepartmentService;
import edu.njxzc.tcs.service.SchoolsysDegreeService;
import edu.njxzc.tcs.service.SpecialityClassificationService;
import edu.njxzc.tcs.service.SpecialityService;
import edu.njxzc.tcs.util.basicutils.DateUtil;

/**
 * 2018-06-29创建
 * @author wxz
 *
 */

@Controller
@RequestMapping("schoolsystemdegree/")
public class SchoolsysDegreeController {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Resource
	private CultivationSchemeService culService;
	@Resource
	private SchoolsysDegreeService ssdService;//实例化学制学位service
	@Resource
	private DegreeService degreeService;//实例化学位service

	
	//根据培养方案id获取学制学位
	@RequestMapping("getSSDByCulid")
	public ModelAndView getSSDByCulid(Integer cultivationid,HttpServletRequest request) {
		logger.info("方案id:"+cultivationid);
		ModelAndView mav = new ModelAndView("jsonView");
		SchoolSystemDegree ssd=ssdService.SelectSSDByCultivationId(cultivationid);//根据培养方案id查询学制学位	
		List<Degree> degrees=degreeService.SelectAllDegrees();
		if(degrees!=null) {
			mav.addObject("degrees", degrees);
		}
		if(ssd!=null) {
			mav.addObject("ssd", ssd);
			Degree degree=degreeService.getByID(ssd.getDegreeId());//根据ssd中的学位id查询学位信息
			mav.addObject("degree", degree);
		}
		return mav;
	}
	
	//保存新建学制学位
	@RequestMapping("addSSD")
	public ModelAndView addSSD(SchoolSystemDegree ssd,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("添加学制学位");
		logger.info(ssd.getCultivationschemeId());
		ModelAndView mav = new ModelAndView("jsonView");
		int tag=ssdService.addSchoolsysDegree(ssd);
		if(tag>0) {
			mav.addObject("success", "true");
		}
		return mav;	
	}
	
	//保存修改学制学位
	@RequestMapping("updateSSD")
	public ModelAndView updateSSD(SchoolSystemDegree ssd,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("修改学制学位");
		logger.info(ssd.getCultivationschemeId());
		ModelAndView mav = new ModelAndView("jsonView");
		int tag=ssdService.updateSchoolsysDegree(ssd);
		if(tag>0) {
			mav.addObject("success", "true");
		}
		return mav;	
	}
	
	
	//获取学位信息列表
	@RequestMapping("getDegrees")
	public ModelAndView toListDegrees() {
		ModelAndView mav = new ModelAndView("jsonView");
		List<Degree> degrees=degreeService.SelectAllDegrees();//查询所有学位信息
		if(degrees!=null) {
			mav.addObject("degrees", degrees);
		}
		return mav;
	}
	
}

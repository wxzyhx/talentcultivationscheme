package edu.njxzc.tcs.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.njxzc.tcs.bean.Course;
import edu.njxzc.tcs.bean.CourseClassification;
import edu.njxzc.tcs.bean.CourseClassificationExample;
import edu.njxzc.tcs.bean.CourseExample;
import edu.njxzc.tcs.bean.CourseClassificationExample.Criteria;
import edu.njxzc.tcs.bean.CourseClassificationExample.Criterion;
import edu.njxzc.tcs.bean.CultivationSchemeExample;
import edu.njxzc.tcs.bean.Department;
import edu.njxzc.tcs.bean.GenenalCourse;
import edu.njxzc.tcs.bean.GenenalCourseExample;
import edu.njxzc.tcs.bean.Requirement;
import edu.njxzc.tcs.bean.Requirementitem;
import edu.njxzc.tcs.bean.Speciality;
import edu.njxzc.tcs.bean.SpecialityClassification;
import edu.njxzc.tcs.bean.User;
import edu.njxzc.tcs.bean.genenalCourseCultivationScheme;
import edu.njxzc.tcs.bean.genenalCourseCultivationSchemeExample;
import edu.njxzc.tcs.service.CourseClassificationService;
import edu.njxzc.tcs.service.CourseService;
import edu.njxzc.tcs.service.CultivationSchemeService;
import edu.njxzc.tcs.service.RequirementItemService;
import edu.njxzc.tcs.service.RequirementService;


/**
 * 2018-07-02创建
 * modified getCoursesByCulid方法 at 2018-07-11 by wxz
 * modified getCoursesByCulid方法 at 2018-07-12 by wxz
 * modified getCoursesByCulid方法 at 2018-07-17 by wxz
 * @author wxz
 *
 */

@Controller
@RequestMapping("totalcredit/")
public class TotalCreditsController {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Resource
	private CultivationSchemeService culService;
	@Resource
	private CourseService courseService;//实例化课程service
	@Resource
	private CourseClassificationService ccService;//实例化课程类别service
	
	//根据培养方案id获取课程相应学分
	@RequestMapping("getCoursesByCulid")
	public ModelAndView getCoursesByCulid(Integer cultivationid,HttpServletRequest request) {
		logger.info("方案id:"+cultivationid);
		ModelAndView mav = new ModelAndView("jsonView");
		CourseExample example=new CourseExample();
		edu.njxzc.tcs.bean.CourseExample.Criteria criteria =example.createCriteria();
		criteria.andCultivationschemeIdEqualTo(cultivationid);
		List<Course> courses=courseService.SelectCourseByCultivationId(example);//查询该培养方案所有专业必修课和专业方向课课程
		genenalCourseCultivationSchemeExample genExample=new genenalCourseCultivationSchemeExample();
		edu.njxzc.tcs.bean.genenalCourseCultivationSchemeExample.Criteria genCriteria =genExample.createCriteria();
		genCriteria.andCultivationschemeIdEqualTo(cultivationid);
		List<genenalCourseCultivationScheme> gencourseculs=courseService.SelectGenCourseCulByCulId(genExample);//查询该培养方案所有通识课程列表
		
		SpecialityClassification sc=(SpecialityClassification)request.getSession().getAttribute("speclassification");
		CourseClassificationExample ccExample1=new CourseClassificationExample();
		Criteria ccCriteria =ccExample1.createCriteria();
		ccCriteria.andSpeciaclassIdEqualTo(sc.getSpeciaclassid());//设定根据专业类别id查询课程类别条件
		List<CourseClassification> ccs;
		ccCriteria.andCourseclassificationnameEqualTo("generalcompulsory");//设定查询"通识必修课"课程类别查询条件
		ccs=ccService.SelectCourseClassificationByExample(ccExample1);
		if(!ccs.isEmpty()) {
			mav.addObject("generalCompulsoryCreditsRule", ccs.get(0).getCoursecreditrule());//获取该专业类别"通识必修课"课程最高学分			
		}
		
		//设定查询"通识选修课"课程类别查询条件
		CourseClassificationExample ccExample2=new CourseClassificationExample();
		ccCriteria =ccExample2.createCriteria();
		ccCriteria.andSpeciaclassIdEqualTo(sc.getSpeciaclassid());//设定根据专业类别id查询课程类别条件
		ccCriteria.andCourseclassificationnameEqualTo("generalelective");
		ccs=ccService.SelectCourseClassificationByExample(ccExample2);
		if(!ccs.isEmpty()) {
			mav.addObject("generalElectiveCreditsRule",  ccs.get(0).getCoursecreditrule());//获取该专业类别"通识选修课"课程最高学分
		}
		CourseClassificationExample ccExample3=new CourseClassificationExample();
		ccCriteria =ccExample3.createCriteria();
		ccCriteria.andSpeciaclassIdEqualTo(sc.getSpeciaclassid());//设定根据专业类别id查询课程类别条件
		ccCriteria.andCourseclassificationnameEqualTo("professionalcompulsory");//设定查询"专业必修课"课程类别查询条件
		ccs=ccService.SelectCourseClassificationByExample(ccExample3);
		if(!ccs.isEmpty()) {
			mav.addObject("professionalCompulsoryCreditsRule", ccs.get(0).getCoursecreditrule());//获取该专业类别"专业必修课"课程最高学分
		}
		CourseClassificationExample ccExample4=new CourseClassificationExample();
		ccCriteria =ccExample4.createCriteria();
		ccCriteria.andSpeciaclassIdEqualTo(sc.getSpeciaclassid());//设定根据专业类别id查询课程类别条件
		ccCriteria.andCourseclassificationnameEqualTo("professionaldirection");//设定查询"专业方向课"课程类别查询条件
		ccs=ccService.SelectCourseClassificationByExample(ccExample4);
		if(!ccs.isEmpty()) {
			mav.addObject("professionalDirectionCreditsRule", ccs.get(0).getCoursecreditrule());//获取该专业类别"专业方向课"课程最高学分
		}
		CourseClassificationExample ccExample5=new CourseClassificationExample();
		ccCriteria =ccExample5.createCriteria();
		ccCriteria.andSpeciaclassIdEqualTo(sc.getSpeciaclassid());//设定根据专业类别id查询课程类别条件
		ccCriteria.andCourseclassificationnameEqualTo("interdisciplinaryelective");//设定查询"跨专业选修课"课程类别查询条件
		ccs=ccService.SelectCourseClassificationByExample(ccExample5);
		if(!ccs.isEmpty()) {
			mav.addObject("interdisciplinaryElectiveCreditsRule", ccs.get(0).getCoursecreditrule());//获取该专业类别"跨专业选修课"课程最高学分
		}
		switch(sc.getSpeciaclassname()) {//根据课程类别名称获得学分要求
		case "工科":
		case "理科":
		case "师范（文）":
		case "师范（理）":
		case "师范（艺体）":	
//			mav.addObject("generalCompulsoryCreditsRule", "41/40");
//			mav.addObject("generalElectiveCreditsRule", "5");
//			mav.addObject("professionalCompulsoryCreditsRule", "76");
//			mav.addObject("professionalDirectionCreditsRule", "28");
//			mav.addObject("interdisciplinaryElectiveCreditsRule", "10");
			mav.addObject("totalcreditRule", "160");
			break;
		case "文科":
		case "艺体":	
//			mav.addObject("generalCompulsoryCreditsRule", "40");
//			mav.addObject("generalElectiveCreditsRule", "5");
//			mav.addObject("professionalCompulsoryCreditsRule", "71");
//			mav.addObject("professionalDirectionCreditsRule", "24");
//			mav.addObject("interdisciplinaryElectiveCreditsRule", "10");
			mav.addObject("totalcreditRule", "150");
			break;
		}
		float generalElectiveCredits=0;//通识选修课学分
		float professionalCompulsoryCredits=0;//专业必修课学分
		float professionalDirectionCredits=0;//专业方向课学分
		float interdisciplinaryElectiveCredits=0;//跨专业选修课学分
		float generalCompulsoryCredits=0;//通识必修课学分
		for(Course coursetmp : courses) {
			CourseClassification cc=ccService.getByID(coursetmp.getCourseclassificationId());
			switch(cc.getCourseclassifcationdesc()) {//根据课程类别汇总学分
				case "专业必修课":
					professionalCompulsoryCredits += coursetmp.getTotalcredit();
					break;
				case "专业方向课":
					professionalDirectionCredits += coursetmp.getTotalcredit();
					break;
			}
		}
		if(!courses.isEmpty()) {
			
			if(!gencourseculs.isEmpty()) {
				List<GenenalCourse> gencourses=new ArrayList<GenenalCourse>();
				//根据关联方案的通识课id查询通识课对象，并生成通识课数组
				for(genenalCourseCultivationScheme gccstmp:gencourseculs) {
					GenenalCourse gencourse=
							courseService.SelectGenenalCourseByGenCourseId(gccstmp.getGenenalcourseId());
					gencourses.add(gencourse);
				}
				for(GenenalCourse coursetmp : gencourses) {
					CourseClassification cc=ccService.getByID(coursetmp.getCourseclassificationId());
					switch(cc.getCourseclassifcationdesc()) {//根据课程类别汇总学分
						case "通识选修课":
							generalElectiveCredits += coursetmp.getTotalcredit();
							break;
						case "跨专业选修课":
							interdisciplinaryElectiveCredits += coursetmp.getTotalcredit();
							break;
						case "通识必修课":
							generalCompulsoryCredits += coursetmp.getTotalcredit();
							break;
					}
				}				
			}
		}
		mav.addObject("isError",false);
//		mav.addObject("generalElectiveCredits", generalElectiveCredits+5);
		mav.addObject("generalElectiveCredits", 5);		
		mav.addObject("professionalCompulsoryCredits", professionalCompulsoryCredits);
//		mav.addObject("professionalDirectionCredits", professionalDirectionCredits);
		mav.addObject("professionalDirectionCredits", 28);//专业方向课最高
//		mav.addObject("interdisciplinaryElectiveCredits", interdisciplinaryElectiveCredits);
		mav.addObject("interdisciplinaryElectiveCredits", 10);//跨专业选修课最高		
		mav.addObject("generalCompulsoryCredits", generalCompulsoryCredits+6);//加上大学英语和创新创业选修学分
		mav.addObject("totalcredit",generalCompulsoryCredits
				+professionalCompulsoryCredits
				+49);//培养方案总学分
		return mav;
	}
	
	//设置课程类别example的查询条件（所属专业类别、课程性质）
	public void setExampleByTwo(CourseClassificationExample example,HttpServletRequest request) {
		Criteria criteria =example.createCriteria();
		SpecialityClassification classification=
				(SpecialityClassification)request.getSession().getAttribute("speclassification");
		criteria.andSpeciaclassIdEqualTo(classification.getSpeciaclassid());
		criteria.andCoursetagEqualTo(1);//1表示只查询常规课的课程类别
	}
	

	

		
}

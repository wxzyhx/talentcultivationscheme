package edu.njxzc.tcs.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.njxzc.tcs.bean.ChildCourseClassification;
import edu.njxzc.tcs.bean.Course;
import edu.njxzc.tcs.bean.CourseClassification;
import edu.njxzc.tcs.bean.CourseClassificationExample;
import edu.njxzc.tcs.bean.CourseClassificationExample.Criteria;
import edu.njxzc.tcs.bean.CourseExample;
import edu.njxzc.tcs.bean.GenenalCourse;
import edu.njxzc.tcs.bean.GenenalCourseExample;
import edu.njxzc.tcs.bean.SpecialityClassification;
import edu.njxzc.tcs.bean.genenalCourseCultivationScheme;
import edu.njxzc.tcs.bean.genenalCourseCultivationSchemeExample;
import edu.njxzc.tcs.service.ChildCourseClassificationService;
import edu.njxzc.tcs.service.CourseClassificationService;
import edu.njxzc.tcs.service.CourseService;
import edu.njxzc.tcs.service.CultivationSchemeService;


/**
 * 2018-06-26创建
 * @author wxz
 * wxz于2018-07-06 modified getCoursesByCulid()方法
 * wxz于2018-07-10  added  getGenenalCoursesByClassid()
 * wxz于2018-07-12  added  getByChildClassificationId()
 * wxz于2018-07-12  modified SelectGenenalCourseByClassificationId()
 * wxz于2018-07-12  added  delGenCourseById()
 */

@Controller
@RequestMapping("courseinfo/")
public class CourseController {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Resource
	private CultivationSchemeService culService;
	@Resource
	private CourseService courseService;//实例化课程service
	@Resource
	private CourseClassificationService ccService;//实例化课程类别service
	@Resource
	private ChildCourseClassificationService childccService;//实例化子课程类别service
	
	//根据培养方案id、课程类别获取课程列表
	@RequestMapping("getCoursesByCulid")
	public ModelAndView getCoursesByCulId(Integer cultivationid,
			Integer ccid,HttpServletRequest request) {
		logger.info("方案id:"+cultivationid);
		logger.info("课程类别id:"+ccid);
		ModelAndView mav = new ModelAndView("jsonView");
		CourseExample example=new CourseExample();
		edu.njxzc.tcs.bean.CourseExample.Criteria criteria =example.createCriteria();
		criteria.andCultivationschemeIdEqualTo(cultivationid);
		if(ccid!=null && ccid !=0) {//若不为空，则添加课程类别查询条件
			criteria.andCourseclassificationIdEqualTo(ccid);
			CourseClassification cc=ccService.getByID(ccid);
			if(cc.getCourseclassifcationdesc().contains("通识") || cc.getCourseclassifcationdesc().contains("跨专业")) {
				List<GenenalCourse> gebcourses=SelectGenenalCourseIdsByCulid(cultivationid,cc.getCourseclassifcationdesc(),request);//加载通识课和跨专业课
				if(gebcourses!=null) {
					mav.addObject("isError",false);
					mav.addObject("courses", gebcourses);
				}
				return mav;
			}
		}
		//加载专业必修课和专业方向课
		List<Course> courses=courseService.SelectCourseByCultivationId(example);//查询所有课程列表
		if(courses!=null) {
			mav.addObject("isError",false);
			mav.addObject("courses", courses);
		}
		return mav;
	}	
	
	//根据课程类别id获取课程类别
	@RequestMapping("getCourseClassificationByCCId")	
	public ModelAndView getCoursesByCulid(Integer ccId,HttpServletRequest request) {
		logger.info("类别id:"+ccId);
		ModelAndView mav = new ModelAndView("jsonView");
		CourseClassification cc=ccService.getByID(ccId);
		if(cc!=null) {
			mav.addObject("isError",false);
			mav.addObject("cc", cc);
		}
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
	
	//根据课程性质、专业类别获取课程类别列表
	@RequestMapping("getCourseClassifications")
	public ModelAndView toListCourseClassifications(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("jsonView");
		CourseClassificationExample example=new CourseClassificationExample();
		setExampleByTwo(example,request);
		List<CourseClassification> ccs=ccService.SelectCourseClassificationByExample(example);
		mav.addObject("ccs", ccs);
		return mav;
	}
	
	//保存新建课程信息
	@RequestMapping("addCourseOP")
	public ModelAndView addCourse(Course course,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("添加课程信息");
		logger.info(course.getCoursename());
		ModelAndView mav = new ModelAndView("jsonView");
		int tag=courseService.addCourse(course);
		if(tag>0) {
			mav.addObject("success", "true");
			mav.addObject("course", course);
		}
		return mav;	
	}
	
	//删除课程信息
	@RequestMapping(value="delCourseById.do")
	public ModelAndView delCourseById(int id){
		int result =courseService.DelCourse(id);
		ModelAndView mav = new ModelAndView("jsonView");
		if (result > 0) {
			mav.addObject("result", "SUCCESS");
		} else {
			mav.addObject("result", "false");
		}
		return mav;
	}
	
	//根据培养方案id和课程id删除已添加的通识课程信息
	@RequestMapping(value="delGenCourseById.do")
	public ModelAndView delGenCourseById(int cultivationid,int id){
		int result =courseService.DelGenCourse(cultivationid,id);
		ModelAndView mav = new ModelAndView("jsonView");
		if (result > 0) {
			mav.addObject("result", "SUCCESS");
		} else {
			mav.addObject("result", "false");
		}
		return mav;
	}
	
	//打开修改课程模态框
	@RequestMapping("updateCourse.do")
	public ModelAndView updateCourse(int id) {
		Course course = courseService.getByID(id);
		ModelAndView mav = new ModelAndView("jsonView");
		if(course!=null) {
			mav.addObject("course", course);
		}
		return mav;
	}
	
	//保存修改课程信息
	@RequestMapping("updateCourseOP.do")
	public ModelAndView updateCourseOP(Course course,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("修改课程信息");
		logger.info(course.getCoursename());
		ModelAndView mav = new ModelAndView("jsonView");
		int tag=courseService.updateCourse(course);
		if(tag>0) {
			mav.addObject("success", "true");
			mav.addObject("course", course);
		}
		return mav;	
	}

	//根据课程类别id获取课程类别
	@RequestMapping("getByClassificationDesc")	
	public ModelAndView getByClassificationDesc(String Classificationdesc,HttpServletRequest request) {
		logger.info("类别描述:"+Classificationdesc);
		ModelAndView mav = new ModelAndView("jsonView");
		List<ChildCourseClassification> childccs=childccService.selectByClassificationDesc(Classificationdesc);
		if(childccs!=null) {
			mav.addObject("isError",false);
			mav.addObject("childccs", childccs);
		}
		return mav;
	}
	
	//根据专业类别id和课程类别描述获取通用课程列表
		@RequestMapping("getGenenalCoursesByClassid")
		public ModelAndView SelectGenenalCourseByClassificationId(Integer cultivationid,String Classificationdesc,HttpServletRequest request) {
			//获取当前专业类别(如工科、理科、文科等，不同类别通识课开课学期或学分不完全一致)
			logger.info("专业类别描述:"+Classificationdesc);
			SpecialityClassification sc=(SpecialityClassification)request.getSession().getAttribute("speclassification");
			ModelAndView mav = new ModelAndView("jsonView");
			GenenalCourseExample example=new GenenalCourseExample();
			edu.njxzc.tcs.bean.GenenalCourseExample.Criteria criteria =example.createCriteria();
			List<Integer> ids= new ArrayList<Integer>();
			ids.add(0);//部分通识课所有要求一致，没有和专业类别关联，则用0表示
			ids.add(sc.getSpeciaclassid());
	 		criteria.andSpeciaclassIdIn(ids);				
 			criteria.andCourseclassifcationdescEqualTo(Classificationdesc);
 			//nogenCourses表示本培养方案已添加的通识课，则不要再出现在选择目录中
 			List<GenenalCourse> nogenCourses=SelectGenenalCourseIdsByCulid(cultivationid,Classificationdesc,request);
 			List<Integer> ngcids=new ArrayList<Integer>();//获取所有已添加的通识课id数组
 			if(!nogenCourses.isEmpty()) {//若已添加课程不为空 			
 				for(GenenalCourse gc:nogenCourses) {
 					ngcids.add(gc.getCoursid());
 				}
 	 			criteria.andCoursidNotIn(ngcids);//排除已添加的通识课 				
 			}
			List<GenenalCourse> gencourses=courseService.SelectGenenalCourseByClassificationId(example);//查询通识课程列表
			if(gencourses!=null) {
				mav.addObject("isError",false);
				mav.addObject("gencourses", gencourses);
			}
			return mav;
		}	
		
		//保存通识课选课信息
		@RequestMapping("addGenCourseOP.do")
		public ModelAndView addGenCourseOP(Integer cultivationid,String gencourseitems,HttpServletRequest request,
				HttpServletResponse response){
			logger.info("方案id:"+cultivationid);
			logger.info("选中的通识课程信息");
			logger.info(gencourseitems);
			ModelAndView mav = new ModelAndView("jsonView");
			int tag=0;
			if(gencourseitems!=null)//选中的通识课不为空
			{
				String[] items = gencourseitems.split(";");
				List<genenalCourseCultivationScheme> itemList = new ArrayList<genenalCourseCultivationScheme>();
				for(String tmp:items) {
					genenalCourseCultivationScheme item=new genenalCourseCultivationScheme();
					item.setGenenalcourseId(Integer.parseInt(tmp));
					item.setCultivationschemeId(cultivationid);
					itemList.add(item);
				}
				tag=courseService.addGenenalCourse(itemList);//批量插入数据
			}
			if(tag>0) {
				mav.addObject("success", "true");
			}
			return mav;	
		}
		//根据培养方案id获取已添加的通用课程列表
			public List<GenenalCourse> SelectGenenalCourseIdsByCulid(Integer cultivationid,String GenCourseDesc,HttpServletRequest request) {
					genenalCourseCultivationSchemeExample example=new genenalCourseCultivationSchemeExample();
					genenalCourseCultivationSchemeExample.Criteria criteria =example.createCriteria();
		 			criteria.andCultivationschemeIdEqualTo(cultivationid);
					List<genenalCourseCultivationScheme> gencourseculs=courseService.SelectGenCourseCulByCulId(example);//查询通识课程列表
					List<GenenalCourse> gencourses=null;
					if(gencourseculs!=null) {
						gencourses=new ArrayList<GenenalCourse>();
						for(genenalCourseCultivationScheme tmp:gencourseculs) {
							GenenalCourse genCourse=new GenenalCourse();
							genCourse=courseService.SelectGenenalCourseByGenCourseId(tmp.getGenenalcourseId());
							if(GenCourseDesc!="") {//若描述不为空
								if(GenCourseDesc.equals(genCourse.getCourseclassifcationdesc())) {
								//根据课程类别描述再进行筛选
									gencourses.add(genCourse);	
								}
							}else {
								gencourses.add(genCourse);
							}
						}
					}
					return gencourses;
				}
			//根据课程类别id获取课程类别
			@RequestMapping("getByChildClassificationId")	
			public ModelAndView getByChildClassificationId(Integer childccId,HttpServletRequest request) {
				logger.info("子类别id:"+childccId);
				ModelAndView mav = new ModelAndView("jsonView");
				ChildCourseClassification childcc=childccService.getByID(childccId);
				if(childcc!=null) {
					mav.addObject("isError",false);
					mav.addObject("childcc", childcc);
				}
				return mav;
			}
}

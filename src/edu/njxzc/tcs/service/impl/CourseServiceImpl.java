package edu.njxzc.tcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.njxzc.tcs.bean.Course;
import edu.njxzc.tcs.bean.CourseExample;
import edu.njxzc.tcs.bean.GenenalCourse;
import edu.njxzc.tcs.bean.GenenalCourseExample;
import edu.njxzc.tcs.bean.genenalCourseCultivationScheme;
import edu.njxzc.tcs.bean.genenalCourseCultivationSchemeExample;
import edu.njxzc.tcs.dao.CourseMapper;
import edu.njxzc.tcs.dao.GenenalCourseMapper;
import edu.njxzc.tcs.dao.genenalCourseCultivationSchemeMapper;
import edu.njxzc.tcs.service.CourseService;

/**
 * created by 2018-06-26
 * wxz于2018-07-06 modified SelectCourseByCultivationId方法
 * added method of SelectGenenalCourseByClassificationId at 2018-07-10
 * added method of addGenenalCourse at 2018-07-11
 * @author wxz
 *
 */

@Service
public class CourseServiceImpl implements CourseService {
	@Resource
	private CourseMapper courseMapper;
	@Resource
	private GenenalCourseMapper gcMapper;
	@Resource
	private genenalCourseCultivationSchemeMapper gccsMapper;
	
	public CourseServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Course> SelectAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> SelectCourseByCultivationId(CourseExample example) {
		// TODO Auto-generated method stub
		return courseMapper.selectByExample(example);
	}

	@Override
	public Course getByID(int id) {
		// TODO Auto-generated method stub
		return courseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseMapper.insert(course);
	}

	@Override
	public int updateCourse(Course course) {
		// TODO Auto-generated method stub
		return courseMapper.updateByPrimaryKey(course);
	}

	@Override
	public int DelCourse(Integer id) {
		// TODO Auto-generated method stub
		return courseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<GenenalCourse> SelectGenenalCourseByClassificationId(GenenalCourseExample example) {
		// TODO Auto-generated method stub
		return gcMapper.selectByExample(example);
	}

	@Override
	public int addGenenalCourse(List<genenalCourseCultivationScheme> itemList) {
		// TODO Auto-generated method stub
		return gccsMapper.insertByBatch(itemList);
	}

	@Override
	public List<genenalCourseCultivationScheme> SelectGenCourseCulByCulId(
			genenalCourseCultivationSchemeExample example) {
		// TODO Auto-generated method stub
		return gccsMapper.selectByExample(example);
	}

	@Override
	public GenenalCourse SelectGenenalCourseByGenCourseId(Integer coursid) {
		// TODO Auto-generated method stub
		return gcMapper.selectByPrimaryKey(coursid);
	}

	@Override
	public int DelGenCourse(Integer cultivationid, Integer id) {
		// TODO Auto-generated method stub
		//根据培养方案id和课程id获取关联对象
		genenalCourseCultivationSchemeExample gccsExample=new genenalCourseCultivationSchemeExample();
		edu.njxzc.tcs.bean.genenalCourseCultivationSchemeExample.Criteria criteria =gccsExample.createCriteria();
		criteria.andCultivationschemeIdEqualTo(cultivationid);
		criteria.andGenenalcourseIdEqualTo(id);
		List<genenalCourseCultivationScheme> gccs= gccsMapper.selectByExample(gccsExample);
		int tag=0;	
		if(gccs!=null) {
			tag=gccsMapper.deleteByPrimaryKey(gccs.get(0).getCulGenenalcourseid());
		}
		return tag;
	}

}

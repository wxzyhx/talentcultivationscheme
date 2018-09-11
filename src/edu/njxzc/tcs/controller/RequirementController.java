package edu.njxzc.tcs.controller;

import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.njxzc.tcs.bean.Requirement;
import edu.njxzc.tcs.bean.Requirementitem;
import edu.njxzc.tcs.service.CultivationSchemeService;
import edu.njxzc.tcs.service.RequirementItemService;
import edu.njxzc.tcs.service.RequirementService;


/**
 * 2018-06-26创建
 * @author wxz
 *
 */

@Controller
@RequestMapping("require/")
public class RequirementController {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Resource
	private CultivationSchemeService culService;
	@Resource
	private RequirementService reqService;//实例化毕业要求service
	@Resource
	private RequirementItemService reqItemService;//实例化毕业要求分解项service
	
	
	//根据培养方案id获取毕业要求
	@RequestMapping("getRequirementsByCulid")
	public ModelAndView getRequirementsByCulid(Integer cultivationid,HttpServletRequest request) {
		logger.info("方案id:"+cultivationid);
		ModelAndView mav = new ModelAndView("jsonView");
		List<Requirement> reqs=reqService.SelectRequirementsByCultivationId(cultivationid);//查询毕业要求
		if(reqs!=null) {
			mav.addObject("isError",false);
			mav.addObject("reqs", reqs);
		}
		return mav;
	}
	
	//保存新建毕业要求
	@RequestMapping("addReqOP")
	public ModelAndView addReq(Requirement req,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("添加毕业要求");
		logger.info(req.getCultivationschemeId());
		ModelAndView mav = new ModelAndView("jsonView");
		int tag=reqService.addRequirement(req);
		if(tag>0) {
			mav.addObject("success", "true");
			mav.addObject("req", req);
		}
		return mav;	
	}
	
	//删除毕业要求
	@RequestMapping(value="delReqById.do")
	public ModelAndView delReqById(int id){
		logger.info("删除要求id:"+id);
		int result =reqService.DelRequirement(id);
		ModelAndView mav = new ModelAndView("jsonView");
		if (result > 0) {
			mav.addObject("result", "SUCCESS");
		} else {
			mav.addObject("result", "false");
		}
		return mav;
	}
	
	//打开修改毕业要求模态框
	@RequestMapping("updateReq.do")
	public ModelAndView updateReq(int id) {
		Requirement req = reqService.getByID(id);
		ModelAndView mav = new ModelAndView("jsonView");
		if(req!=null) {
			mav.addObject("req", req);
		}
		return mav;
	}
	
	//保存修改毕业要求
	@RequestMapping("updateReqOP.do")
	public ModelAndView updateReqOP(Requirement req,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("修改毕业要求");
		logger.info(req.getCultivationschemeId());
		ModelAndView mav = new ModelAndView("jsonView");
		int tag=reqService.updateRequirement(req);
		if(tag>0) {
			mav.addObject("success", "true");
			mav.addObject("req", req);
		}
		return mav;	
	}
	
	//创建毕业要求分解项
		@RequestMapping("addReqItem")
		public ModelAndView updateReqItem(Requirementitem reqItem,HttpServletRequest request,
				HttpServletResponse response){
			logger.info("创建毕业要求分解项");
			logger.info(reqItem.getRequirementId());
			ModelAndView mav = new ModelAndView("jsonView");
			int tag=reqItemService.addReqItem(reqItem);
			if(tag>0) {
					mav.addObject("result", "SUCCESS");
					mav.addObject("reqItem", reqItem);
				} else {
					mav.addObject("result", "FALSE");
			}
			return mav;	
		}
	
		//根据毕业要求id获取毕业要求
				@RequestMapping("getReqByReqId")
				public ModelAndView getReqByReqId(Integer requireId,HttpServletRequest request) {
					logger.info("毕业要求id:"+requireId);
					Requirement req=reqService.getByID(requireId);//查询培养要求
					ModelAndView mav = new ModelAndView();
					if(req != null) {
						mav.addObject("req", req);
						mav.addObject("isError", false);
						mav.addObject("success", true);
						mav.setViewName("list_requireItem");
					}
					return mav;
				}
				
		//根据毕业要求id获取分解项列表
		@RequestMapping("getReqItemByReqId")
		public ModelAndView getReqItemByReqId(Integer requireId,HttpServletRequest request) {
			logger.info("毕业要求id:"+requireId);
			ModelAndView mav = new ModelAndView("jsonView");
			List<Requirementitem> reqItems=reqItemService.SelectReqItemByRequireId(requireId);//查询毕业要求分解项
			if(reqItems!=null) {
				mav.addObject("reqItems", reqItems);
			}
			mav.addObject("isError", false);
			return mav;
		}
	
		//删除毕业要求分解项
		@RequestMapping(value="delReqItemById.do")
		public ModelAndView delReqItemById(int id){
			int result = reqItemService.DelReqItem(id);
			ModelAndView mav = new ModelAndView("jsonView");
			if (result > 0) {
				mav.addObject("result", "SUCCESS");
			} else {
				mav.addObject("result", "false");
			}
			return mav;
		}
		
		//打开修改毕业要求分解项模态框
		@RequestMapping("updateReqItem.do")
		public ModelAndView updateReqItem(int id) {
			Requirementitem reqItem = reqItemService.getByID(id);
			ModelAndView mav = new ModelAndView("jsonView");
			if(reqItem!=null) {
				mav.addObject("reqItem", reqItem);
			}
			return mav;
		}
		
		//提交修改后的毕业要求分解项
		@RequestMapping(value="updateReqItemOp.do")
		public ModelAndView updateReqItemOp(Requirementitem reqItem) throws ParseException {
			int result = reqItemService.updateReqItem(reqItem);
			ModelAndView mav = new ModelAndView("jsonView");
			if (result > 0) {
				mav.addObject("result", "SUCCESS");
			} else {
				mav.addObject("result", "FALSE");
			}
			return mav;
		} 
}

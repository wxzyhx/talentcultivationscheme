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


import edu.njxzc.tcs.bean.Objective;
import edu.njxzc.tcs.bean.ObjectiveItem;
import edu.njxzc.tcs.service.CultivationSchemeService;
import edu.njxzc.tcs.service.ObjectiveItemService;
import edu.njxzc.tcs.service.ObjectiveService;


/**
 * 2018-06-24创建
 * @author wxz
 *
 */

@Controller
@RequestMapping("objective/")
public class ObjectiveController {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Resource
	private CultivationSchemeService culService;
	@Resource
	private ObjectiveService objService;//实例化目标service
	@Resource
	private ObjectiveItemService objItemService;//实例化目标分解项service
	
	
	//根据培养方案id获取培养目标
	@RequestMapping("getObjectiveByCulid")
	public ModelAndView getObjectiveByCulid(Integer cultivationid,HttpServletRequest request) {
		logger.info("方案id:"+cultivationid);
		ModelAndView mav = new ModelAndView("jsonView");
		Objective obj=objService.SelectObjectiveByCultivationId(cultivationid);//查询目标
		if(obj!=null) {
			mav.addObject("obj", obj);
		}
		return mav;
	}
	
	//保存新建培养目标
	@RequestMapping("addObjOP")
	public ModelAndView addObj(Objective obj,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("添加培养目标");
		logger.info(obj.getObjectivecontent());
		ModelAndView mav = new ModelAndView("jsonView");
		int tag=objService.addObjective(obj);
		if(tag>0) {
			mav.addObject("success", "true");
			mav.addObject("obj", obj);
		}
		return mav;	
	}
	
	//保存修改培养目标
	@RequestMapping("updateObj")
	public ModelAndView updateObj(Objective obj,HttpServletRequest request,
			HttpServletResponse response){
		logger.info("修改培养目标");
		logger.info(obj.getObjectivecontent());
		ModelAndView mav = new ModelAndView("jsonView");
		int tag=objService.updateObjective(obj);
		if(tag>0) {
			mav.addObject("success", "true");
			mav.addObject("obj", obj);
		}
		return mav;	
	}
	
	//创建目标分解项
		@RequestMapping("addObjItem")
		public ModelAndView updateObjItem(ObjectiveItem objItem,HttpServletRequest request,
				HttpServletResponse response){
			logger.info("创建目标分解项");
			logger.info(objItem.getObjectiveId());
			ModelAndView mav = new ModelAndView("jsonView");
			int tag=objItemService.addObjItem(objItem);
			if(tag>0) {
					mav.addObject("result", "SUCCESS");
					mav.addObject("obj", objItem);
				} else {
					mav.addObject("result", "FALSE");
			}
			return mav;	
		}
	
		//根据培养目标id获取目标分解项列表
		@RequestMapping("getObjItemByObjId")
		public ModelAndView getObjItemByObjId(Integer objectiveId,HttpServletRequest request) {
			logger.info("目标id:"+objectiveId);
			ModelAndView mav = new ModelAndView("jsonView");
			List<ObjectiveItem> objItems=objItemService.SelectObjItemByObjectiveId(objectiveId);//查询目标分解项
			if(!objItems.isEmpty()) {
				mav.addObject("objectiveitems", objItems);
			}
			mav.addObject("isError", false);
			return mav;
		}
	
		//删除目标分解项
		@RequestMapping(value="delObjItemById.do")
		public ModelAndView delObjItemById(int id){
			int result = objItemService.DelObjItem(id);
			ModelAndView mav = new ModelAndView("jsonView");
			if (result > 0) {
				mav.addObject("result", "SUCCESS");
			} else {
				mav.addObject("result", "false");
			}
			return mav;
		}
		
		//打开修改目标分解项模态框
		@RequestMapping("updateObjItem.do")
		public ModelAndView update(int id) {
			ObjectiveItem objItem = objItemService.getByID(id);
			ModelAndView mav = new ModelAndView("jsonView");
			if(objItem!=null) {
				mav.addObject("objItem", objItem);
			}
			return mav;
		}
		
		//提交修改后的目标分解项
		@RequestMapping(value="updateObjItemOp.do")
		public ModelAndView updateObjItemOp(ObjectiveItem objItem) throws ParseException {
			int result = objItemService.updateObjItem(objItem);
			ModelAndView mav = new ModelAndView("jsonView");
			if (result > 0) {
				mav.addObject("result", "SUCCESS");
			} else {
				mav.addObject("result", "FALSE");
			}
			return mav;
		} 
}

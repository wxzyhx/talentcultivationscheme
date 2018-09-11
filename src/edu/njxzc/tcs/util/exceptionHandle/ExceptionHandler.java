package edu.njxzc.tcs.util.exceptionHandle;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.util.ClassUtils;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


public class ExceptionHandler implements HandlerExceptionResolver {

	Logger log = Logger.getLogger(this.getClass());
	
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
    	log.info("异常处理" + ex.getMessage());
    	
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("ex", ex);
        String viewName = ClassUtils.getShortName(ex.getClass());
        model.put("className",viewName);
        model.put("errorMsg","异常信息：您提交的请求，捕获到一个异常，不能进行处理！\\n" +
                "异常类型："+viewName +";\\n" +
                "异常详细信息："+ex+"\\n");
        model.put("errorSimpleMsg","异常信息：您提交的请求，捕获到一个异常，不能进行处理！\\n" +
                "异常类型："+viewName +";");

        ex.printStackTrace();

        return new ModelAndView("/error.jsp", model);
    }

}

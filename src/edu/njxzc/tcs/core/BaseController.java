package edu.njxzc.tcs.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.njxzc.tcs.util.basicutils.JsonUtil;

/** 
 * 返回服务端处理结果 
 * @param obj 服务端输出各类对象 
 * @return 输出处理结果给前段JSON格式数据 
 * @author wxz
 * @since 2017-01-06 
 */  
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());  
    protected final static String DATE_FORMATE = "yyyy-MM-dd";  
    
  
    public String responseResult(Object obj){  
    	return JsonUtil.object2json(obj);
    }
    
    public String list2json(List list) {
    	return JsonUtil.list2json(list);
    }
    
    public String  array2json(Object[] array) {
    	return JsonUtil.array2json(array);
    }
    
    public String  map2json(Map<?, ?> map) {  
    	return JsonUtil.map2json(map);
    }
    
    public String  set2json(Set set) {  
    	return JsonUtil.set2json(set);
    }
    
    public String  string2json(String s) { 
    	return JsonUtil.string2json(s);
    }
}

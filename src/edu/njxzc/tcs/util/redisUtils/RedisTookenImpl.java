package edu.njxzc.tcs.util.redisUtils;

import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.gson.JsonObject;

import edu.njxzc.tcs.util.encryptUtils.MD5Util;


@Component("redistooken")
public class RedisTookenImpl extends RedisBaseImpl implements RedisI {
	
	private static Logger logger = Logger.getLogger(RedisTookenImpl.class);
	public static final String PHONETK = RedisBaseImpl.TKBASE+"tk:phonetk:";
	public static final String USERTK = RedisBaseImpl.TKBASE+"tk:usertk:";
	public static final String TOOKEN = "token";
	public static final String PHONE = "phone";
	public static final String USER = "user";
	public static final Integer TOOKENSEC = 6000*600*3;
	
	/**
	 * 通过tooken获取用户信息
	 * @param tooken
	 * @param op 操作权限list
	 * @return
	 */
	public JSONArray getUserOp(String tooken,JSONArray oparry){
		String userinfo =this.getUserInfoByTooken(tooken);
		JSONObject jobj = JSONObject.parseObject(userinfo);
		Object opcodeHmobj = jobj.get("opcodeHm");
		JSONObject opcodeHm = (JSONObject)opcodeHmobj;
		JSONArray jarr = new JSONArray();
		Set<String> set = opcodeHm.keySet();
		
		for(int i=0;i<oparry.size();i++){  
			for(String s:set){
				String value = oparry.get(i).toString();
				if(s.equals(value)){
					jarr.add(s);
				}
			}
		}
		return jarr;
	}
	
	
	/**
	 * 通过tooken获取用户信息
	 * @param tooken
	 * @return
	 */
	public String getUserInfoByTooken(String tooken){
		System.out.println("getUserInfoByTooken =================================================>>"+USERTK+tooken);
		String json = jedis.getHSet(USERTK+tooken, "user");
		return json;
	}
	
	
	
	
	
	/**
	 * 获取 通过手机号获取 token
	 * @param phone
	 * @param tooken
	 * @return
	 */
	public String getphonetk(String phone){
		String mk = PHONETK+phone;
		String rdtk = jedis.getHSet(mk, RedisTookenImpl.TOOKEN);
		return rdtk;
	}
	
	
	/**
	 * 通过token 获取用户信息
	 * @param tk
	 * @return
	 */
	public String getusertk(String tk){
		String mk = USERTK+tk;
		String rdtk = jedis.getHSet(mk, RedisTookenImpl.USER);
		return rdtk;
	}
	
	/**
	 * 用户登录后token信息初始化
	 * @param phone
	 * @param obj
	 * @return
	 */
	public String loginInitTooken(String phone,Object obj){
		String tooken = "";
		String json = "";
		try {
			tooken = this.getphonetk(phone);
			if(tooken!=null){
				tooken = this.writephonetk(phone);
				json = JSONObject.toJSONString( obj, SerializerFeature.WriteMapNullValue );
				tooken = this.writeusertk(tooken, phone, json);
				this.resetTime(phone);
				return tooken;
			}else{
				tooken = this.writephonetk(phone);
				json = JSONObject.toJSONString( obj, SerializerFeature.WriteMapNullValue );
				tooken = this.writeusertk(tooken, phone, json);
				return tooken;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * tooken重置
	 * @param phone
	 */
	private void resetTime(String phone) {
		String tooken = "";
		String mk = "";
		tooken = this.getphonetk(phone);
		mk = PHONETK+phone;
		jedis.expire(mk, TOOKENSEC);
		mk = USERTK+tooken;
		jedis.expire(mk, TOOKENSEC);
	}

	/**
	 * 写入 phone&token 关联
	 * @param user
	 * @param sec
	 * @return
	 */
	private String writephonetk(String phone){
		String tk =  getTooken(phone);
		String mk = PHONETK+phone;
		try {
			jedis.setHSet(mk, TOOKEN, tk);
			jedis.expire(mk, TOOKENSEC);
		} catch (Exception e) {
			tk = "";
			e.printStackTrace();
		}
		return tk;
	}
	
	/**
	 * 写入 user&token关联
	 * @param phone
	 * @param obj
	 * @param sec
	 * @return
	 */
	private String writeusertk(String tooken,String phone,String json){
		String mk = USERTK+tooken;
		try {
			jedis.setHSet(mk, PHONE, phone);
			jedis.setHSet(mk, USER, json);
			jedis.expire(mk, TOOKENSEC);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tooken;
	}
	

	
	
	/**
	 * 获取tooken
	 * @param phone
	 * @return
	 */
	private  String getTooken(String phone){
		String tooken =  MD5Util.GetMD5Code(System.currentTimeMillis()+phone);
		logger.info("========================================>>>>tooken>>>>>>  "+tooken);
		return tooken;
	}

	/**
	 * tooken时间更新
	 * @param string
	 */
	public void updateTookenTime(String string) {
		jedis.expire(string, TOOKENSEC);
	}
	
}

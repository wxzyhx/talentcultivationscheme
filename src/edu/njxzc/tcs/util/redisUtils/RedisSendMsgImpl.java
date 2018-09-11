package edu.njxzc.tcs.util.redisUtils;

import org.springframework.stereotype.Component;

@Component("redissendmsg")
public class RedisSendMsgImpl extends RedisBaseImpl implements RedisI {
	public static final String Msg_domain = RedisBaseImpl.TKBASE+"Msg:";
	public static final int sec =6000*600*3;
	
	/**
	 * phone 手机
	 * value 验证码
	 * @param phone
	 * @param value
	 */
	public void SendMsgWrite(String phone,String value){
		phone = Msg_domain+phone;
		jedis.set(phone, value);
		jedis.expire(phone, sec);
	}
	
	/**
	 * 通过手机获取验证码
	 * @param phone
	 * @return
	 */
	public String SendMsgRead(String phone){
		phone = Msg_domain+phone;
		return jedis.get(phone);
	}
	
	
}

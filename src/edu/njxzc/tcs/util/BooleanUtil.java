package edu.njxzc.tcs.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BooleanUtil {

	/**
	 * 符合要求的数据返回true
	 * 
	 * @param value
	 * @return
	 */
	public static boolean StringIsDouble(String value) {
		if (value != null && !value.equals("")) {
			try {
				Double.parseDouble(value);
				return true;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * 手机号判断
	 * 
	 * @param value
	 * @return
	 */
	public static boolean StringPhoneIsNa(String value) {
		if (value != null && !value.equals("")) {
			//String check = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
			String check = "^(13[0-9]|14[579]|15[012356789]|17[0135678]|18[0-9])[0-9]{8}$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(value);
			return matcher.matches();
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(StringPhoneIsNa("13675199731"));
	}

	/**
	 * 邮箱字符串判断
	 * 
	 * @param value
	 * @return
	 */
	public static boolean StringEmailIsNa(String value) {
		if (value != null && !value.equals("")) {
			String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(value);
			return matcher.matches();
		} else {
			return false;
		}
	}

	/**
	 * 符合要求的数据返回true
	 * 
	 * @param value
	 * @return
	 */
	public static boolean StringIsNa(String value) {
		if (value != null && !value.equals("")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 日期字符串判断
	 * 
	 * @param value
	 * @return
	 */
	public static boolean StringDateIsNa(String value) {
		if (value != null && !value.equals("")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh24:mm:ss");
			try {
				sdf.parse(value);
				return true;
			} catch (ParseException e) {
				try {
					sdf2.parse(value);
					return true;
				} catch (ParseException e1) {
					return false;
				}
			}
		} else {
			return false;
		}
	}

}

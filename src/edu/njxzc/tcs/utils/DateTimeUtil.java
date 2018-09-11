package edu.njxzc.tcs.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

	public static final String YEAR_FORMAT = "yyyy";
	
	public static Date strToDate(String dateTimeStr) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(YEAR_FORMAT);
		Date date = sdf.parse(dateTimeStr);
		return date;		
	}
	
	public static String dateToStr(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(YEAR_FORMAT);
		String str = sdf.format(date);
		return str;
	}
}

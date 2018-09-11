package edu.njxzc.tcs.util.excelutils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class ExcelUtils {

	private static int totalRows = 0;// 总行数
	    
	public static Workbook chooseWorkbook(String fileName, InputStream in) throws IOException {
		Workbook wb = null;
		int isExcel = ExcelUtils.isExcel(fileName);
		if(isExcel == 0){
			wb = new HSSFWorkbook(in);
		}else if(isExcel == 1){
			wb = new XSSFWorkbook(in);
		}
		return wb;
	}

	private static int isExcel(String fileName) {
		String ext = fileName.substring(fileName.lastIndexOf(".")+1);
		if("xls".equals(ext)){
			return 0;
		}
		if("xlsx".equals(ext)){
			return 1;
		}		
		return -1;
	}
	@SuppressWarnings("unchecked")
	public static <T> List<T> readDataList(Workbook wb, T t,int startRows,int endRows) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		List<T> listt = new ArrayList<T>();		
		//读取第一个shell
		Sheet sheet = wb.getSheetAt(0);
		//设置总行数
		totalRows = endRows;	
		//根据起止行读取excel表
		for(int r = startRows ;r<=endRows ;r++){
			Object newInstance = t.getClass().newInstance();
			//获取一行
			Row row  = sheet.getRow(r);
			if(row == null){
				continue;
			}
			Object entityMemberValue = "";
			//获取类的所有属性
			Field[] fields = t.getClass().getDeclaredFields();
			int startCell = 0;
			//循环读取单元格
			for(int f=0;f<fields.length;f++){	
				//设置允许访问
				fields[f].setAccessible(true);
				//获取字段名
				String filedName = fields[f].getName();			
				Cell cell = row.getCell(startCell);
				//获取单元格值,转换成字符串
				String cellValue = getCellValue(cell);
				//调用getEntityMemberValue，依据实体类属性类型将读取的cellValue转换成对应类型并赋值
				entityMemberValue = getEntityMemberValue(entityMemberValue,fields,f,cellValue);
				//调用setProperty方法设置对应的newInstance中的字段属性值
				PropertyUtils.setProperty(newInstance,filedName,entityMemberValue);
				startCell++;
			}
			
			listt.add((T)newInstance);
		}
		
		return listt;
	}

	private static Object getEntityMemberValue(Object realValue,
			Field[] fields, int f, String cellValue) {
		String type = fields[f].getType().getName();
		switch(type){
			case "char":
			case "java.lang.Character":
			case "java.lang.String":
				realValue = cellValue;break;
			case "java.util.Date":
				realValue = StringUtils.isBlank(cellValue)?null:DateUtils.strToDate(cellValue);
				break;
			case "java.lang.Integer":
				realValue = StringUtils.isBlank(cellValue)?null:Integer.valueOf(cellValue);
				break;
			 case "int":
	         case "float":
	         case "double":
	         case "java.lang.Double":
	         case "java.lang.Float":
	         case "java.lang.Long":
	         case "java.lang.Short":
	         case "java.math.BigDecimal":
	        	 realValue = StringUtils.isBlank(cellValue) ? null : new BigDecimal(cellValue);
	             break;
	         default:
	                break;   
		}
		return realValue;
	}

	private static String getCellValue(Cell cell) {
		String cellValue = "";
		
		if(cell != null){
			switch(cell.getCellType()){
				//数字
				case HSSFCell.CELL_TYPE_NUMERIC: 
					if(DateUtil.isCellDateFormatted(cell)){
						Date date = cell.getDateCellValue();
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
						cellValue = df.format(date);
						
					}else{
						DecimalFormat df  = new DecimalFormat("0");
						cellValue = df.format(cell.getNumericCellValue());
						
					}
					break;
				case HSSFCell.CELL_TYPE_STRING:
					cellValue = cell.getStringCellValue();break;
				case HSSFCell.CELL_TYPE_BOOLEAN:
					cellValue = cell.getBooleanCellValue()+"";break;
				case HSSFCell.CELL_TYPE_FORMULA:
					cellValue = cell.getCellFormula()+"";
				case HSSFCell.CELL_TYPE_BLANK: // 空值
                    cellValue = "";
                    break;                
                case HSSFCell.CELL_TYPE_ERROR: // 故障
                    cellValue = "非法字符";
                    break;                
                default:
                    cellValue = "未知类型";
                    break;
			}
		}
		return cellValue;
	}
	
	public static class DateUtils
    {
        public static final String YYYY_MM_DDHHMMSS = "yyyy-MM-dd HH:mm:ss";
        
        public static final String YYYY_MM_DD = "yyyy-MM-dd";
        
        public static final String YYYY_MM = "yyyy-MM";
        
        public static final String YYYY = "yyyy";
        
        public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
        
        public static final String YYYYMMDD = "yyyyMMdd";
        
        public static final String YYYYMM = "yyyyMM";
        
        public static final String YYYYMMDDHHMMSS_1 = "yyyy/MM/dd HH:mm:ss";
        
        public static final String YYYY_MM_DD_1 = "yyyy/MM/dd";
        
        public static final String YYYY_MM_1 = "yyyy/MM";
    
        public static String dateToStr(Date date, String pattern)
        {
            SimpleDateFormat format = null;
            
            if (null == date)
                return null;
            format = new SimpleDateFormat(pattern, Locale.getDefault());
            
            return format.format(date);
        }
        
      
        public static Date strToDate(String s)
        {
        	 DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy");
             DateTime dateTime = dateTimeFormatter.parseDateTime(s);
             System.out.println("dateTime.toDate()"+dateTime.toDate());
             return dateTime.toDate();
        }
    }

	
}
package edu.njxzc.tcs.util.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

public class TestExcel {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		try {
			String fileName = "test.xlsx";
			InputStream in =  new FileInputStream(new File("excels\\test.xlsx"));
			//根据文件名选择创建XSSF或者HSSF 													
			Workbook wb = ExcelUtils.chooseWorkbook(fileName,in);
			Expert expert = new Expert();
			ExcelUtils excelUtils = new ExcelUtils();
			//readDataList方法获取数据集合，参数：工作簿实例，对应实体类，起始行，结束行。返回值List<T>。excel从0开始计行
			List<Expert> readDataList = ExcelUtils.readDataList(wb,expert,1,2);	
			
			for(Expert str:readDataList){
				System.out.println(str.toString());
			}		
			//TODO 当wb为空时代表文件类型异常
			System.out.println("111111111111");
		} catch (FileNotFoundException e) {
			System.out.println("文件加载失败");
		}
	}

}


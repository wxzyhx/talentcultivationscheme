package edu.njxzc.tcs.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
	private Properties loadProperties(String resources) throws FileNotFoundException {
	   // 使用InputStream得到一个资源文件
	   InputStream inputstream = new FileInputStream(resources);
	   // new 一个Properties
	   Properties properties = new Properties();
	   try {
	   // 加载配置文件
	      properties.load(inputstream);
	      return properties;
	   } catch (IOException e) {
	      throw new RuntimeException(e);
	   } finally {
	      try {
	         inputstream.close();
	      } catch (IOException e) {
	         throw new RuntimeException(e);
	      }
	   }
	}
	
	public Properties readProperties() throws FileNotFoundException{
		String resources = PropertyUtil.class.getClassLoader().getResource("prop.properties").getPath();
		Properties properties = loadProperties(resources);
		return properties;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		PropertyUtil p=new PropertyUtil();
		Properties pro=p.readProperties();
		System.out.println(pro.get("webUrl"));
		/*String path = PropertyUtil.class.getClassLoader().getResource("prop.properties").getPath();
		System.out.println(path);*/
	}
}

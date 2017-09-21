package com.library;

import java.io.FileInputStream;
import java.util.Properties;

public class GenericClass {
	public static String sDirpath=System.getProperty("user.dir");
	public static String sconfigPath=sDirpath+"\\config.properties";

	public  static String getProperties(String key){
		
		String svalue=null;
		
		Properties properties=new Properties();
		
		try
		{
			
			FileInputStream input=new FileInputStream(sconfigPath);
			properties.load(input);
			svalue=properties.getProperty(key);
	}catch(Exception e){
			
		}
		return svalue;
		
	}

}

package com.library;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pageobjectmodel.LoginModule;

import cucumber.api.java.After;


public class BaseClass {
	
	public static  WebDriver driver;
	
	
	
  
	
	public  static  void launchingBrowser() throws Exception{
		try{
			
			if(GenericClass.getProperties("BROWSERNAME").equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", GenericClass.sDirpath+"\\BrowserDriver\\chromedriver.exe");
			 driver=new ChromeDriver();
			 geturl();
		}else if(GenericClass.getProperties("BROWSERNAME").equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver",  GenericClass.sDirpath+"\\BrowserDriver\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 geturl();
		}
		
			
		}catch(Exception e){
			throw e;
		}
	}
	public static  void geturl(){
		driver.get("http://www.abof.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
}

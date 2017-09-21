package com.testscriptdefention;

import org.openqa.selenium.By;

import com.library.BaseClass;

import cucumber.api.java.en.Given;

public class HomeModuleTEST extends BaseClass {
	
	
	
	
	@Given("^verify the  text$")
	public void verify_the_text() throws Throwable {
		
		System.out.println("the men is text");
	    // Write code here that turns the phrase above into concrete actions
	/*if(driver.findElement(By.xpath("//a[contains(text(),'Men')]")).getText()=="Men"){
		
		System.out.println("The men text is displayed in home page");
		
	}
	else{
		System.out.println("the men text is not displayed in home page");
	}
	}*/
	}
	

}

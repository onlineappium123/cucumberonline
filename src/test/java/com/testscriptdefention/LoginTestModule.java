package com.testscriptdefention;

import java.util.List;

import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.library.BaseClass;
import com.pageobjectmodel.LoginModule;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestModule {
	
	@Before
	public void test(){
		try{
			BaseClass.launchingBrowser();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
/*	@Given("^Lauching the browser and enter the url$")
	public void lauching_the_browser_and_enter_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    launchingBrowser();
	}*/

	@Given("^Click on sign-inregister link$")
	public void click_on_sign_inregister_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    LoginModule login=new LoginModule();
		//Thread.s
	    login.abofSignInRegisterLink.click();
	}
	
	@Given("^Click on ALreadyRegister option$")
	public void click_on_ALreadyRegister_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    LoginModule login=new LoginModule();
	    login.abofAlreadyRegisterdOption.click();
	}
	
	/*@When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 LoginModule login=new LoginModule();
		 login.abofLoginEmailTextBox.sendKeys(username);
		 login.abofPasswordTextBox.sendKeys(password);
	   
	}*/
	
	@When("^Enter the email and password$")
	public void enter_the_email_and_password(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>>table=arg1.raw();
		System.out.println(table.get(2).get(0));
	   
	}
	
	@Then("^verify the men text in the homepage$")
	public void verify_the_men_text_in_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 LoginModule login=new LoginModule();
		 if(login.abofMenText.getText()=="Men"){
			 System.out.println("The Men text is displayed in homepage");
		 }
		 else{
			 System.out.println("The men text is not displayed in homepage");
		 }
	}
	/*@When("^Enter the username and password$")
	public void enter_the_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    LoginModule login=new LoginModule();
	    login.abofLoginEmailTextBox.sendKeys("abofqa.raghu@gmail.com");
	    login.abofPasswordTextBox.sendKeys("raghukiran92");
	   
	}
	*/
	@When("^Click on sign-in button$")
	public void click_on_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 LoginModule login=new LoginModule(); 
		 login.abofSignInButton.click();
		 //NXGReports.addStep("the sign-in button is click", LogAs.PASSED, null);
	}
	
	@Given("^verify the home page$")
	public void verify_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("verifgy the home poage");
	}
	
	@Given("^verify the men text$")
	public void verify_the_men_text() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("verifgy the home poage");
	}

	@After
	public void teardown(){
		BaseClass.driver.quit();
	}

	

}

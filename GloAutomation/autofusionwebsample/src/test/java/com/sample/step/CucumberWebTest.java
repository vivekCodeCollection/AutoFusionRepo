package com.sample.step;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.autofusionweb.config.TestCaseFailed;
import com.autofusionweb.config.TestDataManager;
import com.cucumber.weblistener.ExtentCucumberFormatter;
import com.sample.pages.HomeMethods;
import com.sample.pages.LoginMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberWebTest extends ExtentCucumberFormatter
{
	public WebDriver driver;
	LoginMethods loginMethod;
	HomeMethods homeMethod;
	TestDataManager testdata=new TestDataManager();
	
	@Given("^Launch the application$")
	public void OnLaunchScreen() {
		driver = getDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		loginMethod=new LoginMethods(driver);
		homeMethod=new HomeMethods(driver);
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
	}
	@When("^Enter the username and password$")
	public void EnterUserAndPass() throws IOException, TestCaseFailed 
	{
		loginMethod.isLoginPageShow();
		loginMethod.enterUserAndPass(testdata.read_property("Account", "login", "loginid"), testdata.read_property("Account", "login", "loginpass"));
		
	}
	@And("^Click on Sign In button$")
	public void clickWhatwedoOnHome() throws Throwable {
		loginMethod.clickLogin();
	}
	@Then("^Shows the home screen$")
	public void showHomeScreen() throws Throwable {
		Assert.assertFalse(loginMethod.isLoginPageShow());
	}
	
	//###################Scenario-2#######
	@When("^Enter the username and incorrect password$")
	public void EnterIncorrectUserAndPass() throws IOException, TestCaseFailed 
	{
		loginMethod.isLoginPageShow();
		loginMethod.enterUserAndPass(testdata.read_property("Account", "invalid", "invalidlogin"), testdata.read_property("Account", "invalid", "invalidpass"));		
	}
	@Then("^Does not show the home screen$")
	public void NotshowHomeScreen() throws Throwable {
		Assert.assertTrue(loginMethod.isLoginPageShow());
	}
}

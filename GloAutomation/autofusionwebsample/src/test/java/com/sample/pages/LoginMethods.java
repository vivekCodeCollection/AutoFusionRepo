package com.sample.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.annotation.values.PageName;
import com.autofusionweb.config.CommonWebMethods;
import com.autofusionweb.config.TestCaseFailed;
import com.sample.page.objects.LoginObject;

@PageName("Login Page")
public class LoginMethods extends CommonWebMethods
{
	LoginObject loginObj;

	public LoginMethods(WebDriver driver) 
	{
		super(driver);
		loginObj=new LoginObject();
	}
	public boolean isLoginPageShow() 
	{
		boolean found=false;
		try
		{
			checkElementPresence("xpath",loginObj.getLoginBtn());
			found=true;
		}catch (Exception e) 
		{
			found=false;
		}
		return found;
	}
	public void enterUserAndPass(String userid, String pass) throws IOException, TestCaseFailed
	{
		checkElementPresence("xpath",loginObj.getUserID());
		enterText("xpath",userid, loginObj.getUserID());

		checkElementPresence("xpath",loginObj.getUserPass());
		enterText("xpath",userid, loginObj.getUserPass());
		wait(100);
	}
	public void clickLogin() throws TestCaseFailed
	{
		checkElementPresence("xpath",loginObj.getLoginBtn());
		click("xpath",loginObj.getLoginBtn());
		checkPageIsReady();
		wait(2000);
	}
	public void loginWithValidCredential(String userid, String pass) throws IOException, TestCaseFailed
	{
		checkElementPresence("xpath",loginObj.getUserID());
		enterText("xpath",userid, loginObj.getUserID());

		checkElementPresence("xpath",loginObj.getUserPass());
		enterText("xpath",userid, loginObj.getUserPass());

		checkElementPresence("xpath",loginObj.getLoginBtn());
		click("xpath",loginObj.getLoginBtn());
		checkPageIsReady();
		wait(2000);
	}
	public void loginWithInValidCredential(String userid, String pass) throws IOException, TestCaseFailed
	{
		checkElementPresence("xpath",loginObj.getUserID());
		enterText("xpath",userid, loginObj.getUserID());

		checkElementPresence("xpath",loginObj.getUserPass());
		enterText("xpath",userid, loginObj.getUserPass());

		checkElementPresence("xpath",loginObj.getLoginBtn());
		click("xpath",loginObj.getLoginBtn());
		checkPageIsReady();
		wait(2000);
		Assert.assertFalse(isElementDisplayed("xpath",loginObj.getUserID()));
	}

}

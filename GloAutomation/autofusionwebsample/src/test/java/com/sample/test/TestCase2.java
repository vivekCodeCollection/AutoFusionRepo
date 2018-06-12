package com.sample.test;

import java.io.IOException;
import org.testng.annotations.Test;
import com.annotation.values.Author;
import com.autofusionweb.config.AutoFusionWeb;
import com.autofusionweb.config.TestCaseFailed;
import com.sample.pages.LoginMethods;

public class TestCase2 extends AutoFusionWeb
{
		LoginMethods loginMethod;
	
	@Test(groups = "smoke")
	@Author(name = "Dhirendra Jha")
	public void testInValidLogin() throws InterruptedException, IOException, TestCaseFailed
	{
		navigateURL();
		loginMethod=new LoginMethods(driver);
		loginMethod.isLoginPageShow();
		loginMethod.loginWithInValidCredential("admin", "pass1");
	}
}

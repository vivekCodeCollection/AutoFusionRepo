package com.sample.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.annotation.values.Author;
import com.autofusionweb.config.AutoFusionWeb;
import com.autofusionweb.config.TestCaseFailed;
import com.sample.pages.LoginMethods;
import com.sample.utils.HighLightsElement;
import com.sample.utils.VerifyBrokenLinks;

public class TestCase1 extends AutoFusionWeb
{
	LoginMethods loginMethod;
	HighLightsElement highLightsElement ;
	
	@Test(groups = "smoke")
	@Author(name = "Dhirendra Jha")
	public void testValidLogin() throws InterruptedException, IOException, TestCaseFailed
	{
		navigateURL();
		loginMethod=new LoginMethods(driver);
		loginMethod.isLoginPageShow();
		loginMethod.loginWithValidCredential("admin", "admin");
        new VerifyBrokenLinks(driver).verifyLinksofPage();
        highLightsElement=new HighLightsElement(driver);
        highLightsElement.findElement(By.xpath("//img[@alt='OrangeHRM']")).getText();
        
	}
}

package com.sample.pages;

import org.openqa.selenium.WebDriver;
import com.annotation.values.PageName;
import com.autofusionweb.config.CommonWebMethods;
import com.sample.page.objects.HomeObject;

@PageName("Home Page")
public class HomeMethods extends CommonWebMethods
{
	HomeObject homeObj;

	public HomeMethods(WebDriver driver) 
	{
		super(driver);
		homeObj=new HomeObject();
	}
	public boolean isHomePageShow() 
	{
		boolean found=false;
		try
		{
			checkElementPresence("xpath",homeObj.getMenuDashboard());
			found=true;
		}catch (Exception e) 
		{
			found=false;
		}
		return found;
	}
}

package com.sample.page.objects;

public class LoginObject 
{
	String userID="//input[@id='txtUsername']";
	String password="//input[@id='txtPassword']";
	String loginBtn="//input[@id='btnLogin']";
	
	public String getUserID()
	{
		return userID;
	}
	public String getUserPass()
	{
		return password;
	}
	public String getLoginBtn()
	{
		return loginBtn;
	}
}

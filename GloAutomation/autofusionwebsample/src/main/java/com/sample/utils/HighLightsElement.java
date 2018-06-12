package com.sample.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.autofusionweb.config.AutoFusionWeb;

public class HighLightsElement extends AutoFusionWeb{
	public static WebDriver driver;


	public HighLightsElement(WebDriver driver) {
    
		this.driver=driver;
		
	}
	
	public  WebElement findElement(By by) {
	    WebElement elem = driver.findElement(by);
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	    }
	    return elem;
	}

}

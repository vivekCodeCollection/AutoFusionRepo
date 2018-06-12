package com.sample.test;

import com.autofusionweb.manager.AfplusWebDriver;

import org.testng.annotations.Test;

public class Runner 
{
    @Test public void runWebTests() throws Exception 
    {
    	System.setProperty("java.home", "C:\\Program Files\\Java\\jdk1.8.0_161\\jre");
    	AfplusWebDriver afplusweb = new AfplusWebDriver();
    	afplusweb.runner("com.sample.test");
    }
}

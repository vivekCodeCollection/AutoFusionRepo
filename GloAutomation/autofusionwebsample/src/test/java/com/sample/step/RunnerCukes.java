package com.sample.step;

import org.junit.Test;
import com.autofusionweb.manager.AfplusWebDriver;

public class RunnerCukes 
{
	@Test 
    public void testCukesRunner() throws Exception 
    {
		AfplusWebDriver afplusweb = new AfplusWebDriver();
		afplusweb.runner("");
    }
}

package com.zoomcar.tests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.zoomcar.util.TestsUtil;

public class LoginTest {

	HashMap<String, String> params = new HashMap<String, String>();
	
	@BeforeClass(alwaysRun=true)
	@Parameters({ "browser" })
	public void beforeMethod(@Optional("firefox") String browserName){
		params.put("browser", browserName);
	}
	
	@Test
	public void signInTest() throws Exception{
		TestsUtil.startTest("Login", params);
	}
}

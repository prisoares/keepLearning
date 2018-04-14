package com.touchsurgery.redditsearch.hooks;

import com.touchsurgery.redditsearch.utils.TestContext;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class WebDriverHooks {

	@Before
	public void testSetUp() {
		// TODO Verify a better way to setup the driver
		TestContext.getDriver();
	}

	@After
	public void testShutDown() {
		TestContext.getDriver().manage().deleteAllCookies();
	}

	@After("@web")
	public static void testClassShutDown() {
		TestContext.getDriver().close();
	}
}

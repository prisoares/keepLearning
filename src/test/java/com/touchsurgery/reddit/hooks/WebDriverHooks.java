package com.touchsurgery.reddit.hooks;

import com.touchsurgery.reddit.utils.TestContext;

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

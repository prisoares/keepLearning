package com.touchsurgery.reddit.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContext {

  private static WebDriver driver;

  public static WebDriver getDriver() {
    if (driver == null) {
      driver = new ChromeDriver();
    }
    return driver;
  }

}

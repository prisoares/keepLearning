package com.touchsurgery.reddit.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

  private static final int TIMEOUT_SECONDS = 5;

  public static void waitUntilPresenceOfElementLocated(final By by) {
    final WebDriverWait wait = new WebDriverWait(TestContext.getDriver(), TIMEOUT_SECONDS);
    try {
      wait.until(ExpectedConditions.presenceOfElementLocated(by));
    } catch (final TimeoutException e) {
      // do nothing
    }
  }

}

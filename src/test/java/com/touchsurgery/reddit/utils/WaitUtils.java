package com.touchsurgery.reddit.utils;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

  private static final int TIMEOUT_SECONDS = 5;

  public static Optional<WebElement> waitUntilPresenceOfElementLocated(final By by) {
    final WebDriverWait wait = new WebDriverWait(TestContext.getDriver(), TIMEOUT_SECONDS);
    try {
      return Optional.of(wait.until(ExpectedConditions.presenceOfElementLocated(by)));
    } catch (final TimeoutException e) {
      return Optional.empty();
    }
  }
}

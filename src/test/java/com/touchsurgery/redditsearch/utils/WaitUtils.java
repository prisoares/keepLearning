package com.touchsurgery.redditsearch.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	public static void waitUntilRedditIsLoaded(final WebDriver driver, final By by) {
		final WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch (final TimeoutException e) {
			// do nothing
		}
	}

}

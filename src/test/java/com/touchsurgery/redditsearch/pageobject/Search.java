package com.touchsurgery.redditsearch.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.touchsurgery.redditsearch.constants.Constants;
import com.touchsurgery.redditsearch.utils.TestContext;
import com.touchsurgery.redditsearch.utils.WaitUtils;

public class Search {

	private final WebDriver driver;

	public Search() {
		this.driver = TestContext.getDriverInstance();
	}

	public void navigateToReddit() {
		driver.navigate().to(System.getProperty("search.host", Constants.URL));
		WaitUtils.waitUntilRedditIsLoaded(driver, By.id(Constants.DIV_WELCOME_TO_REDDIT_ID));
	}

	public void refreshTheScreen() {
		// TODO Auto-generated method stub
		
	}

	public void clickResetButton() {
		// TODO Auto-generated method stub
		
	}

}

package com.touchsurgery.redditsearch.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.touchsurgery.redditsearch.utils.TestContext;
import com.touchsurgery.redditsearch.utils.WaitUtils;

public class UsingRedditSearchPage {

	private static final String URL = "https://www.reddit.com";

	private static final String DIV_WELCOME_TO_REDDIT_ID = "desktop-onboarding-browse";
	
	private final WebDriver driver;

	public UsingRedditSearchPage() {
		this.driver = TestContext.getDriver();
	}

	public void navigateToReddit() {
		driver.navigate().to(System.getProperty("search.host", URL));
		WaitUtils.waitUntilRedditIsLoaded(driver, By.id(DIV_WELCOME_TO_REDDIT_ID));
	}

	public void refreshTheScreen() {
		// TODO Auto-generated method stub
		
	}

	public void clickResetButton() {
		// TODO Auto-generated method stub
		
	}

}

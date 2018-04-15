package com.touchsurgery.redditsearch.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.touchsurgery.redditsearch.utils.PropertiesProvider;
import com.touchsurgery.redditsearch.utils.TestContext;
import com.touchsurgery.redditsearch.utils.WaitUtils;

import org.openqa.selenium.support.PageFactory;

public class UsingRedditFrontPage {

  private static final String FRAMEWORK_PROPERTIES = "framework.properties";

  private static final String DIV_WELCOME_TO_REDDIT_ID = "desktop-onboarding-browse";

  private static final String SEARCH_HOST = "search.host";

  private static final String PRODUCTION_URL = "production.url";

  public RedditFrontPage createRedditFrontPage() {
    WebDriver driver = TestContext.getDriver();
    PropertiesProvider frameworkPropertiesProvider = new PropertiesProvider(FRAMEWORK_PROPERTIES);
    driver.get(System.getProperty(SEARCH_HOST, frameworkPropertiesProvider.getProperty(PRODUCTION_URL)));
    WaitUtils.waitUntilRedditIsLoaded(driver, By.id(DIV_WELCOME_TO_REDDIT_ID));
    return PageFactory.initElements(driver, RedditFrontPage.class);
  }

}

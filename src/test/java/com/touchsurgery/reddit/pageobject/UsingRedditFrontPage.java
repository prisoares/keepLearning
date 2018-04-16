package com.touchsurgery.reddit.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.touchsurgery.reddit.utils.PropertiesProvider;
import com.touchsurgery.reddit.utils.TestContext;
import com.touchsurgery.reddit.utils.WaitUtils;

public class UsingRedditFrontPage {

  private static final String FRAMEWORK_PROPERTIES = "framework.properties";

  private static final String DIV_WELCOME_TO_REDDIT_ID = "desktop-onboarding-browse";

  private static final String SEARCH_HOST = "search.host";

  private static final String PRODUCTION_URL = "production.url";

  public RedditFrontPage createRedditFrontPage() {
    WebDriver driver = TestContext.getDriver();
    navigateToSite(driver);
    return PageFactory.initElements(driver, RedditFrontPage.class);
  }

  private void navigateToSite(WebDriver driver) {
    PropertiesProvider frameworkPropertiesProvider = new PropertiesProvider(FRAMEWORK_PROPERTIES);
    driver.get(System.getProperty(SEARCH_HOST, frameworkPropertiesProvider.getProperty(PRODUCTION_URL)));
    WaitUtils.waitUntilPresenceOfElementLocated(By.id(DIV_WELCOME_TO_REDDIT_ID));
  }

}

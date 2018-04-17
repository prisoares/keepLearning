package com.touchsurgery.reddit.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.touchsurgery.reddit.utils.PropertiesProvider;
import com.touchsurgery.reddit.utils.TestContext;
import com.touchsurgery.reddit.utils.WaitUtils;

public class RedditFrontPage {
  private PropertiesProvider frameworkPropertiesProvider = new PropertiesProvider(FRAMEWORK_PROPERTIES);

  private static final String SEARCH_HOST = "search.host";

  private static final String PRODUCTION_URL = "production.url";

  private static final String TS_USERNAME = "username.touchsurgery";

  private static final String TS_PASSWORD = "password.touchsurgery";

  private static final String FRAMEWORK_PROPERTIES = "framework.properties";

  private static final String CSS_CLASS_ATTRIBUTRE = "class";

  private static final String DOWNVOTE_CSS_CLASS_NAME = "downmod";

  private static final String UPVOTE_CSS_CLASS_NAME = "upmod";

  private static final String LOGOUT_LINK_XPATH = "//*[@id=\"header-bottom-right\"]/form/a";

  private static final String DIV_WELCOME_TO_REDDIT_ID = "desktop-onboarding-browse";

  @FindBy(how = How.XPATH, using = "//*[@id=\"desktop-onboarding-sign-up-form\"]/p[2]/a[2]")
  private WebElement skipLoginLink;

  @FindBy(how = How.NAME, using = "q")
  private WebElement searchTextBox;

  @FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/input[2]")
  private WebElement searchSubmitButton;

  @FindBy(how = How.XPATH, using = "/html/body/div[6]/div[2]/div/div/div[1]/header/a")
  private WebElement firstSuredditResult;

  @FindBy(how = How.XPATH, using = "//*[@id=\"header-bottom-left\"]/ul/li[5]/a")
  private WebElement topPostsTab;

  @FindBy(how = How.XPATH, using = "//*[@id=\"siteTable\"]/div[1]/div[2]/div[1]/p[1]/a")
  private WebElement mostUpvotedPost;

  @FindBy(how = How.NAME, using = "user")
  private WebElement usernameField;

  @FindBy(how = How.NAME, using = "passwd")
  private WebElement passwordField;

  @FindBy(how = How.XPATH, using = "//*[@id=\"login_login-main\"]/div[4]/button")
  private WebElement submitLoginButton;

  @FindBy(how = How.XPATH, using = "//*[@id=\"siteTable\"]/div[3]/div[1]/div[1]")
  private WebElement upvotedButtonSecondTopPost;

  @FindBy(how = How.XPATH, using = "//*[@id=\"siteTable\"]/div[3]/div[1]/div[5]")
  private WebElement downvotedButtonSecondTopPost;

  public RedditFrontPage() {
    navigateToSite();
    PageFactory.initElements(TestContext.getDriver(), this);
  }

  private void navigateToSite() {
    PropertiesProvider frameworkPropertiesProvider = new PropertiesProvider(FRAMEWORK_PROPERTIES);
    TestContext.getDriver().get(System.getProperty(SEARCH_HOST, frameworkPropertiesProvider.getProperty(PRODUCTION_URL)));
    WaitUtils.waitUntilPresenceOfElementLocated(By.id(DIV_WELCOME_TO_REDDIT_ID));
  }

  public void skipLoginOnTheHomepage() {
    skipLoginLink.click();
  }

  public void fillSearchTextBox(String searchInput) {
    searchTextBox.sendKeys(searchInput);
  }

  public void clickOnSubmitButton() {
    searchSubmitButton.click();
  }

  public void clickOnFirstSubredditResult() {
    firstSuredditResult.click();
  }

  public void clickOnTopPostTab() {
    topPostsTab.click();
  }

  public void printTheTopPostTitle() {
    System.out.println("\n\n\n" + "The most voted post is: " + mostUpvotedPost.getText());
  }

  public void fillUsernameField() {
    usernameField.sendKeys(frameworkPropertiesProvider.getProperty(TS_USERNAME));
  }

  public void fillPasswordField() {
    passwordField.sendKeys(frameworkPropertiesProvider.getProperty(TS_PASSWORD));
  }

  public void clickSubmitLoginButton() {
    submitLoginButton.click();
  }

  public void clickDownvoteSecondTopPost() {
    WaitUtils.waitUntilPresenceOfElementLocated(By.xpath(LOGOUT_LINK_XPATH));
    downvotedButtonSecondTopPost.click();
  }

  public void clickUpvoteSecondTopPost() {
    WaitUtils.waitUntilPresenceOfElementLocated(By.xpath(LOGOUT_LINK_XPATH));
    upvotedButtonSecondTopPost.click();
  }

  public boolean isSecondTopPostUpvoted() {
    WaitUtils.waitUntilPresenceOfElementLocated(By.xpath(LOGOUT_LINK_XPATH));
    return upvotedButtonSecondTopPost.getAttribute(CSS_CLASS_ATTRIBUTRE).contains(UPVOTE_CSS_CLASS_NAME);
  }

  public boolean isSecondTopPostDownvoted() {
    WaitUtils.waitUntilPresenceOfElementLocated(By.xpath(LOGOUT_LINK_XPATH));
    return downvotedButtonSecondTopPost.getAttribute(CSS_CLASS_ATTRIBUTRE).contains(DOWNVOTE_CSS_CLASS_NAME);
  }
}
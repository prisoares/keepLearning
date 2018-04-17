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

  private static final String SKIP_LOGIN_FOR_NOW_XPATH = "//*[@id=\"desktop-onboarding-sign-up-form\"]/p[2]/a[2]";

  private static final String SEARCH_TEXTBOX_NAME = "q";

  private static final String SEARCH_SUBMIT_BUTTON_XPATH = "//*[@id=\"search\"]/input[2]";

  private static final String FIRST_SUBREDDITS_XPATH = "/html/body/div[6]/div[2]/div/div/div[1]/header/a";

  private static final String TOP_POSTS_TAB_XPATH = "//*[@id=\"header-bottom-left\"]/ul/li[5]/a";

  private static final String THE_MOST_UPVOTED_POST_XPATH = "//*[@id=\"siteTable\"]/div[1]/div[2]/div[1]/p[1]/a";

  private static final String USERNAME_FIELD_NAME = "user";

  private static final String PASSWORD_FIELD_NAME = "passwd";

  private static final String SUBMIT_LOGIN_BUTTON_XPATH = "//*[@id=\"login_login-main\"]/div[4]/button";

  private static final String DOWNVOTED_BUTTON_SECOND_TOP_POST_XPATH = "//*[@id=\"siteTable\"]/div[3]/div[1]/div[5]";

  private static final String UPVOTED_BUTTON_SECOND_TOP_POST_XPATH = "//*[@id=\"siteTable\"]/div[3]/div[1]/div[1]";

  private static final String CSS_CLASS_ATTRIBUTRE = "class";

  private static final String DOWNVOTE_CSS_CLASS_NAME = "downmod";

  private static final String UPVOTE_CSS_CLASS_NAME = "upmod";

  private static final String LOGOUT_LINK_XPATH = "//*[@id=\"header-bottom-right\"]/form/a";

  private static final String DIV_WELCOME_TO_REDDIT_ID = "desktop-onboarding-browse";

  @FindBy(how = How.XPATH, using = SKIP_LOGIN_FOR_NOW_XPATH)
  private WebElement skipLoginLink;

  @FindBy(how = How.NAME, using = SEARCH_TEXTBOX_NAME)
  private WebElement searchTextBox;

  @FindBy(how = How.XPATH, using = SEARCH_SUBMIT_BUTTON_XPATH)
  private WebElement searchSubmitButton;

  @FindBy(how = How.XPATH, using = FIRST_SUBREDDITS_XPATH)
  private WebElement firstSuredditResult;

  @FindBy(how = How.XPATH, using = TOP_POSTS_TAB_XPATH)
  private WebElement topPostsTab;

  @FindBy(how = How.XPATH, using = THE_MOST_UPVOTED_POST_XPATH)
  private WebElement mostUpvotedPost;

  @FindBy(how = How.NAME, using = USERNAME_FIELD_NAME)
  private WebElement usernameField;

  @FindBy(how = How.NAME, using = PASSWORD_FIELD_NAME)
  private WebElement passwordField;

  @FindBy(how = How.XPATH, using = SUBMIT_LOGIN_BUTTON_XPATH)
  private WebElement submitLoginButton;

  @FindBy(how = How.XPATH, using = UPVOTED_BUTTON_SECOND_TOP_POST_XPATH)
  private WebElement upvotedButtonSecondTopPost;

  @FindBy(how = How.XPATH, using = DOWNVOTED_BUTTON_SECOND_TOP_POST_XPATH)
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
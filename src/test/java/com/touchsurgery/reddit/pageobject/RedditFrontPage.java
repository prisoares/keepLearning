package com.touchsurgery.reddit.pageobject;

import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.FIRST_SUBREDDITS_XPATH;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.FRAMEWORK_PROPERTIES;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.PASSWORD_FIELD_NAME;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.SEARCH_SUBMIT_BUTTON_XPATH;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.SEARCH_TEXTBOX_NAME;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.SKIP_LOGIN_FOR_NOW_XPATH;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.SUBMIT_LOGIN_BUTTON_XPATH;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.THE_MOST_UPVOTED_POST_XPATH;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.TOP_POSTS_TAB_XPATH;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.TS_PASSWORD;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.TS_USERNAME;
import static com.touchsurgery.reddit.pageobject.RedditFrontPageConstants.USERNAME_FIELD_NAME;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.touchsurgery.reddit.utils.PropertiesProvider;

public class RedditFrontPage {

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

  private PropertiesProvider frameworkPropertiesProvider = new PropertiesProvider(FRAMEWORK_PROPERTIES);

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
    System.out.println("\n\n\n"+ "The most voted post is: " + mostUpvotedPost.getText());
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

}
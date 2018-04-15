package com.touchsurgery.redditsearch.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedditFrontPage {

  private static final String SEARCH_SUBMIT_BUTTON_XPATH = "//*[@id=\"search\"]/input[2]";

  private static final String SEARCH_TEXTBOX_NAME = "q";

  private static final String FIRST_SUBREDDITS_XPATH = "/html/body/div[6]/div[2]/div/div/div[1]/header/a";

  private static final String SKIP_LOGIN_FOR_NOW_XPATH = "//*[@id=\"desktop-onboarding-sign-up-form\"]/p[2]/a[2]";

  @FindBy(how = How.XPATH, using = SKIP_LOGIN_FOR_NOW_XPATH)
  private WebElement skipLoginLink;

  @FindBy(how = How.NAME, using = SEARCH_TEXTBOX_NAME)
  private WebElement searchTextBox;

  @FindBy(how = How.XPATH, using = SEARCH_SUBMIT_BUTTON_XPATH)
  private WebElement searchSubmitButton;

  @FindBy(how = How.XPATH, using = FIRST_SUBREDDITS_XPATH)
  private WebElement firstSuredditRedult;

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
    firstSuredditRedult.click();
  }

}
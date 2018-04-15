package com.touchsurgery.redditsearch.stepdefs;

import com.touchsurgery.redditsearch.pageobject.RedditFrontPage;
import com.touchsurgery.redditsearch.pageobject.UsingRedditFrontPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SearchStepDefs {

  private RedditFrontPage usingRedditSearchPage;

  @Given("I open the Reddit homepage")
  public void i_open_the_Reddit_homepage() {
    usingRedditSearchPage = new UsingRedditFrontPage().createRedditFrontPage();
    // TODO Refresh + Reload
  }

  @Given("I skip to perform my login for now")
  public void i_skip_to_perform_my_login_for_now() throws Throwable {
    usingRedditSearchPage.skipLoginOnTheHomepage();
  }

  @When("I search for a subreddit called \"([^\"]*)\"")
  public void i_search_for_a_subreddit_called(String argument) throws Throwable {
    usingRedditSearchPage.fillSearchTextBox(argument);
    usingRedditSearchPage.clickOnSubmitButton();
  }

  @When("I open the sub-reddit")
  public void i_open_the_sub_reddit() throws Throwable {
    usingRedditSearchPage.clickOnFirstSubredditResult();
  }

}

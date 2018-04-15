package com.touchsurgery.redditsearch.stepdefs;

import com.touchsurgery.redditsearch.pageobject.RedditFrontPage;
import com.touchsurgery.redditsearch.pageobject.UsingRedditFrontPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedditFrontPageStepDefs {

  private RedditFrontPage usingRedditSearchPage;

  @Given("I open the Reddit homepage")
  public void i_open_the_Reddit_homepage() {
    usingRedditSearchPage = new UsingRedditFrontPage().createRedditFrontPage();
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

  @When("I print out the top most post title")
  public void i_print_out_the_top_most_post_title() throws Throwable {
    usingRedditSearchPage.clickOnTopPostTab();
    usingRedditSearchPage.printTheTopPostTitle();
  }

  @When("I perform my login")
  public void i_perform_my_login() throws Throwable {
    usingRedditSearchPage.fillUsernameField();
    usingRedditSearchPage.fillPasswordField();
    usingRedditSearchPage.clickSubmitLoginButton();
  }

  @Then("I downvote the second post if it is upvoted already, upvote otherwise")
  public void i_downvote_the_second_post_if_it_is_upvoted_already_upvote_otherwise() throws Throwable {

  }
}

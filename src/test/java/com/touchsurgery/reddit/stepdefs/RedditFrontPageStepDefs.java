package com.touchsurgery.reddit.stepdefs;

import org.junit.Assert;

import com.touchsurgery.reddit.pageobject.RedditFrontPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedditFrontPageStepDefs {

  private RedditFrontPage redditSearchPage;

  @Given("I open the Reddit homepage")
  public void i_open_the_Reddit_homepage() {
    redditSearchPage = new RedditFrontPage();
  }

  @Given("I skip to perform my login for now")
  public void i_skip_to_perform_my_login_for_now() throws Throwable {
    redditSearchPage.skipLoginOnTheHomepage();
  }

  @When("I search for a subreddit called \"([^\"]*)\"")
  public void i_search_for_a_subreddit_called(String argument) throws Throwable {
    redditSearchPage.fillSearchTextBox(argument);
    redditSearchPage.clickOnSubmitButton();
  }

  @When("I open the sub-reddit")
  public void i_open_the_sub_reddit() throws Throwable {
    redditSearchPage.clickOnFirstSubredditResult();
  }

  @When("I print out the top most post title")
  public void i_print_out_the_top_most_post_title() throws Throwable {
    redditSearchPage.clickOnTopPostTab();
    redditSearchPage.printTheTopPostTitle();
  }

  @When("I perform my login")
  public void i_perform_my_login() throws Throwable {
    redditSearchPage.fillUsernameField();
    redditSearchPage.fillPasswordField();
    redditSearchPage.clickSubmitLoginButton();
  }

  @Then("I downvote the second post if it is upvoted already, upvote otherwise")
  public void i_downvote_the_second_post_if_it_is_upvoted_already_upvote_otherwise() throws Throwable {
    if (redditSearchPage.isSecondTopPostUpvoted()) {
      redditSearchPage.clickDownvoteSecondTopPost();
      Assert.assertTrue(redditSearchPage.isSecondTopPostDownvoted());
      return;
    }
    redditSearchPage.clickUpvoteSecondTopPost();
    Assert.assertTrue("The second top post is upvoded when it shouldn't.", redditSearchPage.isSecondTopPostUpvoted());
  }
}

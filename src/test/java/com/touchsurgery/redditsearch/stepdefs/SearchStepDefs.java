package com.touchsurgery.redditsearch.stepdefs;

import com.touchsurgery.redditsearch.pageobject.UsingRedditSearchPage;
import cucumber.api.java.en.Given;

public class SearchStepDefs {

	private UsingRedditSearchPage search;

	@Given("I open the Reddit homepage")
	public void i_open_the_Reddit_homepage() {
		search = new UsingRedditSearchPage();
		
		search.navigateToReddit();
		
		search.refreshTheScreen();
		
		search.clickResetButton();
	}
}

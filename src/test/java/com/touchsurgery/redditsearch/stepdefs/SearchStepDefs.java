package com.touchsurgery.redditsearch.stepdefs;

import java.util.List;

import org.junit.Assert;

import com.touchsurgery.redditsearch.constants.Constants;
import com.touchsurgery.redditsearch.pageobject.Search;
import com.touchsurgery.redditsearch.utils.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class SearchStepDefs {

	private Search search;

	@Given("I open the Reddit homepage")
	public void i_open_the_Reddit_homepage() {
		search = new Search();
		
		search.navigateToReddit();
		
		search.refreshTheScreen();
		
		search.clickResetButton();
	}
}

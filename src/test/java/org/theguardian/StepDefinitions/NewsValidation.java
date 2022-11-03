package org.theguardian.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.theguardian.CommonPages.LoadProperty;
import org.theguardian.CommonPages.Utils;
import org.theguardian.PageObjects.GoogleHomePage;
import org.theguardian.PageObjects.TheGuardianHomePage;

public class NewsValidation {
    TheGuardianHomePage theGuardianHomePage = new TheGuardianHomePage();
    GoogleHomePage      googleHomePage      = new GoogleHomePage();

    @Given("^user is on home page of The Guardian$")
    public void user_is_on_home_page_of_The_Guardian() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        theGuardianHomePage.acceptCookies();
    }

    @And("^user get the title of first news article$")
    public void user_get_the_title_of_first_news_article() throws Throwable {
        theGuardianHomePage.getHeadlineOfFirstNews();
    }

    @When("^user search for the similar information on Google$")
    public void user_search_for_the_similar_information_on_Google() throws Throwable {
        googleHomePage.searchOnGoogle( theGuardianHomePage.getHeadlineOfFirstNews() );
    }

    @Then("^user should get results displaying similar information from other sources$")
    public void user_should_get_results_displaying_similar_information_from_other_sources() throws Throwable {
        boolean result = googleHomePage.newsIsFromValidSource( theGuardianHomePage.getHeadlineOfFirstNews() );
        Assert.assertTrue( result );
    }
}
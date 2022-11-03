$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewsValidation.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the first news from The Guardian\u0027s Home page with other resources",
  "description": "Description: As a user I want to validate the First news details",
  "id": "validate-the-first-news-from-the-guardian\u0027s-home-page-with-other-resources",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "User should find the similar news from other resources",
  "description": "",
  "id": "validate-the-first-news-from-the-guardian\u0027s-home-page-with-other-resources;user-should-find-the-similar-news-from-other-resources",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@news"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on home page of The Guardian",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user get the title of first news article",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user search for the similar information on Google",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should get results displaying similar information from other sources",
  "keyword": "Then "
});
formatter.match({
  "location": "NewsValidation.user_is_on_home_page_of_The_Guardian()"
});
formatter.result({
  "duration": 345520600,
  "error_message": "java.lang.NullPointerException\r\n\tat org.theguardian.CommonPages.Utils.switchFrame(Utils.java:34)\r\n\tat org.theguardian.PageObjects.TheGuardianHomePage.acceptCookies(TheGuardianHomePage.java:14)\r\n\tat org.theguardian.StepDefinitions.NewsValidation.user_is_on_home_page_of_The_Guardian(NewsValidation.java:20)\r\n\tat ✽.Given user is on home page of The Guardian(NewsValidation.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NewsValidation.user_get_the_title_of_first_news_article()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewsValidation.user_search_for_the_similar_information_on_Google()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewsValidation.user_should_get_results_displaying_similar_information_from_other_sources()"
});
formatter.result({
  "status": "skipped"
});
});
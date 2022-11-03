Feature: Validate the first news from The Guardian's Home page with other resources
  Description: As a user I want to validate the First news details

  @news
  Scenario: User should find the similar news from other resources
    Given user is on home page of The Guardian
    And user get the title of first news article
    When user search for the similar information on Google
   Then user should get results displaying similar information from other sources

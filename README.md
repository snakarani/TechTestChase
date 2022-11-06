# TechTestChase
This is the technical test to cover the automation task given.

I have created **Automation** framework based on Java <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://www.selenium.dev" target="_blank" rel="noreferrer"/> with Selenium <img src="https://raw.githubusercontent.com/detain/svg-logos/780f25886640cef088af994181646db2f6b1a3f8/svg/selenium-logo.svg" alt="selenium" width="40" height="40"/> </a> and with help of Cucumber created a BDD scenario to justify a solution for a given task.
## Design Pattern - Page Object Model

- The whole framework follows the Page Object Model for better maintenance and readability I have separated the Page selectors and Actions from the tests. I have named selectors with the prefix "_" so they can be easily differentiated from the actions declared.
- The scenario is written using Gherkin language popular in creating BDD patterns i.e. Given/When/Then for easy understanding.
- Feature files are in the resources directory with the extension .feature 
- Test data is stored under the config.properties file where the Key + Value pair is given for the global variable e.g URL, browser name in this instance we also can store details like user profile and other data in isolation manner and all can be accessed with the object of class LoadProperty.Java 
- Also, there is a browser selector class with a method that help select the choice of browser

## Pre-requisites
- JDK - I have used version 11 here
- Maven
- Update all the dependencies listed in `pom.xml`

## Running the tests
One can run the test with cucumber runners class `\src\test\java\org\theguardian\RunTest.java` 

## Test Reporting 
- Cucumber provides the nice cucumber Html report which gets uploaded to the target directory.

## Possible additional improvements

- In addition to the scenario provided, I could have added scenarios to cover additional checks such as a search for the same information on the other popular news website e.g. www.bbc.com
- Extended use of regex to help find the similar news information in whole target page
- Assertion can be made on the image verification for the first news, Date published, and source 
- I could have hydrate scenarios with the dependency injections to improve readability and code re-usability 
- I can add Extended Cucumber Runner which is the extension of the standard Cucumber JUnit runner which additionally supports:
  - Before- and After- suite methods 
  - Failed Tests Re-run 
  - Advanced Reporting after tests completion
- Use of Oops principles to the framework e.g. inheritance and abstraction 
- Implement better cookie handling and reduce the test steps


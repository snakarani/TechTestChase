# TechTestChase
This is the technical test to cover the automation task given.

I have created **Automation** framework based on Java <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://www.selenium.dev" target="_blank" rel="noreferrer"/> with Selenium <img src="https://raw.githubusercontent.com/detain/svg-logos/780f25886640cef088af994181646db2f6b1a3f8/svg/selenium-logo.svg" alt="selenium" width="40" height="40"/> </a> and with help of Cucumber created a BDD scenario to justify a solution for a given task.

- The whole framework follows the Page Object Model for better maintenance and readability I have separated the Page selectors and Actions from the tests. I have named selectors with the prefix "_" so they can be easily differentiated from the actions declared.
- The scenario is written using Gherkin language popular in creating BDD patterns i.e. Given/When/Then for easy understanding.
- Feature files are in the resources directory with the extension .feature 
- Test data is stored under the config.properties file where the Key + Value pair is given for the global variable e.g URL, browser name in this instance we also can store details like user profile and other data in isolation manner and all can be accessed with the object of class LoadProperty.Java 
- Also, there is a browser selector class with a method that help select the choice of browser

## Pre-requisites
- JDK - I have used version 11 here
- Update all the dependencies listed in `pom.xml`

## Running the tests
One can run the test with cucumber runners class `\src\test\java\org\theguardian\RunTest.java` 

## Test Reporting 
- Cucumber provides the nice cucumber Html report which gets uploaded to the target directory.


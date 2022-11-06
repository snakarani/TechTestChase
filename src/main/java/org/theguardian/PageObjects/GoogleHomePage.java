package org.theguardian.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.theguardian.CommonPages.LoadProperty;
import org.theguardian.CommonPages.Utils;

import java.util.List;

public class GoogleHomePage extends Utils {
    LoadProperty loadProperty = new LoadProperty();

    private By _searchBox     = By.xpath("//input[@type='text']");
    private By _resultsSource = By.xpath("//div[@class='TbwUpd NJjxre']//cite");
    private By _acceptCookiesButton = By.id("L2AGLb");
    private By _newsBrief = By.xpath("//div[@class='VwiC3b yXK7lf MUxGbd yDYNvb lyLwlc lEBKkf']");

    /**
     * @param searchQuery
     */
    public void searchOnGoogle(String searchQuery) {
        navigateTo(loadProperty.getProperty(("google_url")));
        if(isElementPresent(_acceptCookiesButton)){ driver.findElement(_acceptCookiesButton).click();}
        waitUntilVisibilityOfElementLocated(_searchBox, 20);
        clickOnElement(_searchBox);
        enterText(_searchBox, searchQuery);
        driver.findElement(_searchBox).sendKeys(Keys.ENTER);
    }

    /**
     *
     * @param firstNewsHeadline
     * @return boolean value if at least one keyword in metadata
     */
    public boolean newsIsFromValidSource(String firstNewsHeadline) {

        String[] firstNewsText = firstNewsHeadline.split(" ");
        List<WebElement> linkForResults = driver.findElements(_resultsSource);
        int count= 0;
        boolean result = false;
        try {
            for (int i = 0; i < linkForResults.size(); i++) {

                if (!linkForResults.get(i).getText().contains(loadProperty.getProperty("theGuardian_url"))) {
                    for (String keyWord : firstNewsText) {
                        String newsBrief = driver.findElements(_newsBrief).get(i).getText().toLowerCase();
                        if (newsBrief.contains(keyWord.toLowerCase())) {
                            result = true;
                            count = i;
                        }
                    }
                }

            }
           System.out.println("Found " + count + " sources with the similar information");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("String index out of bounds. String length: " + linkForResults.size());
        }

       return result;
   }

}

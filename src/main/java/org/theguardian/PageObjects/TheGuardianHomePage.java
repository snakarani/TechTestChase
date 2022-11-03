package org.theguardian.PageObjects;

import org.openqa.selenium.By;
import org.theguardian.CommonPages.Utils;

public class TheGuardianHomePage extends Utils {
    private By _firstNewsHeadLine  = By.xpath("//span[@class='js-headline-text']");
    private By _acceptCookiesBtn   = By.xpath("//button[@title='Yes, I’m happy']");
    private By _acceptCookiesFrame = By.xpath("//iframe[@title='Iframe title']");

    public void acceptCookies() {
        switchFrame(_acceptCookiesFrame);
         waitForElementVisible(_acceptCookiesBtn, 50);
        clickOnElement(_acceptCookiesBtn);
    }

    public String getHeadlineOfFirstNews() {
        String firstNewsHeadline = driver.findElements(_firstNewsHeadLine).get(0).getText();
        System.out.println("Headline for the first news is = " + firstNewsHeadline);
        return firstNewsHeadline;
    }
}

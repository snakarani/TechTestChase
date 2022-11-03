package org.theguardian.CommonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


public class Utils extends BasePage {
    //method for clickOnElement
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    //method for enterText
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Method for time stamp
    public static String dateStamp() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss");
        return format.format(new Date());
    }
    public void switchFrame(By targetFrame) {
        driver.switchTo().frame((driver.findElement(targetFrame)));
    }

    //Wait for element visible for given time in second
    public static void waitForElementVisible(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void navigateTo (String URL) {
        driver.get(URL);
    }
   public static void waitUntilVisibilityOfElementLocated(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static String getText(By by) {
        String text = driver.findElement(by).getText();
        System.out.println(text);
        return text;
    }
    //Checking WebElement displayed or not
    public static boolean isElementPresent(By by) {
        try {
            return driver.findElement(by).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }



};
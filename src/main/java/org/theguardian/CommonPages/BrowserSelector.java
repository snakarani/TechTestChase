package org.theguardian.CommonPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserSelector extends BasePage {
    LoadProperty loadProperty = new LoadProperty();
    String       browserName  = loadProperty.getProperty( "browser" );

    public void openSelectedBrowser() {
        //Open in Local Machine
        if (browserName.equals( "chrome" )) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals( "edge" )) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.equals( "firefox" )) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println( "Browser not matched" );
        }

        //maximising browser window
        driver.manage().window().maximize();
        //Deleting cookies
        // driver.manage().deleteAllCookies();
        //Page loading timeout
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 4 ) );
        //Applying implicitly wait to driver object
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 20 ) );
        //open URL
        driver.get( loadProperty.getProperty( "theGuardian_url" ) );
    }
}

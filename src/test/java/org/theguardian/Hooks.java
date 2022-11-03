package org.theguardian;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.theguardian.CommonPages.BrowserSelector;
import org.theguardian.CommonPages.Utils;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.copyFile;

public class Hooks extends Utils {
    //    Create object for Browser selector class
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser(){

        browserSelector.openSelectedBrowser();
    }
    @After
    public void closeBrowser(Scenario scenario) throws IOException {
//        Test Data
        String screenShotName = scenario.getName().replaceAll(".,;:?!","")+dateStamp()+".png";
//        capture screenshot if test is fail
        if (scenario.isFailed())
        {
            //Taking Screenshot on original source path
            File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //Giving direction to user path
            File destinationPath = new File(System.getProperty("user.dir")+"/target/Destination/Screenshot/"+screenShotName);
            copyFile(sourcePath,destinationPath);

            //Message fail note
            scenario.write("..........Scenario Failed.........");
            //Convert file size to Bytes
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
        }
        driver.quit();
    }

}

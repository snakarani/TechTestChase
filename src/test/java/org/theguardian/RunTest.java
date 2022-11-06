package org.theguardian;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",
        tags = "@news",monochrome = true,
        plugin = {"pretty","html:html","json:json/cucumber.json","junit:junit/cucumber.xml"},
        dryRun = false
)
public class RunTest {

}

package CucumberTestRunner;

import WebDriver.Utilities;
import WebDriver.WebDriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeatureFiles",
        glue = "Steps",
        tags = {"@Testing"},
        snippets = SnippetType.CAMELCASE
        )

public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void beforeRunnerClearReport(){
        WebDriverManager.setWebDriver("Chrome");
        WebDriverManager.goToURL("https://www.edfa3ly.com/cart");
    }
    @AfterClass
    public static void afterRunnerExecuteReport() throws IOException {
        Utilities.cleanFolder(new File(System.getProperty("user.dir")+"/target"));
        WebDriverManager.closeDriver();
    }
}


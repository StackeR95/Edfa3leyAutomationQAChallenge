package CucumberTestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.junit.Test;
import org.junit.runner.RunWith;

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

    }
    @AfterClass
    public static void afterRunnerExecuteReport(){

    }
}

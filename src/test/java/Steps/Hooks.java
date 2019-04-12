package Steps;

import WebDriver.WebDriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    WebDriverManager webDriverManager;
    @Before
    public void beforeScenario() {
        webDriverManager = new WebDriverManager();
        webDriverManager.goToURL("");
    }
    @After
    public void afterScenario(){
        webDriverManager.closeDriver();
    }


}

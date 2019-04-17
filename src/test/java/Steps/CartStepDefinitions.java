package Steps;


import Edfa3leyPageObjects.PageObject;
import WebDriver.WebDriverManager;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;

public class CartStepDefinitions {

    private PageObject edfa3leyPageObject = new PageObject(WebDriverManager.webDriver);
    @When("^User focus on Item url input$")
    public void userFocusOnItemUrlInput()  {
        edfa3leyPageObject.cart().clickOnItemInputButton();
    }

    @And("^User Waits for seconds")
    public void userWaitForOneMinute() throws Throwable {
        Thread.sleep(5000);
    }

    @And("^User writes \"([^\"]*)\" in Item url input$")
    public void userWritesInItemUrlInput(String itemURL) throws Throwable {
        edfa3leyPageObject.cart().writeInItemInputButton(itemURL);
    }

    @And("^User clicks on Add Item$")
    public void userClicksOnAddItem() throws InterruptedException {
        edfa3leyPageObject.cart().clickOnAddItemButton();
    }

    @Then("^User fill missing product information$")
    public void userFillMissingProductInformation() throws Throwable {
         edfa3leyPageObject.cart().fillMissingProductDetails();
    }

    @And("^User gets an apology that the store is not available$")
    public void userGetsAnApologyThatTheStoreIsNotAvailable() throws Throwable {
        edfa3leyPageObject.cart().validateThatStoreNotAvailableAppears();
    }
}


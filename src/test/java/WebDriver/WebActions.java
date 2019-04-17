package WebDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions {

    private static WebDriverWait wait = new WebDriverWait(WebDriverManager.webDriver, 50);

    public static void sendKeyboardKeysToWebElement(By webElement, Keys keyboardKeys){
        WebDriverManager.webDriver.findElement(webElement).sendKeys(keyboardKeys);
    }
    public static void clickOnWebElement(By webElement){
        try
        {
            WebDriverManager.webDriver.findElement(webElement).click();
        }
        catch (Exception e){
            Assert.fail("Couldn't click on Web Element "+WebDriverManager.webDriver.findElement(webElement).getText()+" An error occurred "+e.getMessage());
        }

    }
    public static void writeTextInWebElement(By webElement, String text){
        try
        {
            WebDriverManager.webDriver.findElement(webElement).sendKeys(text);
        }
        catch (Exception e)
        {
            Assert.fail("Couldn't write text in Web Element "+WebDriverManager.webDriver.findElement(webElement).getText()+" An error occurred "+e.getMessage());
        }
    }
    public static void waitForElementToBeVisible(By webElement){
        wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));
    }
    public static void waitForElementToBeInvisible(By webElement){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(webElement));
    }

}

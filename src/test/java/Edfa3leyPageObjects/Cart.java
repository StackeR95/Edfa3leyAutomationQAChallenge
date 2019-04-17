package Edfa3leyPageObjects;

import WebDriver.WebActions;
import WebDriver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class Cart {


    private  By itemInputButton = By.xpath("//input[@type='url']");
    private  By countryDropDownButton = By.className("ddTitleText");
    private  By addItemButton = By.xpath("//input[@value='Add item']");

    private  By categoryIcons = By.xpath("//div[@id='category-container']//div//label");
    private  By categoryContainer = By.xpath("//div[@id='categoryContainer']//*");
    private  By categoryButton = By.className("toggleCategories");

    private  By priceButton = By.id("product-price");
    private  By colorDropDown = By.xpath("//select[@ng-model='product.color']");
    private  By sizeDropDown = By.xpath("//select[@name='size']");

    private  By loadingBarSpinner = By.id("loading-bar-spinner");
    private  By loadingBar = By.id("loading-bar");
    private  By itemImage = By.className("itemImage");

    private  By storeNotAvailableLabel = By.xpath("//label[@ng-if='isNotEligibleForBuy()']");

    public void clickOnSelectCategory(){WebActions.clickOnWebElement(categoryButton);}
    public void clickOnCountryDropDown(){
        WebActions.clickOnWebElement(countryDropDownButton);
    }
    public void clickOnAddItemButton() throws InterruptedException {
        WebActions.clickOnWebElement(addItemButton);
        Thread.sleep(2000);
        try {
            if(!WebDriverManager.webDriver.findElement(By.xpath("//div[@ng-controller='AddItemController']//span[@ng-model='cartNotification']")).isDisplayed()){
                fillMissingProductDetails(); // Fills missing data of your product
                clickOnAddItemButton(); // recursive call to add the item
            }
        }
        catch (Exception e)
        {
            fillMissingProductDetails(); // Fills missing data of your product
            clickOnAddItemButton(); // recursive call to add the item
        }

    }
    public void clickOnItemInputButton(){
        WebActions.clickOnWebElement(itemInputButton);
    }
    public void writeInItemInputButton(String itemURL) throws InterruptedException {
        WebActions.writeTextInWebElement(itemInputButton,itemURL);
        WebActions.waitForElementToBeInvisible(loadingBarSpinner);
        WebActions.waitForElementToBeInvisible(loadingBar);
        Thread.sleep(3000);
    }
    public void fillMissingProductDetails()throws InterruptedException {
        fillCategoryMissingData();
        Thread.sleep(1000);
        fillPriceColorSize();
    }
    public void validateThatStoreNotAvailableAppears(){
        WebActions.waitForElementToBeVisible(storeNotAvailableLabel);
    }

    private void fillPriceColorSize() throws InterruptedException {
        try{
            if (WebDriverManager.webDriver.findElement(priceButton).getAttribute("class").contains("ng-dirty")){
                WebActions.writeTextInWebElement(priceButton,"10");
            }
            Thread.sleep(1000);
            if(WebDriverManager.webDriver.findElement(colorDropDown).getAttribute("class").contains("ng-dirty")){
                List<WebElement> colorDropdownOptions =   WebDriverManager.webDriver.findElement(colorDropDown).findElements(By.xpath("option"));
                int randomNumber = (int) (Math.random() * ((colorDropdownOptions.size()-1)-1)+1);
                colorDropdownOptions.get(randomNumber).click();

            }
            Thread.sleep(1000);
            if(WebDriverManager.webDriver.findElement(sizeDropDown).getAttribute("class").contains("ng-dirty")){
                List<WebElement> sizeDropDownOptions =   WebDriverManager.webDriver.findElement(sizeDropDown).findElements(By.xpath("option"));

                int randomNumber = (int) (Math.random() * ((sizeDropDownOptions.size()-1)-1)+1);
                sizeDropDownOptions.get(randomNumber).click();
            }
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            return;
        }


    }
    private void fillCategoryMissingData()throws InterruptedException{
        List<WebElement> categoryContainerData =  WebDriverManager.webDriver.findElements(categoryContainer);
        for (WebElement webElement : categoryContainerData ){
            if(webElement.getAttribute("class").contains("ng-dirty"))
            {
                if(webElement.getAttribute("class").contains("toggleCategories"))
                {
                    webElement.click();
                    chooseRandomCategory();
                }
            }
        }
    }
    private void chooseRandomCategory()throws InterruptedException{
        Thread.sleep(1000);
        int randomNumber = (int) (Math.random() * 16);
        WebDriverManager.webDriver.findElements(categoryIcons).get(randomNumber).click();
    }
}

package Edfa3leyPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

    private WebDriver webDriver;
    public PageObject(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public Cart cart(){
       return  PageFactory.initElements(webDriver,Cart.class);
    }
}

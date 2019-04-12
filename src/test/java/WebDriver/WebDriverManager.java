package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverManager {
    WebDriver webDriver;

    public WebDriverManager(){
        webDriver = new ChromeDriver();
    }
    public void goToURL(String url){
        webDriver.get("https://www.google.com");
    }
    public void closeDriver(){
        webDriver.close();
    }

}

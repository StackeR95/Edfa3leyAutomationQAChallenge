package WebDriver;

import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverManager {
    public static WebDriver webDriver;

    public static void setWebDriver(String webDriverName)
    {
        switch (webDriverName){
            case "Chrome":
                webDriver = new ChromeDriver();
                break;
            case "Safari":
                webDriver = new SafariDriver();
                break;
            default:
                Assert.fail("You didn't choose valid Web Driver");
                break;
        }
        webDriver.manage().window().setSize(new Dimension(1920, 1080));
        webDriver.manage().window().maximize();
    }

    public static void goToURL(String url){
        webDriver.get(url);
    }
    public static void closeDriver(){
        webDriver.close();
    }

}

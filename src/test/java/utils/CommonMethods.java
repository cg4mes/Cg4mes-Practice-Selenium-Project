package utils;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {

    public static WebDriver driver;

    public static void initDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/cristhianmartinez/Documents/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
    }
}

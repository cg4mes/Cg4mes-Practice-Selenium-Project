package testCases;

import org.junit.Test;
import utils.CommonMethods;
import java.util.concurrent.TimeUnit;

import static utils.CommonMethods.*;

public class OpenBrowser {
    @Test
    public void openChrome(){
        CommonMethods.initDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().pageLoadTimeout(3L,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.quit();
    }
}

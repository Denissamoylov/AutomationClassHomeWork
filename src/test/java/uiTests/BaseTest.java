package uiTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public WebDriver driver;
    @BeforeSuite
    public void suitSetup(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/macOS/geckodriver");
        driver = new FirefoxDriver();
    }
}

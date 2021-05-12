package google.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseTest;


public class GoogleSearchTest extends BaseTest {

        private static final String GOOGLE_MAIN_PAGE_URL = "https://www.google.com/";


        //1. go to Google main page
        //2. type search query
        //3. submit query
        //4. verify results Page is appeared

    @Test
    public void testGoogleSearch() {

        goToMainPage();
        typeSearchQuery();
        submitQuery();
        waitForElement();
        verifyResultsPage();
    }

    private void waitForElement() {
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id= 'result-stats']")));
    }

    private void verifyResultsPage() {
        WebElement element = driver.findElement(By.xpath("//*[@id= 'result-stats']"));
        boolean displayed = element.isDisplayed();

        Assert.assertEquals(displayed, true);
    }

    private void submitQuery() {
        driver.findElement(By.xpath("//*[@name= 'q'][@type= 'text']")).submit();
    }

    private void typeSearchQuery() {
        driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys("Portnov Computer School");
    }

    private void goToMainPage() {
        driver.get(GOOGLE_MAIN_PAGE_URL);
    }

}

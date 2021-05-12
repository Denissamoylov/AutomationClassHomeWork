package google.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseTest;

public class YouTubeSearch extends BaseTest {

    private static final String YOUTUBE_MAIN_PAGE_URL = "https://www.youtube.com/";


    //1. go to YouTube main page
    //2. type search query
    //3. submit query
    //4. verify results Page is appeared

    @Test
    public void test001() {

        goToMainPage();
        waitForSearchElement();
        typeSearchQuery();
        submitQuery();
        waitForElement();
        verifyResultsPage();
    }

    private void goToMainPage() {
        driver.get(YOUTUBE_MAIN_PAGE_URL);
    }
    private void waitForSearchElement() {
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id= 'search'][@name= 'search_query']")));
    }
    private void typeSearchQuery() {
        driver.findElement(By.xpath("//*[@id= 'search'][@name= 'search_query']")).sendKeys("Portnov Computer School");
    }

    private void submitQuery() {
        driver.findElement(By.xpath("//*[@id= 'search'][@name= 'search_query']")).submit();
    }

    private void waitForElement() {
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#img")));
    }
    private void verifyResultsPage() {
        WebElement element = driver.findElement(By.xpath("//*[@id= 'img'][@class= 'style-scope yt-img-shadow']"));
        boolean displayed = element.isDisplayed();
        Assert.assertTrue(displayed);
    }

}

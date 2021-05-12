package uiTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseTest;

import java.util.Set;

public class WindowsHandles extends BaseTest {

    private static final String WINDOWS_URL = "http://the-internet.herokuapp.com/windows";
    private static final String MAIN_PAGE_LINK_TEXT = "Click Here";


    //1. Open the window's page
    //2. Click on link
    //3. Verify the amount of windows/tabs
    //4. Switch to new window
    //5. Verify window title
    //6. Verify text on the page
    //7. Switch back to first tab
    //8. Verify window's heading


    @Test
    public void testWindowsHandles() {
        openWindowsPage();
        clickOnLink();
        verifyAmountWindows();
        switchToNewWindow();
        waitForNewWindow();
        verifyWindowTitle();
        verifyTextOnPage();
        switchBackToFirstWindow();
        verifyFirstWindowHeading();
    }

    private void verifyFirstWindowHeading() {
        String pageSource = driver.getPageSource();
        boolean headingIsPresent = pageSource.contains("Opening a new window");
        Assert.assertTrue(headingIsPresent);
    }

    private void switchBackToFirstWindow() {
        String firstWindowHandle  = driver.getWindowHandles().toArray(new String[]{})[0];
        driver.switchTo().window(firstWindowHandle);
    }

    private void waitForNewWindow() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("New Window"));
    }

    private void verifyTextOnPage() {
        String actualString = driver.findElement(By.xpath("/html/body/div/h3")).getText();
        Assert.assertTrue(actualString.contains("New Window"));
    }

    public void verifyWindowTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "New Window");
    }

    private void switchToNewWindow() {
        Set<String> setOfHandles = driver.getWindowHandles();
        String[] arrayOfStrings = setOfHandles.toArray(new String[]{});
        String secondWindowHandle = arrayOfStrings[1];
        driver.switchTo().window(secondWindowHandle);
    }

    private void verifyAmountWindows() {
        Set<String> windowHandles = driver.getWindowHandles();
        int actual = windowHandles.size();
        int expectedNumber = 2;
        Assert.assertEquals(actual, expectedNumber);
    }

    private void clickOnLink() {
        WebElement element = driver.findElement(By.linkText(MAIN_PAGE_LINK_TEXT));
        element.click();
    }

    private void openWindowsPage() {
        driver.get(WINDOWS_URL);
    }

}

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import uiTests.BaseTest;

public class XPath {

    @Test
    public void testXpath() {
        String fullXpath = "/html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]";
        String relativePath = "//form/div[1]/div/div[1]/div/div/input[1]";
        String singleAttribute = "//*[@class='sfbq']";
        String multipleAttributes = "//*[@class='tsf'][@action='/search']";
        String oneAttributeAndAnother = "//<HTML tag>[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2’]";
        String oneAttributeAndAnotherNoTag = "//*[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2’]";
        String oneAttributeOrAnother = "//<HTML tag>[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2]";
        String oneAttributeOrAnotherNoTag = "//*[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2]";
        String contains = "//<HTML tag>[contains(@attribute_name,'attribute_value')";
        String containsNoTag = "//div[contains(@attribute_name,'attribute_value')";
        String startsWith = "//*[starts-with(@class,'spch')]";
        String text = "//*[text()='Log In']";
        String last = "//*[@class='sfbg'][last]";
        String second = "//*[@class='sfbg'][2]";
        String following = "//*[@id='FirstName']//following::input[@type='text']";
        String preceding = "//*[@id='LastName']//preceding::input[@type='text']";

    }
}

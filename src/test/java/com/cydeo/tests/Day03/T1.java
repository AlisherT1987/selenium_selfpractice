package com.cydeo.tests.Day03;



import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class T1 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.etsy.com");
        WebElement searchBox=driver.findElement(By.cssSelector(("input[id='global-enhancements-search-query']")));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
       BrowserUtils.sleep(2);
        String expected="Wooden spoon - Etsy";
        String actual=driver.getTitle();
        Assert.assertEquals(actual,expected);
        BrowserUtils.sleep(2);
        driver.navigate().refresh();
        driver.close();


    }
}
/*
HWP #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com 3. Search for “wooden spoon” 4. Verify title:
Expected: “Wooden spoon - Etsy”
 */
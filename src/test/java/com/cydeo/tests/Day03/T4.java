package com.cydeo.tests.Day03;


import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class T4 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/inputs");
        BrowserUtils.sleep(2);
        driver.navigate().refresh();
        BrowserUtils.sleep(2);
        driver.findElement(By.xpath("//li/a")).click();
        BrowserUtils.sleep(2);
        driver.close();

    }
}
/*
TC #4: Practice Cydeo – Class locator practice 1- Open a Chrome browser
2- Go to: https://practice.cydeo.com/inputs 3- Click to “Home” link
4- Verify title is as expected: Expected: Practice
PS: Locate “Home” link using “className” locator
 */
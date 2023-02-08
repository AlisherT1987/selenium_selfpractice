package com.cydeo.tests.Day03;


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T3 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("a[class='gb_n']")).click();
    }
}
/*
TC #3: Back and forth navigation 1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right. 4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back(); 6- Verify title equals:
Expected: Google
 */
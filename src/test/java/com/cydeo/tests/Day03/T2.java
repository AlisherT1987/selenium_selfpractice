package com.cydeo.tests.Day03;


import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class T2 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement header=driver.findElement(By.xpath("//h3"));
       BrowserUtils.sleep(2);
        System.out.println(header.getText());
        Assert.assertEquals(header.getText(),"Log in to ZeroBank");
        driver.close();
    }
}
/*
HWP #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html 3. Verify header text
Expected: “Log in to ZeroBank”
 */
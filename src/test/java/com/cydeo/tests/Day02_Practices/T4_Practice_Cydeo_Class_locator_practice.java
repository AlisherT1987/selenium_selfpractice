package com.cydeo.tests.Day02_Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Practice_Cydeo_Class_locator_practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/inputs");
        Thread.sleep(2000);
        driver.findElement(By.className("nav-link")).click();
        String actualResult=driver.getTitle();
        if(actualResult.equals("Practice")){
            System.out.println("Checked");
        }
        driver.close();
    }
}
/*
TC #4: Practice Cydeo – Class locator practice 1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs 3- Click to “Home” link
4- Verify title is as expected: Expected: Practice
PS: Locate “Home” link using “className” locator
 */
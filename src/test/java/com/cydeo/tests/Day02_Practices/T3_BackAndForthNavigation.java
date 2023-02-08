package com.cydeo.Day02_Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.className("gb_n")).click();
        String actualResult=driver.getTitle();
        if (actualResult.contains("Gmail")){
            System.out.println("Title verification passed!");
        }
        driver.navigate().back();
        String result=driver.getTitle();
        if (result.equals("Google")){
            System.out.println("Title verified!");
        }
        driver.close();
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
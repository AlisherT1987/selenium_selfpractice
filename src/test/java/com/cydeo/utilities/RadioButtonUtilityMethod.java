package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ThreadSleep;

import java.time.Duration;
import java.util.List;

public class RadioButtonUtilityMethod {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickAndVerifyRadioButton(driver,"sport","hockey");
        ThreadSleep.timeout(3);
        clickAndVerifyRadioButton(driver,"sport","football");
        ThreadSleep.timeout(3);
        clickAndVerifyRadioButton(driver,"color","red");
        ThreadSleep.timeout(3);
        driver.close();
    }
    private static void clickAndVerifyRadioButton(WebDriver driver,String nameAttribute,String expectedID){
        //List<WebElement> sportsRadioButtons=driver.findElements(By.xpath("//input[@name='"+nameAttribute+"']"));
        List<WebElement> radioButtons=driver.findElements(By.name(nameAttribute));
        for (WebElement each : radioButtons) {
            String actualID=each.getAttribute("id");
            System.out.println("actualID = " + actualID);
            if(actualID.equals(expectedID)){
                each.click();
                System.out.println(actualID+" is Selected: "+each.isSelected());
                break;
            }
        }
    }
}

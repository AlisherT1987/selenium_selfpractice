package com.cydeo.tests.teamAlsephina;


import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class T3_Actions_Hover {
    @Test
    public void testName() {
        //TC #3: Hover Test
//1. Go to https://practice.cydeo.com/hovers



        Driver.getDriver().get("https://practice.cydeo.com/hovers");
// 2. Hover over to first image
       // WebElement image1=Driver.getDriver().findElement(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
       // Actions actions=new Actions(Driver.getDriver());
        //actions.moveToElement(image1).perform();
        //BrowserUtils.sleep(2);
        List<WebElement> list= Driver.getDriver().findElements(By.className("figure"));
        int i=1;
        for (WebElement each : list) {
            Actions actions=new Actions(Driver.getDriver());
            actions.moveToElement(each).perform();
            WebElement tag= Driver.getDriver().findElement(By.xpath("//a[@href='/users/"+(i++)+"']/../h5"));
            Assert.assertTrue(tag.isDisplayed());
            BrowserUtils.sleep(2);
            System.out.println(tag.getText());


        }
        System.out.println(list.size());
////a[@href='/users/2']/../h5

//3. Assert:
//a. “name: user1” is displayed
     //   Assert.assertTrue(Driver.getDriver().findElement(By.tagName("//h5")).isDisplayed());
// 4. Hover over to second image
//5. Assert:
//a. “name: user2” is displayed 6. Hover over to third image
//7. Confirm:
//a. “name: user3” is displayed
    }
}


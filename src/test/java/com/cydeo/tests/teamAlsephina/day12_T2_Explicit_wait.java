package com.cydeo.tests.teamAlsephina;

import com.cydeo.pages.ExplicitWait;
import com.cydeo.utilities.Driver;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class day12_T2_Explicit_wait {
    @Test
    public void explicitWaitTest() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        ExplicitWait explicit=new ExplicitWait();
        explicit.removeButton.click();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(explicit.loadingBar));
       try {
           Assert.assertFalse(explicit.checkbox.isDisplayed());
       }catch (NoSuchElementException n){
          Assert.assertTrue(true);

       }
        Assert.assertTrue(explicit.message.isDisplayed());


    }
}
/*
TC #2: Explicit wait practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/dynamic_controls
3- Click to “Remove” button
4- Wait until “loading bar disappears”
5- Verify:
a. Checkbox is not displayed
b. “It’s gone!” message is displayed.
NOTE: FOLLOW POM
 */
package com.cydeo.tests.teamAlsephina;


import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import java.time.Duration;

public class day01 {
    
    @Test
    public void ups01(){
        Driver.getDriver().get("https://brand.ups.com/en-us/register.html");
        WebElement cookies=Driver.getDriver().findElement(By.xpath("//button[@class='close_btn_thick']"));
        System.out.println(cookies.getText());
        cookies.click();
         WebElement login=Driver.getDriver().findElement(By.xpath("//a[@href='/en-us/login.html']"));
        login.click();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Login");
        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().back();
        Driver.getDriver().switchTo().parentFrame();
        WebElement first=Driver.getDriver().findElement(By.xpath("//span[.='UPS Communication Employee']"));
        first.click();
        WebElement firstName=Driver.getDriver().findElement(By.xpath("//input[@name='communicationemployeefirstname']"));
        firstName.sendKeys("Alisher");
        WebElement lastName=Driver.getDriver().findElement(By.name("communicationemployeelastname"));
        lastName.sendKeys("Tussupbayev");
        WebElement email=Driver.getDriver().findElement(By.id("communicationemployeeemail"));
        email.sendKeys("alish.tusupbaev@gmail.com");
        WebElement emailConfirm=Driver.getDriver().findElement(By.cssSelector("input[name='communicationemployeeconfirmemail']"));
        emailConfirm.sendKeys("alish.tusupbaev@gmail.com");
        WebElement password=Driver.getDriver().findElement(By.id("communicationemployeepassword"));
        password.sendKeys("Cydeo");
        WebElement passwordConfirm=Driver.getDriver().findElement(By.name("communicationemployeeconfirmpassword"));
        passwordConfirm.sendKeys("Cydeo");
        WebElement errorMessage=Driver.getDriver().findElement(By.xpath("//div[.='Password must be between 8-26 characters and must contain all 4 of the following: lower case letters, upper case letters, numbers and special characters (!@#$%*) e.g. ABCdef#123.']"));
        Assert.assertTrue(errorMessage.isDisplayed());
        Select country= new Select( Driver.getDriver().findElement(By.xpath("//select[@name='communicationemployeecountry']")));
        country.selectByIndex(10);
        BrowserUtils.sleep(2);
        country.selectByVisibleText("Spain");
        BrowserUtils.sleep(2);
        country.selectByVisibleText("Kazakhstan");
        WebElement city=Driver.getDriver().findElement(By.name("communicationemployeecity"));
        city.sendKeys("Almaty");
        WebElement department=Driver.getDriver().findElement(By.name("communicationemployeedepartment"));
        department.sendKeys("SDET");
        Select industrySegment= new Select( Driver.getDriver().findElement(By.xpath("//select[@name='communicationemployeeindustry']")));
        industrySegment.selectByIndex(6);
        BrowserUtils.sleep(2);
        WebElement conditions=Driver.getDriver().findElement(By.xpath("//label[@for='asset-terms-conditions-2']"));
        conditions.click();
        BrowserUtils.sleep(2);
        WebElement signUp=Driver.getDriver().findElement(By.id("regsubmit"));
        signUp.click();
        Driver.closeDriver();
    }


}
/*


3. Verify title and print result

4. Locate all links in the page and print text for each

5. Find a button and click it and go back privious page

6. Find element for that as much as possible much way

7. Find element just use x-path different ways

8. Find element just use cssSelector different way

9. Find dynamic value and find element with that

10. Write text if it is possible for page

11. Test checkboxes and radio buttons

12. Test dropdown and select one option with different way

 */
////div[@class='radio']//label[@for='radio2']
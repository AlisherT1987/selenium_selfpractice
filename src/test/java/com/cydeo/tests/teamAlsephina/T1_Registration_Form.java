package com.cydeo.tests.teamAlsephina;



import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class T1_Registration_Form {
    @Test
    public void testName() {
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        List<WebElement> registrationForm= Driver.getDriver().findElements(By.xpath("//input[@class='form-control']"));
        //System.out.println("registrationForm.size() = " + registrationForm.size());
        List<String> list=new ArrayList<>(Arrays.asList("Alisher","Tus","Alish87","sjhd@gmail.com","12345678","123-456-7890","03/19/1987"));
        for (int i=0,j=0; i<registrationForm.size();i++,j++) {
           registrationForm.get(i).sendKeys(list.get(j));
        }
    }

}
//TC#1: Registration form confirmation
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
//3. Enter first name
//4. Enter last name
//5. Enter username
//6. Enter email address
//7. Enter password
//8. Enter phone number
//9. Select a gender from radio buttons
//10.Enter date of birth
//11.Select Department/Office
//12.Select Job Title
//13.Select programming language from checkboxes
//14.Click to sign up button
//15.Verify success message “You’ve successfully completed registration.” is
//displayed.
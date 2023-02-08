package com.cydeo.teamAlsephina;



import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_to_T6_Actions_Practices {
    @Test
    public void test2() {
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        WebElement text=Driver.getDriver().findElement(By.id("droptarget"));
        Assert.assertTrue(text.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void test3() {
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        Actions action=new Actions(Driver.getDriver());
        action.dragAndDrop(Driver.getDriver().findElement(By.id("draggable")),Driver.getDriver().findElement(By.id("droptarget"))).perform();
        WebElement text=Driver.getDriver().findElement(By.id("droptarget"));
        Assert.assertEquals(text.getText(),"You did great!");
        Driver.closeDriver();
    }
    @Test
    public void test4() {
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        Actions action=new Actions(Driver.getDriver());
        action.clickAndHold(Driver.getDriver().findElement(By.id("draggable"))).moveToElement(Driver.getDriver().findElement(By.id("page-footer"))).perform();
        WebElement text=Driver.getDriver().findElement(By.id("droptarget"));
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(),"Drop here.");
        Driver.closeDriver();
    }
    @Test
    public void test5() {
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        Actions action=new Actions(Driver.getDriver());
        action.dragAndDrop(Driver.getDriver().findElement(By.id("draggable")),Driver.getDriver().findElement(By.id("page-footer"))).perform();
        WebElement text=Driver.getDriver().findElement(By.id("droptarget"));
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(),"Try again!");
        Driver.closeDriver();
    }
    @Test
    public void test6() {
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        Actions action=new Actions(Driver.getDriver());
        action.clickAndHold(Driver.getDriver().findElement(By.id("draggable"))).moveToElement(Driver.getDriver().findElement(By.id("droptarget"))).perform();
        WebElement text=Driver.getDriver().findElement(By.id("droptarget"));
        System.out.println(text.getText());
       Assert.assertEquals(text.getText(),"Now drop...");
        Driver.closeDriver();
    }
}
/*
TC2 #: Drag and drop default value verification
1. Go to https://practice.cydeo.com/drag_and_drop_circles 2. Verify big circle default text is as below.
3. Assert:
-Text in big circle changed to: “Drag the small circle here.”
TC3 #: Drag and drop into the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles 2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”
TC4 #: Click and hold
1. Go to https://practice.cydeo.com/drag_and_drop_circles 2. Click and hold the small circle.
3. Assert:
-Text in big circle changed to: “Drop here.”
TC5 #: Drag and drop outside of the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles 2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “Try again!”
TC6 #: Drag and hover
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag the small circle on top of the big circle, hold it, and verify. 3. Assert:
-Text in big circle changed to: “Now drop...”
 */



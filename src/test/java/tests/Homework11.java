package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Homework11 extends TestBase {
    @Test
    public void test(){
        //Go to https://the-internet.herokuapp.com/dynamic_controls
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //Click enable Button
        WebElement enableButton=driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();
        //And verify the message is equal to “It's enabled!”

        WebElement mesaj1=driver.findElement(By.xpath("//p[@id='message']"));
        waitForVisibility(mesaj1,10);
        Assert.assertEquals("It's enabled!",mesaj1.getText());

        //verify the textbox is enabled (I can type in the box)

        WebElement kutu= driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertTrue(kutu.isEnabled());

        //And click on Disable button

        WebElement disableButton=driver.findElement(By.xpath("//button[text()='Disable']"));
        disableButton.click();

        //And verify the message is equal to “It's disabled!”

        WebElement mesaj2= driver.findElement(By.xpath("//p[@id='message']"));
        waitForVisibility(mesaj2,10);
        Assert.assertEquals("It's disabled!",mesaj2.getText());

        //And verify the textbox is disabled (I cannot type in the box)

        WebElement yazilmayankutu=driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertFalse(yazilmayankutu.isEnabled());




    }
}
/*
Create a class:Synchronization4. Create a method: isEnabled
Go to https://the-internet.herokuapp.com/dynamic_controls
Click enable Button
And verify the message is equal to “It's enabled!”
And verify the textbox is enabled (I can type in the box)
And click on Disable button
And verify the message is equal to “It's disabled!”
And verify the textbox is disabled (I cannot type in the box)
NOTE: .isEnabled(); is used to check if an element is enabled or not
 */

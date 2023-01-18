package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Homework10 extends TestBase {
    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement removebutton=driver.findElement(By.xpath("//button[text()='Remove']"));
        removebutton.click();
        waitForVisibility(removebutton,10);
         //button[text()='Add']
        String mesaj= driver.findElement(By.xpath("//p[@id='message']")).getText();
        Assert.assertEquals("It's gone!",mesaj);
        WebElement addbutton=driver.findElement(By.xpath("//button[@type='button']"));
        addbutton.click();
        waitForVisibility(addbutton,10);
        WebElement mesaj2= driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertEquals("It's back!",mesaj2.getText());



    }
}

/*
Create a class:Synchronization3. Create a method: synchronization1
Go to https://the-internet.herokuapp.com/dynamic_controls
Click on remove button
And verify the message is equal to “It's gone!”
Then click on Add button
And verify the message is equal to “It's back!”
 */

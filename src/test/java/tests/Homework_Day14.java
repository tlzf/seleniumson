package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Homework_Day14 extends TestBase {
    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
        WebElement elementMesaj= driver.findElement(By.xpath("//div[@id='finish']"));
        waitForVisibility(elementMesaj,10);
        Assert.assertEquals("Hello World!",elementMesaj.getText());



    }
}
/*
Create a class:Synchronization2.
Create a method: synchronization2
Go to https://the-internet.herokuapp.com/dynamic_loading/2
When user clicks on the Start button
Then verify the ‘Hello World!’ Shows up on the screen
 */

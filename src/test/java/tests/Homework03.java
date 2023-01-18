package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Homework03 extends TestBase {

    @Test
    public void homework03(){
        //When user goes to https://www.google.com/
        driver.get("https://www.google.com/");
        //Search for “porcelain teapot”
       driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("porcelain teapot");
        driver.findElement(By.name("btnK")).click();
        System.out.println(driver.findElement(By.id("result-stats")).getText());











    }
    /*Create a new class : GoogleSearchTest 
Create Test method and complete the following task. 
When user goes to https://www.google.com/
Search for “porcelain teapot”
And print how many related results displayed on Google
}

     */
}
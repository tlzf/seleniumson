package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Homework07 extends TestBase {
    @Test
    public void test(){
        driver.get("https://jqueryui.com/autocomplete/");
        driver.switchTo().frame(0);
        driver.findElement(By.id("tags")).sendKeys("Apple");
        driver.findElement(By.xpath("//div[.='AppleScript']"));



    }
}
/*
When user goes to https://jqueryui.com/autocomplete/
And type Apple
Then select Applescript
 */

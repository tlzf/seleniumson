package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Homework04 extends TestBase {

    @Test
    public void test(){
        driver.get("https://jqueryui.com/accordion/");
        waitFor(3);

        driver.switchTo().frame(0);
        driver.findElement(By.id("ui-id-3")).click();
        String paragraf=driver.findElement(By.id("ui-id-4")).getText();
        System.out.println(paragraf);
        Assert.assertTrue(paragraf.contains("Sed non urna."));




    }
}

/*
When user goes to https://jqueryui.com/accordion/
And user clicks on Section2 accordion
Verify the text contains “Sed non urna.”
 */

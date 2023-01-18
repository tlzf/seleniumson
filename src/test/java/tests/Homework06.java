package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Homework06 extends TestBase {
    @Test
    public void test(){
        driver.get("https://jqueryui.com/toggle/ ");
        driver.switchTo().frame(0);
        String paragraf=driver.findElement(By.xpath("//div[@id='effect']//p")).getText();
        System.out.println(paragraf);
        //Then click on Run Effect button
        driver.findElement(By.id("button")).click();
        waitFor(3);
        //Then print the text and verify it is empty.
        String bosLevha=driver.findElement(By.xpath("//div[@class='toggler']")).getText();

        System.out.println("boslevha isteburda"+bosLevha);
        Assert.assertTrue(bosLevha.isBlank());
        //Then click on Run Effect button one more time
        driver.findElement(By.id("button")).click();
        String paragraff=driver.findElement(By.xpath("//div[@id='effect']//p")).getText();
        System.out.println(paragraf);





    }
}
/*
When user goes to https://jqueryui.com/toggle/
Print the text that should be : Etiam libero neque, luctus a, eleifend nec, semper at, lorem. Sed pede. Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi.
Eg: System.out.println(element); -> Etiam libero neque, luctus a, eleifend nec, semper at, lorem. Sed pede. Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi.
Then click on Run Effect button
Then print the text and verify it is empty.
Eg: System.out.println(element); -> NO TEXT
Then click on Run Effect button one more time
Print the text that should be : Etiam libero neque, luctus a, eleifend nec, semper at, lorem. Sed pede. Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi.
Eg: System.out.println(element); -> Etiam libero neque, luctus a, eleifend nec, semper at, lorem. Sed pede. Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi.
You can use hard wait if needed.
 */

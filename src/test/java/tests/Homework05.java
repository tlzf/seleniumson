package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.LocalDate;
import java.util.List;

public class Homework05 extends TestBase {
    @Test
    public void test(){
        driver.get("https://jqueryui.com/datepicker/ ");
        driver.switchTo().frame(0);
        driver.findElement(By.id("datepicker")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//td[6]//a[@class='ui-state-default']")).click();
        LocalDate currentDate=LocalDate.now();

        List<WebElement> numberOfDays=driver.findElements(By.xpath("//td//a[@class='ui-state-default']"));
        for (int i=1;i<numberOfDays.size();i++){
            if (numberOfDays.get(i).equals(currentDate)){
                numberOfDays.get(i+1).click();
            }

        }




    }
}
/*
When user goes to https://jqueryui.com/datepicker/
And select the next date of the current date
EG if today is August 30, 2022 -> select August 31, 2022
 */

package tests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;
public class Day11_ScreenshotOfSpecificElements extends TestBase {
    @Test
    public void screenshotTest() throws IOException {
        driver.get("https://www.techproeducation.com");
        WebElement techProEdLogo = driver.findElement(By.xpath("//div[@data-id='898ce2e']"));
        //verifying the logo
        Assert.assertTrue(techProEdLogo.isDisplayed());
        //getting the screenshot using reusable method
        takeScreenshotOfTheElement(techProEdLogo);

//        taking screenshot of social media icons
        WebElement socials = driver.findElement(By.xpath("//div[@data-id='d7545f2']"));
        takeScreenshotOfTheElement(socials);
    }

    @Test
    public void tst() throws IOException {
        driver.get("https://www.amazon.com/");
        WebElement resmicekileckelement=driver.findElement(By.xpath("//h2[.='The New Year Sale']"));
        takeScreenshotOfTheElement(resmicekileckelement);

    }
}

/*
Acceptance Criteria:
When user goes to the application home page(techproeducation)
Then verify the logo of techpro education is displayed
 */

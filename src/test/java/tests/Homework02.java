package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Homework02 extends TestBase {
    /*
Then create 3 different test methods using the following names. And Go to google. 
titleTest =>Verify if google title = “Google” 
imageTest => Verify if google image displays or not 
gmailLinkTest => Verify if the Gmail link is displayed or not
Close the browser after each test
 */


@Test
    public void titleTest() {

    driver.get("https://www.google.com/");
    Assert.assertEquals("Google",driver.getTitle());
}
@Test
    public void imageTest(){
    driver.get("https://www.google.com/");
    WebElement picture=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
    Assert.assertTrue(picture.isDisplayed());

}

    @Test
    public void gmailLinkTest(){
        driver.get("https://www.google.com/");
        WebElement mail=driver.findElement(By.linkText("Gmail"));
        Assert.assertTrue(mail.isDisplayed());

    }

}
package practices.practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.io.IOException;
import java.util.List;

public class silineceek extends TestBase {

    @Test
    public void test() {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Actions actions=new Actions(driver);
        actions.sendKeys("memet").
                sendKeys(Keys.TAB).
                sendKeys("yesil").
                sendKeys(Keys.TAB).
                sendKeys("12345").
                sendKeys(Keys.TAB).
                sendKeys("19567ytfghjy.89").
                sendKeys(Keys.TAB).
                sendKeys("19").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).




                perform();



    }

}
  /*
  Given
      Go to https://www.facebook.com/
  When
      Click on "Create New Account"
  And
      Fill all the boxes by using keyboard actions class
   */
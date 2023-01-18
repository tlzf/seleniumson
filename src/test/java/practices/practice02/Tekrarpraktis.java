package practices.practice02;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

/*
Create a class: Actions2
Create test method : hoverOver() and test the following scenario:
Given user is on the https://www.amazon.com/
When use click on “Account” link
Then verify the page title contains “Your Account”
 */
public class Tekrarpraktis extends TestBase {
    @Test
    public void iframeTest(){
       driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement sourceElement=driver.findElement(By.id("draggable"));
        WebElement targetElement=driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(sourceElement,targetElement).perform();


    }
}

/*
What might be the reason for your test case to fail?
There may be wait problem. The page may be very slow. Internet maybe not fast enough.
Put some more wait. We can use explicit wait in selenium(we will learn later)
Locator might be incorrect.
Double check locator and fix if needed
Data issue. Typo in our expected values.
If there is any documentation issue, we can talk to BA to fix the document and then we can use correct expected values
Maybe there is an iframe on the page
We first need to switch to the frame
Maybe there is an alert on the page
We first need to handle the alert by accepting or dismissing
Maybe the page opens in a new tab or window
We first need to switch the target window
It may be a real bug that is caused by the latest codes.
We discuss the issue with the team then raise a bug ticket if needed
 */
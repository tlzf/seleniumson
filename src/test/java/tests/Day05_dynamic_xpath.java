package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Day05_dynamic_xpath {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 seconds wait in case needed
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    public void dynamicXpath(){
//        1. XPATH = //*[.='TEXT OF THE ELEMENT']
//        Verify if "Username : Admin" is text is displayed on the page
//        //[.='Username : Admin'] return the element whose text = Username : Admin
        WebElement userNameText = driver.findElement(By.xpath("//*[.='Username : Admin']"));
        Assert.assertTrue(userNameText.isDisplayed());
//        Verify if "Password : admin123" text is displayed on the page
        WebElement passwordText = driver.findElement(By.xpath("//*[.='Password : admin123']"));
        Assert.assertTrue(passwordText.isDisplayed());
//        2. XPATH = //[(text()='TEXT OF THE ELEMENT')]
        WebElement userNameText1 = driver.findElement(By.xpath("//*[contains(text(),'Passw')]"));
        Assert.assertTrue(userNameText1.isDisplayed());
    }

    @Test
    public void tearDown(){
        driver.quit();
    }
}
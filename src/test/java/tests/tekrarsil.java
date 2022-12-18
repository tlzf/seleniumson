package tests;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tekrarsil {


    WebDriver driver;
    @Before
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(15);
        driver.manage().window().maximize();
        driver.get("");
    }

}

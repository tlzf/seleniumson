package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Homework01 {
    /*
    Create A Class: AmazonDropdown
--Create A Method dropdownTest
//--Go to https://www.amazon.com/
//--Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
//--Print the first selected option and assert if it equals “All Departments”.If it fails, then comment that code out and continue rest of the test case.
//--Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method).
// If it fails, then comment that code out and continue rest of the test case.
//--Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
//--Print the the total number of options in the dropdown
//--Assert if ‘Appliances’ is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
//--BONUS: Assert if the dropdown is in Alphabetical Order
     */

    WebDriver driver;
    @Before
    public void testSetUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @Test
    public void homeworkAmazon(){
        //Go to https://www.amazon.com/
        driver.get( "https://www.amazon.com/");
        //--Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
       WebElement dropDown= driver.findElement(By.id("searchDropdownBox"));
        //--Print the first selected option and assert if it equals “All Departments”.If it fails,


        // then comment that code out and continue rest of the test case.
        Select select=new Select(dropDown);
        String selectedOption=select.getFirstSelectedOption().getText();
        System.out.println(selectedOption);
        if (selectedOption.equals("All Departments")){


        }
        /*--Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.
         (after you select you need to use get first selected option method)
        If it fails, then comment that code out and continue rest of the test case.
         */

        select.selectByIndex(3);
        String selectedOptionByIndex=select.getFirstSelectedOption().getText();
        System.out.println(selectedOption);
        Assert.assertEquals("code out","Amazon Devices",selectedOptionByIndex);
        //--Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
        List<WebElement> dropdownList=select.getOptions();
        for (WebElement w:dropdownList) {

            System.out.println(w.getText());
        }

        //--Print the the total number of options in the dropdown
        System.out.println(select.getOptions().size());

        //--Assert if ‘Appliances’ is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
        boolean isAppliancesExist =false;
        for (WebElement w:dropdownList
             ) {
            if (w.getText().equals("Appliances")){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }


    }

}

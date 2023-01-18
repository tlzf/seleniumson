package tests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;
public class Day09_FileDownloadTest extends TestBase {
 @Test
 public void downloadTest() throws InterruptedException {
  driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
//    Download junit-4.13-beta-3.jar file
  driver.findElement(By.partialLinkText("b10 all test cases")).click(); //downloading the file
  Thread.sleep(2000); //After click, it takes a few millisecond, so using hard wait
//    Then verify if the file downloaded successfully
  String homeDirectory = System.getProperty("user.home");
  String filePath = homeDirectory+"/Downloads/b10 all test cases, code.docx";
//        String filePath = homeDirectory+"\\Documents\\junit-4.13-beta-3.jar"; WINDOWS
  System.out.println();
  boolean isDownloaded = Files.exists(Paths.get(filePath));
  Assert.assertTrue(isDownloaded);


 }
}
/*
Create a class:FileDownloadTest
downloadTest()
In the downloadTest() method, do the following test:
https://testcenter.techproeducation.com/index.php?page=file-download
Download some-file.txt file
Then verify if the file downloaded successfully
 */
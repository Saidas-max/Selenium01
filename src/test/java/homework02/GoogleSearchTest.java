package homework02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class GoogleSearchTest extends TestBase {

    /*
    Create a new class : GoogleSearchTest 
Create Test method and complete the following task. 
When user goes to https://www.google.com/
Search for “porcelain teapot”
And print how many related results displayed on Google

     */

    @Test
    public void test(){
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//input[@class ='gLFyf']")).sendKeys("porcelain teapot");
 driver.findElement(By.xpath("//*[@value='Google Search']")).click();
String result = driver.findElement(By.id("result-stats")).getText();
 driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("porcelain teapot"+ Keys.ENTER);
        System.out.println("result " + result);
    }
}

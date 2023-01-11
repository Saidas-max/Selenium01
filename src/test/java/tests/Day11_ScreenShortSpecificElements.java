package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;

public class Day11_ScreenShortSpecificElements extends TestBase {

 @Test
 public void screenShortTest() throws IOException {
driver.get("https://techproeducation.com/");
  WebElement techProEDLogo = driver.findElement(By.xpath("//div[@data-id ='898ce2e']"));
//verifying the logo
     Assert.assertTrue(techProEDLogo.isDisplayed());
//get the screenshot using the reusable method


// Taking screenshot social media



    }
}

package Practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static org.junit.Assert.assertTrue;

public class Q04 extends TestBase {
    /*
   Given


   When

   And

   Then

    */

    @Test
    public void test() throws InterruptedException {
      //  Go to https://www.gmibank.com/

        driver.get("https://www.gmibank.com/");
       // Hover over "Premium" Deposit Package

WebElement premiumElement = driver.findElement(By.xpath("//h4[.='Premium']"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.moveToElement(premiumElement).perform();
       // Click on "Book Now"
        driver.findElement(By.linkText("Book Now")).click();
        //Verify url contains "services"
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("services"));

    }
}

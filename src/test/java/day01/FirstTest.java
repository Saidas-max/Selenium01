package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        // STEP 1: SET UP:
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");

        //STEP 2:CREATE
        WebDriver driver=new ChromeDriver();

//STEP 3: WRITE TEST SCRIPTS. Maximize the window

      //  Open google home page https://www.walmart.com/
        driver.get("https://www.walmart.com/");
      //  On the same class, Navigate to amazon home page https://www.amazon.com/
//        driver.get("https://www.amazon.com/");//WORKS
        driver.navigate().to("https://www.amazon.com/");
//Navigate back to walmart

        driver.navigate().back();

        //Navigate back to walmart
        driver.navigate().refresh();

//Navigate forward to amazon
        driver.navigate().refresh();


        //Close/Quit the browser
        //driver.quit();
        driver.quit();
    }
}

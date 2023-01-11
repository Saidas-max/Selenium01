package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Day01_basicNavigations {
    public static void main(String[] args) {

        // STEP 1: SET UP:
  System.setProperty("webdriver.chrome.driver","./src/resource/drivers/chromedriver");

//Step 2:

//STEP 2:CREATE
 WebDriver driver=new ChromeDriver();

//STEP 3: WRITE TEST SCRIPTS. Maximize the window
//maximize the window
        driver.manage().window().maximize();
//  Open google home page https://www.walmart.com/
driver.get("https://www.walmart.com/");
 //  On the same class, Navigate to amazon home page https://www.amazon.com/
//        driver.get("https://www.amazon.com/");//WORKS

    }
}

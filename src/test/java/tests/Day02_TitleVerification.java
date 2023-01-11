package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Day02_TitleVerification {
    public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","./src/resource/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Tech-pro Education| Online it & Bootcamp";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE:"+actualTitle);
            System.out.println("BUT EXPECTED TITLE :"+expectedTitle);
        }
        driver.quit();
    }
}

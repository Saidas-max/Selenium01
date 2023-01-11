package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_URLVerification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./src/resource/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");

      //Verify if homepage url is https://www.techproeducation.com/

      String actualURL =  driver.getCurrentUrl();
      String expectedURL = "https://www.techproeducation.com/" ;
      if (actualURL.equals(expectedURL)){
          System.out.println("PASS");

          }else{
          System.out.println("FALL");
          System.out.println("ACTUAL URL;"+actualURL);
          System.out.println("BUT EXPECTED URL :"+ expectedURL);
          }
      driver.quit();

      /*
      What do yo
       */
      }


    }


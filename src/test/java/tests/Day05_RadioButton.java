package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day05_RadioButton {

    WebDriver driver;

    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");

        }
        @Test
    public void radioButton(){
        // select red
WebElement redOption =driver.findElement(By.id("red"));
redOption.click();
            Assert.assertTrue(redOption.isSelected());

            WebElement footBallOption  = driver.findElement(By.id("football"));
            footBallOption.click();
            Assert.assertTrue(footBallOption.isSelected());

            // select football
    }
}

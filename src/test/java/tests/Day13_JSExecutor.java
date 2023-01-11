package tests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilities.TestBase;
public class Day13_JSExecutor extends TestBase {
    @Test
    public void scrollIntoViewTest() {
        driver.get("https://techproeducation.com/");
        waitFor(3);
//        1. create js executor object
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        2. execute the command
        waitFor(3);
//        scrolling We Offer text
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[.='we offer']")));
        waitFor(3);
//        scrolling LMS LOGIN text
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
        scrollIntoViewJS(driver.findElement(By.xpath("//h3[.='WHY US?']")));
    }
        /*
    scroll the page all the down
     */
        public void scrollAllDownByJS(){
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        }
    /*
    scroll the page all the way up
     */
        public void scrollAllUpByJS(){
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        }


    }

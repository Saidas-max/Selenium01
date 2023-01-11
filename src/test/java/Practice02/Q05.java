package Practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q05 extends TestBase {

    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html

    @Test
    public void test() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Match the capitals by country.
       WebElement oslo = driver.findElement(By.id("box1"));
       WebElement stockolm = driver.findElement(By.id("box2"));
       WebElement washington = driver.findElement(By.id("box3"));
        WebElement copenhagen = driver.findElement(By.id("box4"));
      WebElement seoul =  driver.findElement(By.id("box5"));
        WebElement rome = driver.findElement(By.id("box6"));
       WebElement madrid =  driver.findElement(By.id("box7"));
       // Countries

        WebElement norwey =driver.findElement(By.id("box101"));
        WebElement sweden =driver.findElement(By.id("box102"));
        WebElement usa =driver.findElement(By.id("box103"));
        WebElement denmark =driver.findElement(By.id("box104"));
        WebElement korea =driver.findElement(By.id("box105"));
        WebElement Italy =driver.findElement(By.id("box106"));
        WebElement spain=driver.findElement(By.id("box107"));

//Drag and drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(oslo,norwey).
                dragAndDrop(stockolm , sweden).
                dragAndDrop(washington,usa).
                dragAndDrop(copenhagen,denmark).
                dragAndDrop(seoul,korea ).
                dragAndDrop(rome,Italy).
                dragAndDrop(madrid,spain).build().
                perform();


    }
}

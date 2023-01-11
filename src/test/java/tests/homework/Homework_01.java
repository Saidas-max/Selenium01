package tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;



public class Homework_01 {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 seconds wait in case needed
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");



/*


 1.Create A Class: AmazonDropdown +
2. Create A Method dropdownTest +
Go to https://www.amazon.com/ +
Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")+
Print the first selected option and assert if it equals “All Departments”.If it fails,
 then comment that code out and continue rest of the test case.
Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method). If it fails, then comment that code out and continue rest of the test case.
Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
Print the the total number of options in the dropdown
Assert if ‘Appliances’ is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
BONUS: Assert if the dropdown is in Alphabetical Order
 */
    }

    @Test
    public void DropDownTest() {
        WebElement dropdown;
        dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByIndex(0);


        }
            @Test
     public void selectByVisibleTextTest(){

     WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
                           Select select = new Select(dropdown);
                List<WebElement>  firstSelection = select.getOptions() ;
                
      //   Print the first selected option and assert if it equals “All De
          //  then comment that code out and continue rest of the test case.              boolean firstSelectedOption = false;
                       
                       
            }


        }



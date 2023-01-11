package homework02;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class AmazonDropdown extends TestBase {
@Test
    public void test(){
 // Go to https://www.amazon.com/
 driver.get(" https://www.amazon.com/");
// Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
driver.findElement(By.id("searchDropdownBox")).sendKeys();

}



   // Print the first selected option and assert if it equals “All Departments”.If it fails, then comment that code out and continue rest of the test case.
   // Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method). If it fails, then comment that code out and continue rest of the test case.
    //Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
    //Print the the total number of options in the dropdown
    //Assert if ‘Appliances’ is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
 //  BONUS: Assert if the dropdown is in Alphabetical Order

}

package tests;

import org.junit.Test;
import utilities.TestBase;

import java.io.IOException;

public class Day10_ScreenShortsOfEntirePage extends TestBase {

    @Test
    public void takeScreenShortTest() throws IOException, InterruptedException {

   // Given user search for ‘uni’
    driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
    takeScreenshotOfPage();
// Take a screenshot.Create a reusable method
takeScreenshotOfPage();
    //Homework

//And select United Kingdom
    searchAndSelectFromList("uni","United Kingdom ");
    //TAKE SCREENSORT
        takeScreenshotOfPage();

//Add click on submit button

//Then verify the result contains United Kingdom
    }
    @Test
    public void autoCompleteTestWithReusableMethod()throws InterruptedException{

    }
}

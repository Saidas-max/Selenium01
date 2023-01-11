package practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01 {


    public static void main(String[] args) throws InterruptedException {
        // Practice
        // Set Driver  Path
        System.setProperty("web-driver.chrome.driver", "srs/resources/drivers/chromedriver.exe");


        // Create chrome driver
        WebDriver driver = new ChromeDriver();
        //Maximize the window
driver.manage().window().maximize();

        //Open google home page  https:/www.google.com/
        driver.get("https:/www.google.com/");
        //Navigate back to google

        driver.navigate().to("https://techproeducation.com/");
        //Navigate Fw to techproeducation
        Thread.sleep(1000);
        driver.navigate().back();
        driver.navigate().forward();
        //Refresh the page
        driver.navigate().refresh();
        //Class/Quit the browser
        driver.close();
        //And Last step :print "All ok " on console
        System.out.println("All OK ");
    }

    }


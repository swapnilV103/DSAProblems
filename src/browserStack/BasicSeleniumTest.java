package browserStack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumTest {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver (or the driver for the browser you want to use)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
        
        // Create an instance of ChromeDriver (This opens a new Chrome browser)
        WebDriver driver = new ChromeDriver();
        
        // Navigate to Google's website
        driver.get("https://www.google.com");
        
        // Print the title of the current page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        
        // Close the browser
        driver.quit();
    }
}

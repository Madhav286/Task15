package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWebDriverScript {
    public static void main(String[] args) {
        // Set path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Verify page title
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Page title is as expected: " + expectedTitle);
        } else {
            System.out.println("Page title is not as expected. Actual title: " + actualTitle);
        }

        // Close the browser
        driver.quit();
    }
}


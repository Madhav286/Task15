    package Practice;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GoogleSearch {
	    public static void main(String[] args) {
	        // Set path to ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Open Google
	        driver.get("https://www.google.com");

	        // Find the search input element
	        WebElement searchBox = driver.findElement(By.name("q"));

	        // Type "Selenium Browser Driver" into the search box
	        searchBox.sendKeys("Selenium Browser Driver");

	        // Submit the search query
	        searchBox.submit();

	        // Wait for search results to load (you might need to add explicit wait here)

	        // Close the browser
	        driver.quit();
	    }
	}



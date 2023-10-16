package stepDefinition1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {


		public static WebDriver driver;

		public void openBrowser() {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

		public void navigateUrl(String url) {
			driver.get(url);
		}
		
		public void closeBrowser()
		{
			driver.quit();
		}
}

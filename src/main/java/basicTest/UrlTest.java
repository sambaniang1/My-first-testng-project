package basicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UrlTest {

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/new/Documents/Browsers/chromedriver");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void openFacebook() {
		driver.get("http://www.facebook.com");
	}
	@Test
	public void openGmail() {
		driver.get("http://www.gmail.com");
	}
	@Test
	public void openAmazon() {
		driver.get("http://www.amazon.com");
	}
	
}

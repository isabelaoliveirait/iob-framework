package driverNew;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNew {

	WebDriver driver;

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lojaexemplod.lojablindada.com/");
	}
	
	@After
	public void closerBrowser() {
		driver.quit();
	}
	
	

}

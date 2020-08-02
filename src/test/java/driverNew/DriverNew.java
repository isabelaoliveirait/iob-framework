package driverNew;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNew {

	private static WebDriver driver;

	@Before
	public static void openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@After
	public static void closerBrowser() {
		driver.quit();
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	//com esse método é possível alterar a url em qualquer parte do projeto
	
	public static void setUrl(String url) {
		driver.get(url);
	}
}



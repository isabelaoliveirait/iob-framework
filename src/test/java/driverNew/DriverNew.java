package driverNew;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	@Test
	public void realizaPesquisa() {
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("fortaleza digital", Keys.ENTER);
	}

}

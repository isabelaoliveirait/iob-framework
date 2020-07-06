package driverNew;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Test extends DriverNew{

	
	@org.junit.Test
	public void realizaPesquisa() throws InterruptedException {
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("fortaleza digital", Keys.ENTER);
		WebElement tituloLivro = driver.findElement(By.xpath("//h2/a"));
		String livro = tituloLivro.getText();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		Thread.currentThread();
		Thread.sleep(5000);
	}
	
}

package test;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import driverNew.DriverNew;

public class Test extends BaseTest{

	
	@org.junit.Test
	public void realizaPesquisa(){
		WebElement search = DriverNew.getDriver().findElement(By.id("search"));
		search.sendKeys("fortaleza digital", Keys.ENTER);
		WebElement tituloLivro = DriverNew.getDriver().findElement(By.xpath("//h2/a"));
		String livro = tituloLivro.getText();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		WebElement elPreco = DriverNew.getDriver().findElement(By.cssSelector("#product-price-44 > span"));
		String preco = elPreco.getText();
		Assert.assertEquals("R$519,90", preco);
		Thread.currentThread();
	}
	
	@org.junit.Test
	public void testClickList() {
		//ul.products-grid > li
		WebElement search = DriverNew.getDriver().findElement(By.id("search"));
		search.sendKeys("html", Keys.ENTER);		
		List<WebElement>  elLivros = DriverNew.getDriver().findElements(By.cssSelector("ul.products-grid > li"));
		for (WebElement elLivro : elLivros) {
			WebElement tituloLivro = elLivro.findElement(By.cssSelector("h2 > a"));
			String elTituloLivro = tituloLivro.getText();
			if (elTituloLivro.contains("Ajax com Java")) {
				WebElement preco = elLivro.findElement(By.cssSelector("span.price"));
			//	assertEquals("R$444,50", preco);
				break;
			}
		}
	
	}

}

package test;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import driverNew.DriverNew;
import pages.FirstPage;

public class Test extends BaseTest{
	
	FirstPage firstPage = new FirstPage();
	
	@org.junit.Test
	public void realizaPesquisa(){
		firstPage.setSearch("fortaleza digital", Keys.ENTER);
		String book = firstPage.getTitleBook();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", book);
		String price = firstPage.getPrice();
		Assert.assertEquals("R$519,90", price);
		Thread.currentThread();
	}
	
	@org.junit.Test
	public void testClickList() {
		firstPage.setSearch("html", Keys.ENTER);
		
			
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

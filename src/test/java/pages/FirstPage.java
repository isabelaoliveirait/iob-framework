package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverNew.DriverNew;

public class FirstPage {
	
	String elSearch = "search";
	String elTitleBook = "//h2/a";
	String elPrice = "#product-price-44 > span";
	String elBooksList = "ul.products-grid > li";
	
	//utilizamos o char sequence para que ele reconheça ações no browser, se fosse string ele não iria aceitar
	public void setSearch(CharSequence...valor) {
		WebElement search = DriverNew.getDriver().findElement(By.id(elSearch));
		search.sendKeys(valor);

	}
	
	public String getTitleBook() {
		WebElement titlebook = DriverNew.getDriver().findElement(By.xpath(elTitleBook));
		String book = titlebook.getText();
		
		return book;
	}
	
	public String getPrice() {
		WebElement price = DriverNew.getDriver().findElement(By.cssSelector(elPrice));
		return price.getText();
	
	}
	
	public String getPriceList() {
		
		
		List<WebElement>  books = DriverNew.getDriver().findElements(By.cssSelector(elBooksList));
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

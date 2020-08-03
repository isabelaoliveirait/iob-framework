package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverNew.DriverNew;

public class FirstPage {
	
	String elSearch = "search";
	String elTitleBook = "//h2/a";
	String elPrice = "#product-price-44 > span";
	
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
	
	
}

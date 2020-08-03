package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverNew.DriverNew;
import map.InitialMap;

public class FirstPage {
	InitialMap initialMap = new InitialMap();
	
	String elBooksList = "ul.products-grid > li";
	String elPriceList = "span.price";

	// utilizamos o char sequence para que ele reconheça ações no browser, se fosse
	// string ele não iria aceitar
	public void setSearch(CharSequence... value) {	
		initialMap.search.sendKeys(value);

	}

	public String getTitleBook() {
		String book = initialMap.titleBook.getText();
		return book;
	}

	public String getPrice() {
		return initialMap.price.getText();

	}

	public String getPriceList() {
		List<WebElement> books = DriverNew.getDriver().findElements(By.cssSelector(elBooksList));
		for (WebElement elBook : books) {
			WebElement titlebook = elBook.findElement(By.cssSelector("h2 > a"));
			String title = titlebook.getText();
			if (title.contains("Ajax com Java")) {
				WebElement price = elBook.findElement(By.cssSelector(elPriceList));
				return price.getText();

			}
		}
		return null;
	}

}

package driverNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import enums.Values;

public class Element {

	Values by;
	String map;

	public Element(Values by, String map) {
		this.by = by;
		this.map = map;
	}

	public WebElement getElement() {
		WebElement element = null;
		switch (by) {
		case ID:
			element = DriverNew.getDriver().findElement(By.id(map));
			break;
			
		case XPATH:
			element = DriverNew.getDriver().findElement(By.xpath(map));
			break;
			
		case CSSSELECTOR:
			element = DriverNew.getDriver().findElement(By.cssSelector(map));
			break;
			
		case LINKTEXT:
			element = DriverNew.getDriver().findElement(By.linkText(map));
			break;
			
		case NAME:
			element = DriverNew.getDriver().findElement(By.name(map));
			break;	
			
			default:
				break;
		}
		
		return element;
	}
	
	public void sendKeys(CharSequence... value) {
		getElement().sendKeys(value);
		
	}
	
	public String getText() {
		return getElement().getText();
		
	}
	
	public void click() {
		getElement().click();
	}
}

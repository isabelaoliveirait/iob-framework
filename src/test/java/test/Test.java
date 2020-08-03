package test;

import static org.junit.Assert.assertEquals;

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
		String price = firstPage.getPriceList();
		assertEquals("R$444,50", price);
	
	}

}

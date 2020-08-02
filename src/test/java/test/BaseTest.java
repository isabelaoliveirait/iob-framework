package test;

import org.junit.After;
import org.junit.Before;

import driverNew.DriverNew;

public class BaseTest {


	@Before
	public static void openBrowser() {
		DriverNew.openBrowser("https://lojaexemplod.lojablindada.com");
	}

	@After
	public static void closerBrowser() {
		DriverNew.closerBrowser();
	}
	
}

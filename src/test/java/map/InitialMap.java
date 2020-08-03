package map;

import driverNew.Element;
import enums.Values;

public class InitialMap {
	
	String elSearch = "search";
	String elTitleBook = "//h2/a";
	String elPrice = "#product-price-44 > span";
	
	public Element search = new Element(Values.ID, "search");
	public Element titleBook = new Element(Values.XPATH, "//h2/a");
	public Element price = new Element(Values.CSSSELECTOR, "#product-price-44 > span");
	
}

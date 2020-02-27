package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.dev.evozon.com/sale.html")
public class SalePage extends AbstractPage {
	

	
	public String checkUrl() {
		String URL = getDriver().getCurrentUrl();
		
		return URL;
		
	}

}

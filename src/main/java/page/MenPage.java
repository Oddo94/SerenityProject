package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.dev.evozon.com/men.html")
public class MenPage extends AbstractPage  {
	

	
	public String checkMenUrl() {
		String URL = getDriver().getCurrentUrl();
		
		return URL;
		
	

 }
}

package page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://qa2.dev.evozon.com/")
public class MainPage extends AbstractPage {

	@FindBy(css = ".nav-5 > a")
	private WebElementFacade saleSection;
	
	@FindBy(css="#nav > ol > li.level0.nav-2.parent > a")
	private WebElementFacade menSection;
	
	@FindBy(css=".nav-primary>li")
	List<WebElement> menuCategories;


	public void clickOnSaleSection() {
		for(WebElement category: menuCategories){
			if(category.getText().equals("SALE")){
				category.click();
				break;
			}
		}
		waitABit(1000);

		//saleSection.click();
		System.out.println("Clicked section");
	}
		
	public void clickOnMenSection() {
		menSection.click();
		System.out.println("Clicked men section");
	}
	
	
	


}

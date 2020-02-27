package steps;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import page.SalePage;
import models.User;
import net.thucydides.core.annotations.Step;
import page.HeaderPage;
import page.RegisterPage;

public class SalePageSteps {
	SalePage salePage;

	@Step
	public void checkSalePageURL() {
		String expectedURL = "http://qa2.dev.evozon.com/sale.html";
		String actualURL = 	salePage.checkUrl(); 
		
	
		Assert.assertTrue(expectedURL.equals(actualURL));
			
	}
	
	@Step
	public void navigateToSalePage() {
		salePage.open();
	}
}

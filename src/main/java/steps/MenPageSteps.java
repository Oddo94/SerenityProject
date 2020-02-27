package steps;

import net.thucydides.core.annotations.Step;
import page.MenPage;

public class MenPageSteps {
	MenPage menPage;
	
	@Step
	public boolean checkMenPageURL() {
		String expectedURL = "http://qa2.dev.evozon.com/sale.html";
		String actualURL = 	menPage.checkMenUrl(); 
	
		boolean isUrlCorrect = expectedURL.equals(actualURL);
		
		return isUrlCorrect;
	}

}

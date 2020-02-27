package steps;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import page.MainPage;
import page.SalePage;

import models.User;
import net.thucydides.core.annotations.Step;
import page.HeaderPage;
import page.RegisterPage;

public class MainPageSteps extends ScenarioSteps{
	MainPage mainPage;
	
	SalePage salePage;
	
	@Step
	public void clickSaleSection() {
		mainPage.open();
		System.out.println("Here");
		mainPage.clickOnSaleSection();
		System.out.println("THere");
		
	}
	
	@Step
	public void clickMenSection() {
		mainPage.open();
		mainPage.clickOnMenSection();
	}
	
	
	
	

}

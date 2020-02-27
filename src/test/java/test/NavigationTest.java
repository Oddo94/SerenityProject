package test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import page.MainPage;
import page.SalePage;
import steps.MainPageSteps;
import steps.MenPageSteps;
import steps.SalePageSteps;

@RunWith(SerenityRunner.class)
public class NavigationTest extends BaseTest {
	
	
	@Steps
	public MainPageSteps mainPageSteps;
	
	@Steps
	public MenPageSteps menPageSteps;
	
	@Steps
    public SalePageSteps salePageSteps;
	
   
    
	@Ignore
	public void checkSaleNavigation() {
		mainPageSteps.clickSaleSection();
		//salePageSteps.navigateToSalePage();
		salePageSteps.checkSalePageURL();
		System.out.println("SALE TEST");
		
		
	}
	
	
	@Test
	public void checkMenNavigation() {
		mainPageSteps.clickMenSection();
		menPageSteps.checkMenPageURL();
		System.out.println("MEN SECTION");
	}

}

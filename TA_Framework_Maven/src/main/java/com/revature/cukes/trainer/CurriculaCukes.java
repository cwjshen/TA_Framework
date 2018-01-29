package com.revature.cukes.trainer;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.revature.pom.CurriculaTab;
import com.revature.pom.SettingsTab;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CurriculaCukes {

	@Given("^I want to display content$")
	public static void i_want_to_display_content(WebDriver wd) throws Throwable {
		System.out.println("In the Curricula tab");
		CurriculaTab.getCurriculaTab(wd).click();
		String cr = "CURRICULA";
		String ck = CurriculaTab.getCurriculaTabValue(wd);
		//System.out.println("Print ck value" +" " +ck);
		if (cr.equals(ck)) {
			System.out.println("We are in the correct Tab");
		}
	}

	@When("^someone press one of the two tabs button$")
	public static void someone_press_one_of_the_two_tabs_button(WebDriver wd) throws Throwable {
	    
	  String coreArrowValue =  CurriculaTab.Core_Curricula(wd).getText();
	 // System.out.println("CoreArrowValue" + coreArrowValue);
	  CurriculaTab.Core_Curricula(wd).click();
	 // System.out.println("2CoreArrowValue" + coreArrowValue);
	  String focusArrowValue = CurriculaTab.Core_Curricula(wd).getText();
	//  System.out.println("FocusArrowValue" + focusArrowValue);
	  CurriculaTab.Focus_Curricula(wd).click();
	  Assert.assertTrue(CurriculaTab.Core_Curricula(wd).isDisplayed(), "Core button is working");
	  Assert.assertTrue(CurriculaTab.Focus_Curricula(wd).isDisplayed(), "Focus button is working");
 	}

	@Then("^display the content under each tab$")
	public static void display_completed_tab(WebDriver wd) throws Throwable {
		System.out.println("Curricula ran successfully");
	}
	
	
}

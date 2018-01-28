package com.revature.cukes.trainer;

import org.openqa.selenium.WebDriver;
import com.revature.pom.Locations;
import com.revature.pom.NavBar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LocationsCukes {
	

	@Given("^That I am in the Location tab$")
	public static void isInLocations() throws Throwable {
		System.out.println("In Location tab");
	}
	

	@When("^Click the Locations tab$")
	public static void clickLocations(WebDriver wd) throws Throwable {
		Thread.sleep(2000);
		NavBar.navigateToLocationsPage(wd).click();
	}

	@Then("^I should see the Revature HQ drop down$")
	public static boolean RevatureHQExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for Revature HQ drop down");
		if (Locations.findRevatureHQ(wd) != null) {
			return true;
		}
		return false;
	}

	@Then("^New York City drop down$")
	public static boolean NewYorkCityExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for New York City drop down");
		if (Locations.findNewYorkCity(wd) != null) {
			return true;
		}
		return false;	
	}


}

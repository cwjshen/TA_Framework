package com.revature.cukes.trainer;

import org.openqa.selenium.WebDriver;
import com.revature.pom.Locations;
import com.revature.pom.NavBar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LocationsCukes {
/*
	@Given("^That I am initially in the Overview tab$")
	public static boolean startingInOverview(WebDriver wd) throws Throwable {
		if (Locations.inHomePage(wd) != null) {
			return true;
		}
		return false;
	}
*/
	@Given("^The Locations Tab is selected$")
	public static boolean clickedLocations(WebDriver wd){
		try {
			Thread.sleep(2000);
			NavBar.navigateToLocationsPage(wd).click();			
			return true;
		} catch (Throwable e) {
			return false;
		}
	}

	@Then("^I should see the Revature HQ drop down$")
	public static boolean RevatureHQExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for Revature HQ drop down");
		if (Locations.findRevatureHQButton(wd) != null) {
			return true;
		}
			return false;
	}

	@Then("^New York City drop down$")
	public static boolean NewYorkCityExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for New York City drop down");
		if (Locations.findNewYorkCityButton(wd) != null) {
			return true;
		}
		return false;
	}

	@Given("^That I am in the Locations tab$")
	public static boolean inLocationsTab(WebDriver wd) throws Throwable {
		if ((Locations.findRevatureHQButton(wd) != null) && (Locations.findNewYorkCityButton(wd) != null)) {
			return true;
		}
		return false;
	}

	@Given("^Revature HQ and New York City are expanded$")
	// The drop downs will initially be expanded when you click Locations Tab,
	// BUT the style is blank and not set yet
	public static boolean LocationsInitiallyExpanded(WebDriver wd) throws Throwable {
		Thread.sleep(4000);
		System.out.println("!!!!!!!!!!!!!!!!!!! STYLE INITIALLY EXPANDED: "
				+ Locations.findRevatureHQLocations(wd).getAttribute("style"));

		if ((Locations.findRevatureHQLocations(wd).getAttribute("style").equals("")
				|| Locations.findRevatureHQLocations(wd).getAttribute("style").contains("display: block"))
				&& (Locations.findNewYorkCityLocations(wd).getAttribute("style").equals("")
						|| Locations.findNewYorkCityLocations(wd).getAttribute("style").contains("display: block"))) {

			return true;
		}
		return false;
	}

	@When("^Click the Revature HQ and New York City drop downs to close$")
	public static void closeDropDowns(WebDriver wd) throws Throwable {
		Locations.findRevatureHQButton(wd).click();
		Locations.findNewYorkCityButton(wd).click();
	}

	@Then("^Revature HQ and Yew York City style should be display none, meaning hidden$")
	public static boolean LocationsNowHidden(WebDriver wd) throws Throwable {
		Thread.sleep(4000);
		System.out.println(
				"!!!!!!!!!!!!!!!!!!! STYLE NOW HIDDEN: " + Locations.findRevatureHQLocations(wd).getAttribute("style"));

		if ((Locations.findRevatureHQLocations(wd).getAttribute("style").contains("display: none"))
				&& (Locations.findNewYorkCityLocations(wd).getAttribute("style").contains("display: none"))) {
			return true;
		}
		return false;
	}

	// This Test follows after the Test for closing the drop downs, so the drop
	// downs
	// will be hidden initially and have display: none
	@Given("^Revature HQ and New York City are hidden$")
	public static boolean LocationsInitiallyHidden(WebDriver wd) throws Throwable {
		Thread.sleep(4000);
		System.out.println("!!!!!!!!!!!!!!!!!!! STYLE: " + Locations.findRevatureHQLocations(wd).getAttribute("style"));

		if ((Locations.findRevatureHQLocations(wd).getAttribute("style").contains("display: none"))
				&& (Locations.findNewYorkCityLocations(wd).getAttribute("style").contains("display: none"))) {
			return true;
		}
		return false;
	}

	@When("^Click the Revature HQ and New York City drop downs to expand$")
	public static void expandDropDowns(WebDriver wd) throws Throwable {
		Locations.findRevatureHQButton(wd).click();
		Locations.findNewYorkCityButton(wd).click();
	}

	@Then("^Revature HQ and Yew York City style should be display block, meaning expanded$")
	public static boolean LocationsNowExpanded(WebDriver wd) throws Throwable {
		Thread.sleep(4000);
		System.out.println("!!!!!!!!!!!!!!!!!!! STYLE NOW EXPANDED: "
				+ Locations.findRevatureHQLocations(wd).getAttribute("style"));

		if ((Locations.findRevatureHQLocations(wd).getAttribute("style").contains("display: block"))
				&& (Locations.findNewYorkCityLocations(wd).getAttribute("style").contains("display: block"))) {
			return true;
		}
		return false;
	}

}

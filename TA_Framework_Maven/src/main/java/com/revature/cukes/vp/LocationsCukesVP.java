package com.revature.cukes.vp;

import org.openqa.selenium.WebDriver;
import com.revature.pom.Locations;
import com.revature.pom.NavBar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LocationsCukesVP {

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

	/*
	@Given("^TEMPLATE$")
	public static void a(WebDriver wd){
		
	}

	@When("^TEMPLATE2$")
	public static void aa(WebDriver wd) throws Throwable {
		
	}

	@Then("^TEMPLATE3$")
	public static void aaa(WebDriver wd) throws Throwable {
		
	}
	*/
	
	@Given("^Click the Add Location button$")
	public static void AddLocation(WebDriver wd){
		
	}

	@When("^Fill out Location form and submit$")
	public static void FillAndSubmitLocationForm(WebDriver wd) throws Throwable {
		
	}

	@Then("^I should see the new Location$")
	public static void NewLocationExists(WebDriver wd) throws Throwable {
		
	}
	
	@Given("^Click the Add Building button$")
	public static void AddBuilding(WebDriver wd){
		
	}

	@When("^Fill out Building form and submit$")
	public static void FillAndSubmitBuildingForm(WebDriver wd) throws Throwable {
		
	}

	@Then("^I should see the new Building$")
	public static void NewBuildingExists(WebDriver wd) throws Throwable {
		
	}
	
	@Given("^Click the Add Room button$")
	public static void AddRoom(WebDriver wd){
		
	}

	@When("^Fill out Room form and submit$")
	public static void FillAndSubmitRoomForm(WebDriver wd) throws Throwable {
		
	}

	@Then("^I should see the new Room$")
	public static void NewRoomExists(WebDriver wd) throws Throwable {
		
	}
	
}
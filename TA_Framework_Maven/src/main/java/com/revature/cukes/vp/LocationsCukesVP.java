package com.revature.cukes.vp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.revature.pom.Locations;
import com.revature.pom.NavBar;
import com.revature.pom.vp.LocationsVP;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LocationsCukesVP {

	// change this number to change the test names of locations/buildings
	static int iteration = 36;
	static int loc_count = 0;
	static List<WebElement> locCount;

	@Given("^The Locations Tab is selected VP$")
	public static boolean clickedLocations(WebDriver wd) {
		try {
			Thread.sleep(2000);
			NavBar.navigateToLocationsPage(wd).click();
			return true;
		} catch (Throwable e) {
			return false;
		}
	}

	@Then("^I should see the Revature HQ drop down VP$")
	public static boolean RevatureHQExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for Revature HQ drop down");
		if (Locations.findRevatureHQButton(wd) != null) {
			return true;
		}
		return false;
	}

	@Then("^New York City drop down VP$")
	public static boolean NewYorkCityExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for New York City drop down");
		if (Locations.findNewYorkCityButton(wd) != null) {
			return true;
		}
		return false;
	}

	/*
	 * @Given("^TEMPLATE$") public static void a(WebDriver wd){
	 * 
	 * }
	 * 
	 * @When("^TEMPLATE2$") public static void aa(WebDriver wd) throws Throwable {
	 * 
	 * }
	 * 
	 * @Then("^TEMPLATE3$") public static void aaa(WebDriver wd) throws Throwable {
	 * 
	 * }
	 */

	@When("^Click the Add Location button$")
	public static boolean clickAddLocation(WebDriver wd) {
		try {
			LocationsVP.findAddLocationButton(wd).click();
			return true;
		} catch (Throwable e) {
			System.out.println("Failed to find Add Location Button");
			return false;
		}
	}

	@When("^Fill out Location form and submit$")
	public static boolean FillAndSubmitLocationForm(WebDriver wd) {
		try {
			// Thread.sleep(2000);
			// locCount = LocationsVP.getLocations(wd);
			// System.out.println("!!!!!!!!!!!!!!!!!!!!! THERE ARE " + (locCount.size() / 2)
			// + " LOCATIONS");
			Thread.sleep(1000);
			LocationsVP.findLocationNameField(wd).sendKeys("Future Gadget Lab" + iteration);
		} catch (Throwable e) {
			System.out.println("Failed to input location name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationCityField(wd).sendKeys("Akihabara");
		} catch (Throwable e) {
			System.out.println("Failed to input location city");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationStateDropDown(wd).sendKeys("VA");
			// Iframe becomes *unhidden* when closing the form window
		} catch (Throwable e) {
			System.out.println("Failed to type state VA into state drop down list");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.locationForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
		/*
		 * try { Thread.sleep(2000); LocationsVP.locationForm(wd);
		 * System.out.println("Form not closed some reason"); return false; } catch
		 * (Throwable e) { locCount = LocationsVP.getLocations(wd);
		 * System.out.println("!!!!!!!!!!!!!!!!!!!!! THERE ARE NOW" + (locCount.size() /
		 * 2) + " LOCATIONS"); return true; }
		 */

	}

	@When("^Fill out Location form with an old deleted name and submit$")
	public static boolean FillAndSubmitLocationFormWithOldName(WebDriver wd) {
		try {
			// Thread.sleep(2000);
			// locCount =
			// wd.findElements(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list"));
			// System.out.println("!!!!!!!!!!!!!!!!!!!!! THERE ARE " + (locCount.size() / 2)
			// + " LOCATIONS");
			Thread.sleep(1000);
			LocationsVP.findLocationNameField(wd).sendKeys("Future Gadget Lab");
		} catch (Throwable e) {
			System.out.println("Failed to input location name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationCityField(wd).sendKeys("Akihabara");
		} catch (Throwable e) {
			System.out.println("Failed to input location city");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationStateDropDown(wd).sendKeys("VA");
			// Iframe becomes *unhidden* when closing the form window
		} catch (Throwable e) {
			System.out.println("Failed to type state VA into state drop down list");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.locationForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
			return false;
		}
		return true;
	}

	@Then("^I should see the success message$")
	public static boolean SuccessMessageAppeared(WebDriver wd) {
		try {
			 Thread.sleep(1000);
			 System.out.println(
			 "!!!!!!!!!!!!!!!!!!!!! CONFIRMATION MESSAGE: " +
			 LocationsVP.findConfirmationMessage(wd).getText());
			if (LocationsVP.findConfirmationMessage(wd).getText().contains("Failed")) {
				return false;
			} else {
				System.out.println("Failed message did not appear; Success!");
				return true;
			}
		} catch (Throwable e) {
			System.out.println("Something went wrong; failed to find any confirmation message");
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * if (LocationsVP.findIframe(wd).getAttribute("aria-hidden").equals("false")) {
	 * return true; } else { System.out.
	 * println("IFRAME IS HIDDEN (Form is still visible and may not have submit)");
	 * return false; }
	 */
	@When("^TEMPLATE2$")
	public static void aa(WebDriver wd) throws Throwable {

	}

	@Then("^TEMPLATE3$")
	public static void aaa(WebDriver wd) throws Throwable {

	}

	@Given("^Click the Add Location button VP$")
	public static void AddLocation(WebDriver wd) {

	}

	@Then("^I should see the new Location VP$")
	public static void NewLocationExists(WebDriver wd) throws Throwable {

	}

	@Given("^Click a Check Box next to a Location$")
	public static boolean ClickLocationCheckBox(WebDriver wd) {
		try {
			LocationsVP.findLocationCheckBox(wd).click();
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@When("^Click the Add Building button VP$")
	public static boolean AddBuilding(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findAddBuildingButton(wd).click();
			return true;
		} catch (Throwable e) {
			System.out.println("Failed to find Add Building Button");
			return false;
		}
	}

	@When("^Fill out Building form and submit VP$")
	public static boolean FillAndSubmitBuildingForm(WebDriver wd) throws Throwable {
		try {
			Thread.sleep(1000);
			LocationsVP.findBuildingNameField(wd).sendKeys("Britannia" + iteration);
		} catch (Throwable e) {
			System.out.println("Failed to input building name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.buildingForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}

	@When("^Fill out Building form with an old deleted name and submit$")
	public static boolean FillAndSubmitBuildingFormWithOldName(WebDriver wd) throws Throwable {
		try {
			Thread.sleep(1000);
			LocationsVP.findBuildingNameField(wd).sendKeys("Britannia");
		} catch (Throwable e) {
			System.out.println("Failed to input building name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.buildingForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}

	@Given("^And Click a Check Box next to a Building$")
	public static boolean ClickBuildingCheckBox(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findBuildingCheckBox(wd).click();
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@When("^Click the Add Room button VP$")
	public static boolean AddRoom(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findAddRoomButton(wd).click();
			return true;
		} catch (Throwable e) {
			System.out.println("Failed to find Add Room Button");
			return false;
		}
	}

	@When("^Fill out Room form and submit VP$")
	public static boolean FillAndSubmitRoomForm(WebDriver wd) throws Throwable {
		try {
			Thread.sleep(1000);
			LocationsVP.findRoomNameField(wd).sendKeys("Room" + iteration);
		} catch (Throwable e) {
			System.out.println("Failed to input Room name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.roomForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}

	@When("^Fill out Room form with an old deleted name and submit$")
	public static boolean FillAndSubmitRoomFormWithOldName(WebDriver wd) throws Throwable {
		try {
			Thread.sleep(1000);
			LocationsVP.findRoomNameField(wd).sendKeys("Room1");
		} catch (Throwable e) {
			System.out.println("Failed to input Room name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.roomForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}

	@When("^Click the Edit button$")
	public static boolean clickEdit(WebDriver wd) {
		try {
			LocationsVP.findEditButton(wd).click();
			return true;
		} catch (Throwable e) {
			System.out.println("Failed to find Edit Button");
			return false;
		}
	}

	@When("^Fill out Location form with new name, city, state, and submit$")
	public static boolean FillAndSubmitEditLocationForm(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationNameField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findLocationNameField(wd).sendKeys("Future Gadget Lab" + 10000 + iteration);
		} catch (Throwable e) {
			System.out.println("Failed to update location name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationCityField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findLocationCityField(wd).sendKeys("London");
		} catch (Throwable e) {
			System.out.println("Failed to update location city");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationStateDropDown(wd).sendKeys("CA");
		} catch (Throwable e) {
			System.out.println("Failed to update state VA into state drop down list");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.locationForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}
	
	@When("^Fill out Location form with old deleted name, city, state, and submit$")
	public static boolean FillAndSubmitEditLocationFormWithOldName(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationNameField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findLocationNameField(wd).sendKeys("Future Gadget Lab");
		} catch (Throwable e) {
			System.out.println("Failed to update location name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationCityField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findLocationCityField(wd).sendKeys("London");
		} catch (Throwable e) {
			System.out.println("Failed to update location city");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationStateDropDown(wd).sendKeys("CA");
		} catch (Throwable e) {
			System.out.println("Failed to update state VA into state drop down list");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.locationForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}
	
	@When("^Fill out Location form with previous edited name, city, state, and submit$")
	public static boolean FillAndSubmitEditLocationFormWithOriginalEditedName(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationNameField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findLocationNameField(wd).sendKeys("Future Gadget Lab" + 10000 + iteration);
		} catch (Throwable e) {
			System.out.println("Failed to update location name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationCityField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findLocationCityField(wd).sendKeys("London");
		} catch (Throwable e) {
			System.out.println("Failed to update location city");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.findLocationStateDropDown(wd).sendKeys("CA");
		} catch (Throwable e) {
			System.out.println("Failed to update state VA into state drop down list");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.locationForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}
	
	
	
	
	
	
	@When("^Fill out Building form with new name and submit$")
	public static boolean FillAndSubmitEditBuildingForm(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findBuildingNameField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findBuildingNameField(wd).sendKeys("Britannia" + 10000 + iteration);
		} catch (Throwable e) {
			System.out.println("Failed to update building name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.buildingForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}
	
	@When("^Fill out Building form with old deleted name and submit$")
	public static boolean FillAndSubmitEditBuildingFormWithOldName(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findBuildingNameField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findBuildingNameField(wd).sendKeys("Britannia");
		} catch (Throwable e) {
			System.out.println("Failed to update building name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.buildingForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}
	
	@When("^Fill out Building form with previous edited name and submit$")
	public static boolean FillAndSubmitEditBuildingFormWithOriginalEditedName(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findBuildingNameField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findBuildingNameField(wd).sendKeys("Future Gadget Lab" + 10000 + iteration);
		} catch (Throwable e) {
			System.out.println("Failed to update building name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.buildingForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}

	
	
	
	
	@When("^Click the first building drop down to expand$")
	public static boolean ExpandFirstBuildingDropDown(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findFirstBuilding(wd).click();
			return true;
		} catch (Throwable e) {
			System.out.println("Failed to expand first building drop down");
			return false;
		}
	}
	
	@When("^Click a Check Box next to a Room$")
	public static boolean ClickRoomCheckBox(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findRoomCheckBox(wd).click();
			return true;
		} catch (Throwable e) {
			System.out.println("Failed to click room check box");
			return false;
		}
	}
	
	@When("^Fill out Room form with new name and submit$")
	public static boolean FillAndSubmitEditRoomForm(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findRoomNameField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findRoomNameField(wd).sendKeys("Room" + 10000 + iteration);
		} catch (Throwable e) {
			System.out.println("Failed to update room name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.roomForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}
	
	@When("^Fill out Room form with old deleted name and submit$")
	public static boolean FillAndSubmitEditRoomFormWithOldName(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findRoomNameField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findRoomNameField(wd).sendKeys("Room1");
		} catch (Throwable e) {
			System.out.println("Failed to update room name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.roomForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}
	
	@When("^Fill out Room form with previous edited name and submit$")
	public static boolean FillAndSubmitEditRoomFormWithOriginalEditedName(WebDriver wd) {
		try {
			Thread.sleep(1000);
			LocationsVP.findRoomNameField(wd).clear();
			Thread.sleep(1000);
			LocationsVP.findRoomNameField(wd).sendKeys("Room" + 10000 + iteration);
		} catch (Throwable e) {
			System.out.println("Failed to update room name");
			return false;
		}
		try {
			Thread.sleep(1000);
			LocationsVP.roomForm(wd).submit();
		} catch (Throwable e) {
			System.out.println("Failed to save form");
		}
		return true;
	}
	
	@When("^Click the Delete button$")
	public static boolean ClickDelete(WebDriver wd) {
		try {
			Thread.sleep(1500);
			LocationsVP.findDeleteButton(wd).click();
			return true;
		} catch (Throwable e) {
			System.out.println("Failed to find Delete Button");
			return false;
		}
	}
	
	@When("^Submit the Delete$")
	public static boolean ConfirmDelete(WebDriver wd) {
		try {
			Thread.sleep(1500);
			LocationsVP.confirmDelete(wd).click();
			return true;
		} catch (Throwable e) {
			System.out.println("Failed to confirm Delete");
			return false;
		}
	}

}

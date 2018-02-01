package com.revature.tests.vp;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.LocationsCukes;
import com.revature.cukes.vp.LocationsCukesVP;
import com.revature.tests.trainer.TestLocations;
import com.revature.util.LoginUtil;

public class TestLocationsVP extends VPSuite {
	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Locations Tab Test");
		try {
			LocationsCukes.clickedLocations(wd);
		} catch (Throwable e) {
			fail("Currently not in Locations Tab; Locations Tab not found or could not be clicked");
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void TestLocationsTabVP() {
		try {
			LocationsCukes.RevatureHQExists(wd);
		} catch (Throwable e) {
			fail("Revature HQ drop down not found");
			e.printStackTrace();
		}
		try {
			LocationsCukes.NewYorkCityExists(wd);
		} catch (Throwable e) {
			fail("NewYorkCity drop down not found");
			e.printStackTrace();
		}
	}

	// Profile iterate notes
	// 2 lists
	// tagname (md-card or md-list)
	// findElements.Byname md list or md card
	@Test(priority = 2)
	public void TestAddLocation() {
		try {
			assertTrue(LocationsCukesVP.clickAddLocation(wd));
		} catch (Throwable e) {
			fail("Could not click Add Location button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitLocationForm(wd));
		} catch (Throwable e) {
			fail("Could not fill out Location form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message");
			e.printStackTrace();
		}

		// LocationsCukesVP.NewLocationExists(wd);
	}
	
	
	@Test(priority = 3)
	//This will fail and expose bug
	public void TestAddLocationWithOldName() {
		try {
			assertTrue(LocationsCukesVP.clickAddLocation(wd));
		} catch (Throwable e) {
			fail("Could not click Add Location button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitLocationFormWithOldName(wd));
		} catch (Throwable e) {
			fail("Could not fill out Location form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message.  BUG FOUND! Could not use an existing or deleted name");
			e.printStackTrace();
		}

		// LocationsCukesVP.NewLocationExists(wd);
	}

	@Test(priority = 4)
	public void TestAddBuilding() {
		try {
			assertTrue(LocationsCukesVP.ClickLocationCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click location checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.AddBuilding(wd));
		} catch (Throwable e) {
			fail("Could not click Add Building button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitBuildingForm(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit Building form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message");
			e.printStackTrace();
		}
		// LocationsCukesVP.NewLocationExists(wd);
	}

	@Test(priority = 5)
	//This will fail and expose bug
	public void TestAddBuildingWithOldName() {
		try {
			assertTrue(LocationsCukesVP.ClickLocationCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click location checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.AddBuilding(wd));
		} catch (Throwable e) {
			fail("Could not click Add Building button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitBuildingFormWithOldName(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit Building form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message.  BUG FOUND! Could not use an existing or deleted name");
			e.printStackTrace();
		}
		// LocationsCukesVP.NewLocationExists(wd);
	}
	
	@Test(priority = 6)
	public void TestAddRoom() {
		try {
			assertTrue(LocationsCukesVP.ClickLocationCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not unclick location checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ClickBuildingCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click building checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.AddRoom(wd));
		} catch (Throwable e) {
			fail("Could not click Add Room button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitRoomForm(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit Room form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message");
			e.printStackTrace();
		}
		// LocationsCukesVP.NewLocationExists(wd);
	}
	
	@Test(priority = 6)
	//this will not fail
	public void TestAddRoomWithOldName() {
		try {
			assertTrue(LocationsCukesVP.ClickBuildingCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click building checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.AddRoom(wd));
		} catch (Throwable e) {
			fail("Could not click Add Room button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitRoomFormWithOldName(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit Room form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message");
			e.printStackTrace();
		}
	}
	
	@Test(priority = 7)
	//this will pass
	public void TestEditLocation() {
		try {
			assertTrue(LocationsCukesVP.ClickLocationCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click location checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.clickEdit(wd));
		} catch (Throwable e) {
			fail("Could not click Edit button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitEditLocationForm(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit edit form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message");
			e.printStackTrace();
		}
	}

	
	@Test(priority = 8)
	//this will fail
	public void TestEditLocationWithOldName() {
		try {
			assertTrue(LocationsCukesVP.ClickLocationCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click location checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.clickEdit(wd));
		} catch (Throwable e) {
			fail("Could not click Edit button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitEditLocationFormWithOldName(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit edit form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message.  BUG FOUND! Could not use an existing or deleted name");
			e.printStackTrace();
		}
	}
	
	@Test(priority = 9)
	//this will pass
	public void TestEditLocationWithOriginalEditedName() {
		try {
			assertTrue(LocationsCukesVP.clickEdit(wd));
		} catch (Throwable e) {
			fail("Could not click Edit button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitEditLocationFormWithOriginalEditedName(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit edit form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message");
			e.printStackTrace();
		}
	}
	
	@Test(priority = 10)
	//this will pass
	public void TestEditBuilding() {
		try {
			assertTrue(LocationsCukesVP.ClickBuildingCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click building checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.clickEdit(wd));
		} catch (Throwable e) {
			fail("Could not click Edit button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitEditBuildingForm(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit edit form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message");
			e.printStackTrace();
		}
	}

	
	@Test(priority = 11)
	//this will fail
	public void TestEditBuildingWithOldName() {
		try {
			assertTrue(LocationsCukesVP.ClickBuildingCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click building checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.clickEdit(wd));
		} catch (Throwable e) {
			fail("Could not click Edit button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitEditBuildingFormWithOldName(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit edit form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message. BUG FOUND! Could not use an existing or deleted name");
			e.printStackTrace();
		}
	}
	
	@Test(priority = 12)
	//this will pass
	public void TestEditBuildingWithOriginalEditedName() {
		try {
			assertTrue(LocationsCukesVP.clickEdit(wd));
		} catch (Throwable e) {
			fail("Could not click Edit button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitEditBuildingFormWithOriginalEditedName(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit edit form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message");
			e.printStackTrace();
		}
	}
	
	
	
	
	
	@Test(priority = 13)
	//this will pass
	public void TestEditRoom() {
		try {
			assertTrue(LocationsCukesVP.ExpandFirstBuildingDropDown(wd));
		} catch (Throwable e) {
			fail("Could not expand building drop down");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ClickRoomCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click room checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.clickEdit(wd));
		} catch (Throwable e) {
			fail("Could not click Edit button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitEditRoomForm(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit edit form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message");
			e.printStackTrace();
		}
	}

	
	@Test(priority = 14)
	//this will pass
	public void TestEditRoomWithOldName() {
		try {
			assertTrue(LocationsCukesVP.ExpandFirstBuildingDropDown(wd));
		} catch (Throwable e) {
			fail("Could not expand building drop down");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ClickRoomCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click room checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.clickEdit(wd));
		} catch (Throwable e) {
			fail("Could not click Edit button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitEditRoomFormWithOldName(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit edit form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message.");
			e.printStackTrace();
		}
	}
	
	@Test(priority = 15)
	//this will pass
	public void TestEditRoomWithOriginalEditedName() {
		try {
			assertTrue(LocationsCukesVP.ExpandFirstBuildingDropDown(wd));
		} catch (Throwable e) {
			fail("Could not expand building drop down");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ClickRoomCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click room checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.clickEdit(wd));
		} catch (Throwable e) {
			fail("Could not click Edit button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.FillAndSubmitEditRoomFormWithOriginalEditedName(wd));
		} catch (Throwable e) {
			fail("Could not fill and submit edit form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message");
			e.printStackTrace();
		}
	}
	
	@Test(priority = 16)
	//this will pass
	public void TestDeleteRoom() {
		try {
			assertTrue(LocationsCukesVP.ExpandFirstBuildingDropDown(wd));
		} catch (Throwable e) {
			fail("Could not expand building drop down");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ClickRoomCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click room checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ClickDelete(wd));
		} catch (Throwable e) {
			fail("Could not click Delete button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ConfirmDelete(wd));
		} catch (Throwable e) {
			fail("Could not confirm/submit Delete form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message.");
			e.printStackTrace();
		}
	}
	
	@Test(priority = 17)
	//this will pass
	public void TestDeleteBuilding() {
		try {
			assertTrue(LocationsCukesVP.ClickBuildingCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click building checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ClickDelete(wd));
		} catch (Throwable e) {
			fail("Could not click Delete button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ConfirmDelete(wd));
		} catch (Throwable e) {
			fail("Could not confirm/submit Delete form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message.");
			e.printStackTrace();
		}
	}
	
	@Test(priority = 18)
	//this will pass
	public void TestDeleteLocation() {
		try {
			assertTrue(LocationsCukesVP.ClickLocationCheckBox(wd));
		} catch (Throwable e) {
			fail("Could not click location checkbox");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ClickDelete(wd));
		} catch (Throwable e) {
			fail("Could not click Delete button");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.ConfirmDelete(wd));
		} catch (Throwable e) {
			fail("Could not confirm/submit Delete form");
			e.printStackTrace();
		}
		try {
			assertTrue(LocationsCukesVP.SuccessMessageAppeared(wd));
		} catch (Throwable e) {
			fail("Could not find success message.");
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("============ Location VP Tests finished ===============");
	}
}

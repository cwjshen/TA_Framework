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
			Thread.sleep(6000);
			LocationsCukes.clickedLocations(wd);
		} catch (Throwable e) {
			fail("Currently not in Locations Tab; Locations Tab not found or could not be clicked");
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void TestLocationsTabVP() {
		try {
			Thread.sleep(2000);
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
		assertTrue(LocationsCukesVP.clickAddLocation(wd));
		//assertTrue(LocationsCukesVP.FillAndSubmitLocationForm(wd));
		//LocationsCukesVP.NewLocationExists(wd);
	}

	@AfterTest
	public void afterTest() {
		System.out.println("============ Location VP Tests finished ===============");
	}
}

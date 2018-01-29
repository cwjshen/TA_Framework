package com.revature.tests.trainer;

import static org.testng.Assert.fail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.LocationsCukes;

public class TestLocations extends TrainerSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Locations Tab Test");

	}

	@Test(priority = 1)
	public void TestLocationsTab() {
		try {
			Thread.sleep(6000);
			assert (LocationsCukes.startingInOverview(wd));
		} catch (Throwable e) {
			fail("Test did not start in Overview Tab");
			e.printStackTrace();
		}
		try {
			LocationsCukes.clickLocations(wd);
		} catch (Throwable e) {
			fail("Locations Tab not found or could not be clicked");
			e.printStackTrace();
		}
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

	@Test(priority = 2)
	public void TestCloseDropDowns() {
		try {
			Thread.sleep(7000);
			assert (LocationsCukes.inLocationsTab(wd));
		} catch (Throwable e) {
			fail("Test did not start in Locations Tab");
			e.printStackTrace();
		}
		try {
			assert (LocationsCukes.LocationsInitiallyExpanded(wd));
		} catch (Throwable e) {
			fail("RevatureHQ and New York City not initally expanded");
			e.printStackTrace();
		}
		try {
			LocationsCukes.closeDropDowns(wd);
		} catch (Throwable e) {
			fail("Failed to close drop downs");
			e.printStackTrace();
		}
		try {
			LocationsCukes.LocationsNowHidden(wd);
		} catch (Throwable e) {
			fail("RevatureHQ and New York City not initally expanded");
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void TestExpandDropDowns() {
		try {
			assert (LocationsCukes.inLocationsTab(wd));
		} catch (Throwable e) {
			fail("Test did not start in Locations Tab");
			e.printStackTrace();
		}
		try {
			assert (LocationsCukes.LocationsInitiallyHidden(wd));
		} catch (Throwable e) {
			fail("RevatureHQ and New York City not initally hidden");
			e.printStackTrace();
		}
		try {
			LocationsCukes.expandDropDowns(wd);
		} catch (Throwable e) {
			fail("Failed to close drop downs");
			e.printStackTrace();
		}
		try {
			LocationsCukes.LocationsNowExpanded(wd);
		} catch (Throwable e) {
			fail("RevatureHQ and New York City not initally expanded");
			e.printStackTrace();
		}
	}

	@AfterTest
	public void afterTest() {
		System.out.println("============ Location Tests finished ===============");
	}

}

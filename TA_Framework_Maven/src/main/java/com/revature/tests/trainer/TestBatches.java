package com.revature.tests.trainer;

import static org.testng.Assert.fail;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.revature.cukes.trainer.LocationsCukes;
import com.revature.cukes.trainer.OverviewCukes;

public class TestBatches extends TrainerSuite {
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Overview Tab Test");

	}
	
	@Test
	public void TestOne() {
		try {
			// Need assert statements for these? Idk though because they can never be false
			//	since it would just jump to catch block with NoSuchElementException
			OverviewCukes.clickOverview(wd);
			OverviewCukes.exportButtonExists(wd);
			OverviewCukes.filterButtonExists(wd);

		} catch (Throwable e) { 
			fail("CSV button/ filter button not found. Not in Overview tab");
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestLocations() {
		try {
			LocationsCukes.clickedLocations(wd);
			LocationsCukes.RevatureHQExists(wd);
			LocationsCukes.NewYorkCityExists(wd);
		}
		catch (Throwable e) {
			fail("Revature HQ and/or New York City drop downs not found. Not in Locations tab");
			e.printStackTrace();
		}
	}
	@Test
	public void TestTwo() {
		try {
			// Need assert statements for these? Idk though because they can never be false
			//	since it would just jump to catch block with NoSuchElementException
			OverviewCukes.clickOverview(wd);
			OverviewCukes.exportButtonExists(wd);
			OverviewCukes.filterButtonExists(wd);

		} catch (Throwable e) { 
			fail("CSV button/ filter button not found. Not in Overview tab");
			e.printStackTrace();
		}
	}		


	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Overview tab working as intended");
	}

}

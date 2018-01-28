package com.revature.tests.trainer;


import static org.testng.Assert.fail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.LocationsCukes;

public class TestLocations extends TrainerSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Overview Tab Test");

	}
	
	@Test
	public void TestOne() {
		try {
			// Need assert statements for these? Idk though because they can never be false
			//	since it would just jump to catch block with NoSuchElementException
			LocationsCukes.clickLocations(wd);
			LocationsCukes.RevatureHQExists(wd);
			LocationsCukes.NewYorkCityExists(wd);
			
		} catch (Throwable e) { 
			fail("Revature HQ and/or New York City drop downs not found. Not in Locations tab");
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Locations tab working as intended");
	}

}


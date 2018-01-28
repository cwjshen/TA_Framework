package com.revature.tests.trainer;



import static org.junit.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.LocationsCukes;
import com.revature.util.JSClicker;

public class TestLocations extends TrainerSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Overview Tab Test");

	}
	
	@Test
	public void TestOne() {
		try {
			LocationsCukes.clickLocations(wd);
			System.out.println("Entering locations tab...");
			Thread.sleep(500);
			assertTrue(LocationsCukes.RevatureHQExists(wd));
			System.out.println("HQ Exists");
			assertTrue(LocationsCukes.NewYorkCityExists(wd));
			System.out.println("NYC Location Exists");
			
			
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


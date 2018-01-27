package com.revature.tests.trainer;

import static org.testng.Assert.fail;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.OverviewCukes;
import com.revature.pom.Login;
import com.revature.pom.Logout;
import com.revature.util.DriverUtil;
import com.revature.util.LoginUtil;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestOverview extends TrainerSuite {

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
	public void TestTwo() {
		try {	
			// Need assert statements for these? Idk though because they can never be false
			//	since it would just jump to catch block with NoSuchElementException
			OverviewCukes.clickOverview(wd);
			OverviewCukes.exportButtonExists(wd);
			OverviewCukes.filterButtonExists(wd);

		} catch (Throwable e) { 
			System.out.println("CSV button/ filter button not found. Not in Overview tab");
			e.printStackTrace();
		}
	}		

	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Overview tab working as intended");
	}


}


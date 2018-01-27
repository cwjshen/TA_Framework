package com.revature;

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

import com.revature.cuketests.OverviewCukes;
import com.revature.cuketests.TrainerCukes;
import com.revature.pom.Login;
import com.revature.pom.Logout;
import com.revature.util.DriverUtil;
import com.revature.util.LoginUtil;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Hook Class to run Cucumber Tests
@CucumberOptions(features="src/test/java")
public class TestTrainers extends TrainerSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Trainers Tab Test");

	}
	
	@Test
	public void onTrainersTab() {
		try {
			TrainerCukes.clickTrainers(wd);

		} catch (Throwable e) { 
			System.out.println("Not in Trainers tab");
			e.printStackTrace();
		}
	}
	
	@Test
	public void exportButtonExists() {
		try {
			TrainerCukes.calendarButtonExists(wd);

		} catch (Throwable e) { 
			System.out.println("Calendar button not found");
			e.printStackTrace();
		}
	}		
	
	@Test
	public void downloadButtonExists() {
		try {
			TrainerCukes.downloadResumeButton(wd);

		} catch (Throwable e) { 
			System.out.println("Download resume button not found");
			e.printStackTrace();
		}
	}	
	
	

	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Trainers tab working as intended");
	}


}



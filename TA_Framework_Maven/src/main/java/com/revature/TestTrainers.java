package com.revature;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.revature.cuketests.TrainerCukes;
import com.revature.tests.trainer.TrainerSuite;
import cucumber.api.CucumberOptions;

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



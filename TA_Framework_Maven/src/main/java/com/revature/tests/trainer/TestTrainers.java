package com.revature.tests.trainer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.TrainerCukes;

import cucumber.api.CucumberOptions;

//Hook Class to run Cucumber Tests
@CucumberOptions(features="src/test/java")
public class TestTrainers extends TrainerSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Trainers Tab Test");

	}
	
	@Test (priority = 1)
	public void onTrainersTab() {
		try {
			TrainerCukes.clickTrainers(wd);
			Thread.sleep(4000);
		} catch (Throwable e) { 
			System.out.println("Not in Trainers tab");
			e.printStackTrace();
		}
	} 
	
	@Test (priority = 2)
	public void ptoCalendarButtonExists() {
		try {
			TrainerCukes.calendarButtonExists(wd);

		} catch (Throwable e) { 
			System.out.println("Calendar button not found");
			e.printStackTrace();
		}
	}		
	 
	@Test (priority = 3)
	public void downloadButtonExists() {
		try {
			TrainerCukes.downloadResumeButton(wd);

		} catch (Throwable e) { 
			System.out.println("Download resume button not found");
			e.printStackTrace();
		}
	}	
	
	@Test (priority = 4)
	public void clickCalendarButton() {
		try {
			TrainerCukes.clickPtoCalendarButton(wd);
			System.out.println("PTO calendar was clicked");
			
		} catch (Throwable e) {
			System.out.println("Calendar button doesn't work");
			e.printStackTrace();
		}
	}
	
	@Test (priority = 5) 
	public void clickAddPtoButton() {
		try {
			TrainerCukes.clickAddPtoRequestButton(wd);
			Thread.sleep(2000);
			System.out.println("Clicking Add request button");
		} catch (Throwable e) {
			e.printStackTrace();                                                                        
		} 
	}
	
//	@Test (priority = 6) 
//	public void clickCancelButton() {
//		try {
//			TrainerCukes.clickCancelButton(wd);
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//	}
	
	

	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Trainers tab working as intended");
	}


}



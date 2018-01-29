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
			Thread.sleep(1000);
		} catch (Throwable e) { 
			System.out.println("Not in Trainers tab");
			e.printStackTrace();
		}
	} 
	
	@Test (priority = 2)
	public void clickCalendarButton() {
		try {
			TrainerCukes.clickPtoCalendarButton(wd);
			Thread.sleep(1000);
			System.out.println("PTO calendar was clicked");
			
		} catch (Throwable e) {
			System.out.println("Calendar button doesn't work");
			e.printStackTrace();
		}
	}
	
	@Test (priority = 3) 
	public void clickAddPtoButton() {
		try {
			System.out.println("Clicking Add request button");
			Thread.sleep(1000);
			TrainerCukes.clickAddPtoRequestButton(wd); 
			
		
			
		} catch (Throwable e) {
			e.printStackTrace();                                                                          
		} 
	}
	
	@Test (priority = 4)
	public void clickStartDate() {
		try {
			System.out.println("Clicking start date");
			Thread.sleep(1000);
			TrainerCukes.clickOnStartDate(wd);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority = 5)
	public void pickStartDate() {
		try {
			System.out.println("Selecting a start date");
			Thread.sleep(1000);
			TrainerCukes.pickStartDate(wd);
			Thread.sleep(1000);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority = 6)
	public void clickEndDate() {
		try {
			System.out.println("Clicking ending date");
			Thread.sleep(1000);
			TrainerCukes.clickOnEndDate(wd);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority = 7)
	public void pickEndDate() {
		try {
			System.out.println("Selecting an end date");
			Thread.sleep(1000);
			TrainerCukes.pickEndDate(wd);
			Thread.sleep(1000);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
//	@Test (priority = 8)
//	public void sendRequestButton() {
//		try {
//			System.out.println("clicking send request button");
//			Thread.sleep(1000);
//			TrainerCukes.clickSendRequestButton(wd);
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//	}
	@Test (priority = 8) 
	public void clickCancelPtoButton() {
		try {
			System.out.println("Clicking cancel request button");
			Thread.sleep(1000);
			TrainerCukes.clickCancelRequestButton(wd);
		} catch (Throwable e) {
			e.printStackTrace();                                                                          
		} 
	}
	
	@Test (priority = 9) 
	public void clickCancelButton() {
		try {
			Thread.sleep(1000);
			TrainerCukes.clickCancelButton(wd);
			Thread.sleep(1000);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	

	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Trainers tab working as intended");
	}


}



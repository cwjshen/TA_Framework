package com.revature.tests.trainer;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.TrainerCukes;

import cucumber.api.CucumberOptions;

//Hook Class to run Cucumber Tests
@CucumberOptions(features = "src/test/java")
public class TestTrainers extends TrainerSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Trainers Tab Test");

	}

	@Test(priority = 1)
	public void onTrainersTab() { 
		assertTrue(TrainerCukes.clickTrainers(wd));
	}

	@Test(priority = 2)
	public void clickCalendarButton() {
		assertTrue(TrainerCukes.clickPtoCalendarButton(wd));
	}

	@Test(priority = 3)
	public void clickAddPtoButton() {
		assertTrue(TrainerCukes.clickAddPtoRequestButton(wd));
	}

	@Test(priority = 4)
	public void clickStartDate() {
		assertTrue(TrainerCukes.clickOnStartDate(wd));
	}

	@Test(priority = 5)
	public void pickStartDate() {
		assertTrue(TrainerCukes.pickStartDate(wd));
	}

	@Test(priority = 6)
	public void clickEndDate() {
		assertTrue(TrainerCukes.clickOnEndDate(wd));
	}

	@Test(priority = 7)
	public void pickEndDate() {
		assertTrue(TrainerCukes.pickEndDate(wd));
	}

	@Test(priority = 8)
	public void sendRequestButton() {
		assertTrue(TrainerCukes.clickSendRequestButton(wd));
	}

	@Test(priority = 9)
	public void clickCancelPtoButton() {
		assertTrue(TrainerCukes.clickCancelRequestButton(wd));
	}

	@Test(priority = 10)
	public void clickCancelButton() {
		assertTrue(TrainerCukes.clickCancelButton(wd));
	}

	@Test(priority = 11)
	public void clickDownloadResumeButton() {
		assertTrue(TrainerCukes.clickOnDownloadResumeButton(wd));
	}

	@Test(priority = 12)
	public void clickTrainer() {
		assertTrue(TrainerCukes.clickOnTrainer(wd));
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Trainers tab working as intended");
	}

}

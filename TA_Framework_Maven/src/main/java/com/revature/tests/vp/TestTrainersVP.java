package com.revature.tests.vp;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.vp.TrainersCukesVP;

import cucumber.api.CucumberOptions;

//Hook Class to run Cucumber Tests
@CucumberOptions(features = "src/test/resources")
public class TestTrainersVP extends VPSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Trainers Tab VP Test");
	}

	@Test(priority = 1)
	public void onTrainersTabVP() {
		assertTrue(TrainersCukesVP.i_click_the_Trainers_tab(wd));
	}

	@Test(priority = 2)
	public void clickAddTrainerButton() {
		assertTrue(TrainersCukesVP.add_Trainer_button(wd));
	}

	@Test(priority = 3)
	public void clickFirstNamebox() {
		assertTrue(TrainersCukesVP.i_click_on_the_first_name_text_box(wd));
	}

	@Test(priority = 4)
	public void clickLastNamebox() {
		assertTrue(TrainersCukesVP.i_click_on_the_last_name_text_box(wd));
	}

	@Test(priority = 5)
	public void clickSend() { 
		assertTrue(TrainersCukesVP.i_click_on_the_save_button(wd));
	}
	
//	@Test(priority = 6)
//	public void clickCancelNewTrainerButton() {
//		assertTrue(TrainersCukesVP.i_click_the_cancel_button(wd));
//	}
	
	@Test(priority = 7)
	public void clickDownloadResumeButton() {
		assertTrue(TrainersCukesVP.i_click_on_the_download_resume_button_on_a_given_trainer(wd));
	}
	
	@Test(priority = 8)
	public void clickDeactivateTrainerButton() {
		assertTrue(TrainersCukesVP.click_the_deactivate_trainer_button(wd));
	}
	
	@Test(priority = 9)
	public void clickReactivateTrainerButton() {
		assertTrue(TrainersCukesVP.click_the_reactivate_trainer_button(wd));
	}
	
	@Test(priority = 10)
	public void clickTrainer() {
		assertTrue(TrainersCukesVP.i_click_on_a_trainer(wd));
	}
	
	@Test(priority = 11)
	public void clickPtoCalendar() {
		assertTrue(TrainersCukesVP.click_the_View_PTO_Calendar_button(wd));
	}
	
	@Test(priority = 12)
	public void clickNewPtoRequestButton() {
		assertTrue(TrainersCukesVP.i_click_the_new_PTO_request_button(wd));
	}
	
	@Test(priority = 13)
	public void clickStartDate() {
		assertTrue(TrainersCukesVP.i_click_the_start_date_text_box(wd));
	}
	
	@Test(priority = 14)
	public void selectStartDate() {
		assertTrue(TrainersCukesVP.a_drop_down_calendar_should_appear_which_allows_me_to_select_a_date(wd));
	}
	
	@Test(priority = 15)
	public void clickEndDate() {
		assertTrue(TrainersCukesVP.i_click_the_end_date_text_box(wd));
	}
	
	@Test(priority = 16)
	public void clickCancelNewPtoButton() {
		assertTrue(TrainersCukesVP.i_click_the_cancel_PTO_request_button(wd));
	}
	
	@Test(priority = 17)
	public void clickCancelCalendarButton() {
		assertTrue(TrainersCukesVP.i_click_the_cancel_PTO_calendar_button(wd));
	}
	
	@Test(priority = 18)
	public void submitPtoRequest() {
		assertTrue(TrainersCukesVP.i_click_the_send(wd));
	}
}

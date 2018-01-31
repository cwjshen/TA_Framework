package com.revature.cukes.vp;

import org.openqa.selenium.WebDriver;

import com.revature.pom.NavBar;
import com.revature.pom.TrainersTab;
import com.revature.pom.vp.TrainersVP;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrainersCukesVP {

	@When("^I click the Trainers tab <webdriver>$")
	public static boolean i_click_the_Trainers_tab(WebDriver wd) {
		try {
			Thread.sleep(2000);
			NavBar.navigateToTrainersPage(wd).click();
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

	}

	@Then("^I should see the View PTO Calendar button<webdriver>$")
	public void i_should_see_the_View_PTO_Calendar_button(WebDriver wd) throws Throwable {
		TrainersVP.findCalendarButtonVP(wd);
	}

	@Then("^Add Trainer button <webdriver>$")
	public static boolean add_Trainer_button(WebDriver wd) {
		try {
			TrainersVP.clickAddTrainerButtonVP(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@When("^I click on the first name text box$")
	public static boolean i_click_on_the_first_name_text_box(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersVP.clickFirstNameBoxVP(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@Then("^I should be able to enter text into the text box <webdriver>$")
	public void i_should_be_able_to_enter_text_into_the_text_box_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click on the last name text box$")
	public static boolean i_click_on_the_last_name_text_box(WebDriver wd) {
		try {
			TrainersVP.clickLastNameBoxVP(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@Given("^That there is text in the first and last name text boxes <webdriver>$")
	public void that_there_is_text_in_the_first_and_last_name_text_boxes_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click on the save button <webdriver>$")
	public static boolean i_click_on_the_save_button(WebDriver wd) {
		try {
			TrainersVP.clickSaveNewTrainerButtonVP(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@Then("^A new trainer with the entered first and last names should appear under Inactive trainers <webdriver>$")
	public void a_new_trainer_with_the_entered_first_and_last_names_should_appear_under_Inactive_trainers_webdriver()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^that the add trainers popup window is showing <webdriver>$")
	public void that_the_add_trainers_popup_window_is_showing_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click the cancel button <webdriver>$")
	public static boolean i_click_the_cancel_button(WebDriver wd) {
		try {
			TrainersVP.clickCancelNewTrainerButtonVP(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@Then("^The add trainers window should close <webdriver>$")
	public void the_add_trainers_wndow_should_close_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see the Trainers tab	<webdriver>$")
	public void i_should_see_the_Trainers_tab_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click on the download resume button on a given trainer <webdriver>$")
	public static boolean i_click_on_the_download_resume_button_on_a_given_trainer(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersVP.clickDownloadButtonVP(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@Then("^the download should start<webdriver>$")
	public void the_download_should_start_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see the file in the download location <webdriver>$")
	public void i_should_see_the_file_in_the_download_location_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^Click the deactivate trainer button <webdriver>$")
	public static boolean click_the_deactivate_trainer_button(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersVP.clickDeactivateTrainerVP(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@Then("^The deactivated trainer should not appear under trainers <webdriver>$")
	public void the_deactivated_trainer_should_not_appear_under_trainers_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^The deactivated trainer should appear under inactive trainers <webdriver>$")
	public void the_deactivated_trainer_should_appear_under_inactive_trainers_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^Click the reactivate trainer button <webdriver>$")
	public static boolean click_the_reactivate_trainer_button(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersVP.clickReactivateTrainerVP(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@Then("^The reactivated trainer should appear under trainers <webdriver>$")
	public void the_reactivated_trainer_should_appear_under_trainers_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^The reactivated trainer should not appear under inactive trainers <webdriver>$")
	public void the_reactivated_trainer_should_not_appear_under_inactive_trainers_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click on a trainer <webdriver>$")
	public static boolean i_click_on_a_trainer(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersVP.clickTrainerVP(wd);
			Thread.sleep(1000);
			wd.navigate().back();
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}
		
	@Then("^I should see that trainers profile page<webdriver>$")
	public void i_should_see_that_trainers_profile_page_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^Click the View PTO Calendar button <webdriver>$")
	public static boolean click_the_View_PTO_Calendar_button(WebDriver wd) {
		try {
			TrainersVP.findCalendarButtonVP(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

	}

	@Then("^I should see the PTO Calendar<webdriver>$")
	public void i_should_see_the_PTO_Calendar_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^that the PTO calendar is open <webdriver>$")
	public void that_the_PTO_calendar_is_open_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click the new PTO request button <webdriver>$")
	public static boolean i_click_the_new_PTO_request_button(WebDriver wd) {
		try {
			TrainersVP.addPtoRequestButtonVP(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

	}
	
	@Then("^A new window should appear which allows the user to enter a start date and an end date <webdriver>$")
	public void a_new_window_should_appear_which_allows_the_user_to_enter_a_start_date_and_an_end_date_webdriver()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^that the add PTO request popup is open <webdriver>$")
	public void that_the_add_PTO_request_popup_is_open_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click the cancel PTO request button <webdriver>$")
	public static boolean i_click_the_cancel_PTO_request_button(WebDriver wd) {
		try {
			TrainersVP.cancelRequestButtonVP(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

	}
	
	@When("^I click the cancel PTO calendar button <webdriver>$")
	public static boolean i_click_the_cancel_PTO_calendar_button(WebDriver wd) {
		try {
			TrainersVP.cancelCalendarButtonVP(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

	}

	@Then("^I should see the PTO Calendar window <webdriver>$")
	public void i_should_see_the_PTO_Calendar_window_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click the start date text box <webdriver>$")
	public static boolean i_click_the_start_date_text_box(WebDriver wd) {
		try {
			TrainersVP.requestStartDateVP(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

	}

	@Then("^A drop down calendar should appear which allows me to select a date <webdriver>$")
	public static boolean a_drop_down_calendar_should_appear_which_allows_me_to_select_a_date(WebDriver wd) {
		try {
			TrainersVP.pickStartYearVP(wd);
			Thread.sleep(1000);
			TrainersVP.pickStartDateVP(wd); 
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@When("^I click the end date text box <webdriver>$")
	public static boolean i_click_the_end_date_text_box(WebDriver wd) {
		try {
			TrainersVP.requestEndDateVP(wd);
			Thread.sleep(1000);
			TrainersVP.pickEndYearVP(wd);
			Thread.sleep(1000);
			TrainersVP.pickEndDateVP(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

	}

	@Given("^that there are dates in the start date and end date boxes$")
	public void that_there_are_dates_in_the_start_date_and_end_date_boxes() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click the send <webdriver>$")
	public static boolean i_click_the_send(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersVP.findCalendarButtonVP(wd);
			Thread.sleep(1000);
			TrainersVP.addPtoRequestButtonVP(wd);
			Thread.sleep(1000);
			TrainersVP.requestStartDateVP(wd);
			Thread.sleep(1000);
			a_drop_down_calendar_should_appear_which_allows_me_to_select_a_date(wd);
			Thread.sleep(1000);
			i_click_the_end_date_text_box(wd);
			Thread.sleep(1000);
			TrainersVP.sendRequestButtonVP(wd);
			Thread.sleep(1000);
			wd.navigate().back();
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

	}

	@Then("^I should be redirected to a google signin page <webdriver>$")
	public void i_should_be_redirected_to_a_google_signin_page_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^The PTO calendar should close <webdriver>$")
	public void the_PTO_calendar_should_close_webdriver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
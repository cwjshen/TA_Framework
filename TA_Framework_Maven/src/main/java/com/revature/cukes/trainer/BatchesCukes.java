package com.revature.cukes.trainer;

import org.openqa.selenium.WebDriver;

import com.revature.pom.BatchesTab;
import com.revature.pom.NavBar;
import com.revature.pom.OverviewTab;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BatchesCukes {
	
	@Given("^I am in Batches$")
	public void i_am_in_Batches(WebDriver wd) throws Throwable {
		NavBar.navigateToBatchesPage(wd).click();
	}

	@Then("^I should see All Batches text$")
	public static boolean i_should_see_All_Batches_text(WebDriver wd) throws Throwable {
		try {
			BatchesTab.batchesTag(wd);
			return true;
		} catch(Throwable e) {
			return false;
		}
	}

	@Given("^I click the name button <webdriver>$")
	public void i_click_the_name_button_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.nameFilter(wd).click();
	}

	@Then("^The names should be filtered in ASC order <webdriver>$")
	public void the_names_should_be_filtered_in_ASC_order_webdriver(WebDriver wd) throws Throwable {
		
	}

	@Then("^If I click the name button again <webdriver>$")
	public void if_I_click_the_name_button_again_webdriver(WebDriver wd) throws Throwable {
	}

	@Then("^The names should be filtered in DSC order <webdriver>$")
	public void the_names_should_be_filtered_in_DSC_order_webdriver(WebDriver wd) throws Throwable {
	}

	@Given("^I click the curriculum button <webdriver>$")
	public void i_click_the_curriculum_button_webdriver(WebDriver wd) throws Throwable {
	}

	@Then("^The curricula should be filtered in ASC order <webdriver>$")
	public void the_curricula_should_be_filtered_in_ASC_order_webdriver() throws Throwable {
	}

	@Then("^If I click the curriculum button again <webdriver>$")
	public void if_I_click_the_curriculum_button_again_webdriver() throws Throwable {
	}

	@Then("^The curricula should be filtered in DSC order <webdriver>$")
	public void the_curricula_should_be_filtered_in_DSC_order_webdriver() throws Throwable {
	}

	@Given("^I click the trainer button <webdriver>$")
	public void i_click_the_trainer_button_webdriver() throws Throwable {
	}

	@Then("^The trainers should be filtered in ASC order <webdriver>$")
	public void the_trainers_should_be_filtered_in_ASC_order_webdriver() throws Throwable {
	}

	@Then("^If I click the trainer button again <webdriver>$")
	public void if_I_click_the_trainer_button_again_webdriver() throws Throwable {
	}

	@Then("^The trainer should be filtered in DSC order <webdriver>$")
	public void the_trainer_should_be_filtered_in_DSC_order_webdriver() throws Throwable {
	}

	@Given("^I click the location button <webdriver>$")
	public void i_click_the_location_button_webdriver() throws Throwable {
	}

	@Then("^The locations should be filtered in ASC order <webdriver>$")
	public void the_locations_should_be_filtered_in_ASC_order_webdriver() throws Throwable {
	}

	@Then("^If I click the locations button again <webdriver>$")
	public void if_I_click_the_locations_button_again_webdriver() throws Throwable {
	}

	@Then("^The locations should be filtered in DSC order <webdriver>$")
	public void the_locations_should_be_filtered_in_DSC_order_webdriver() throws Throwable {
	}

	@Given("^I click the building button <webdriver>$")
	public void i_click_the_building_button_webdriver() throws Throwable {
	}

	@Then("^The buildings should be filtered in ASC order <webdriver>$")
	public void the_buildings_should_be_filtered_in_ASC_order_webdriver() throws Throwable {
	}

	@Then("^If I click the building button again <webdriver>$")
	public void if_I_click_the_building_button_again_webdriver() throws Throwable {
	}

	@Then("^The buildings should be filtered in DSC order <webdriver>$")
	public void the_buildings_should_be_filtered_in_DSC_order_webdriver() throws Throwable {
	}

	@Given("^I click the room button <webdriver>$")
	public void i_click_the_room_button_webdriver() throws Throwable {
	}

	@Then("^The rooms should be filtered in ASC order <webdriver>$")
	public void the_rooms_should_be_filtered_in_ASC_order_webdriver() throws Throwable {
	}

	@Then("^If I click the room button again <webdriver>$")
	public void if_I_click_the_room_button_again_webdriver() throws Throwable {
	}

	@Then("^The rooms should be filtered in DSC order <webdriver>$")
	public void the_rooms_should_be_filtered_in_DSC_order_webdriver() throws Throwable {
	}

	@Given("^I click the start button <webdriver>$")
	public void i_click_the_start_button_webdriver() throws Throwable {
	}

	@Then("^The start dates should be filtered in ASC order <webdriver>$")
	public void the_start_dates_should_be_filtered_in_ASC_order_webdriver() throws Throwable {
	}

	@Then("^If I click the start button again <webdriver>$")
	public void if_I_click_the_start_button_again_webdriver() throws Throwable {
	}

	@Then("^The start dates should be filtered in DSC order <webdriver>$")
	public void the_start_dates_should_be_filtered_in_DSC_order_webdriver() throws Throwable {
	}

	@Given("^I click the end button <webdriver>$")
	public void i_click_the_end_button_webdriver() throws Throwable {
	}

	@Then("^The end dates should be filtered in ASC order <webdriver>$")
	public void the_end_dates_should_be_filtered_in_ASC_order_webdriver() throws Throwable {
	}

	@Then("^If I click the end button again <webdriver>$")
	public void if_I_click_the_end_button_again_webdriver() throws Throwable {
	}

	@Then("^The end dates should be filtered in DSC order <webdriver>$")
	public void the_end_dates_should_be_filtered_in_DSC_order_webdriver() throws Throwable {
	}
}

package com.revature.cukes.trainer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.revature.pom.NavBar;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfileCukes {

	@Given("^I am logged in as trainer$")
	public void i_am_logged_in_as_trainer()   {
		System.out.println("I am logged in as trainer");
	}

	@When("^I click on the Profile tab$")
	public static boolean i_click_on_the_Profile_tab(WebDriver wd)   {
		try {
			Thread.sleep(2000);
			NavBar.navigateToProfilePage(wd).click();	
			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			return true;
		} catch (Throwable e) {
			return false;
		}

	}

	@Then("^I should see first name and last name text boxes$")
	public void i_should_see_first_name_and_last_name_text_boxes()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Add/update resume button$")
	public void add_update_resume_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I am on the profile tab$")
	public void i_am_on_the_profile_tab()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click the first name text box$")
	public void i_click_the_first_name_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^A cursor should appear in the text box$")
	public void a_cursor_should_appear_in_the_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to type into it$")
	public void i_should_be_able_to_type_into_it()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I clicked on the first name text box$")
	public void i_clicked_on_the_first_name_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I type in a value$")
	public void i_type_in_a_value()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^that value should appear in the text box$")
	public void that_value_should_appear_in_the_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click the last name text box$")
	public void i_click_the_last_name_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I clicked on the last name text box$")
	public void i_clicked_on_the_last_name_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the add/update resume button$")
	public void i_click_on_the_add_update_resume_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^A new window should appear$")
	public void a_new_window_should_appear()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to choose a file to upload from my pc$")
	public void i_should_be_able_to_choose_a_file_to_upload_from_my_pc()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I selected a resume from my pc$")
	public void i_selected_a_resume_from_my_pc()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the update resume button$")
	public void i_click_on_the_update_resume_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^My new resume should file name should appear$")
	public void my_new_resume_should_file_name_should_appear()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on a skill to add$")
	public void i_click_on_a_skill_to_add()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The skill that was clicked should be removed from the Select a skill section$")
	public void the_skill_that_was_clicked_should_be_removed_from_the_Select_a_skill_section()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The skill should appear under the Current skills section$")
	public void the_skill_should_appear_under_the_Current_skills_section()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on a current skill$")
	public void i_click_on_a_current_skill()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The skill that was clicked should be removed from the current skill section$")
	public void the_skill_that_was_clicked_should_be_removed_from_the_current_skill_section()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The skill should appear in the Select a skill section$")
	public void the_skill_should_appear_in_the_Select_a_skill_section()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on save skills button$")
	public void i_click_on_save_skills_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Skills listed under the current skills should be saved to your profile$")
	public void skills_listed_under_the_current_skills_should_be_saved_to_your_profile()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the add certification button$")
	public void i_click_on_the_add_certification_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^A new window should pop up$")
	public void a_new_window_should_pop_up()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to choose a file from my pc$")
	public void i_should_be_able_to_choose_a_file_from_my_pc()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the certification name text box$")
	public void i_click_on_the_certification_name_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I clicked on the certification name text box$")
	public void i_clicked_on_the_certification_name_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I selected a certification from my pc$")
	public void i_selected_a_certification_from_my_pc()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the update button$")
	public void i_click_on_the_update_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^My new certification should appear under certifications$")
	public void my_new_certification_should_appear_under_certifications()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the remove certification button$")
	public void i_click_on_the_remove_certification_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The selected certification should be removed from certifications section$")
	public void the_selected_certification_should_be_removed_from_certifications_section()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on a certification$")
	public void i_click_on_a_certification()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see some information$")
	public void i_should_see_some_information()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}

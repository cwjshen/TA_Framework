package com.revature.cukes.trainer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.pom.NavBar;
import com.revature.pom.ProfileTab;
import com.revature.pom.vp.BatchesTabVP;

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
	public static boolean clickProfile(WebDriver wd)   {
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
	public static boolean seeFirstAndLast(WebDriver wd)   {
		try {
			Thread.sleep(2000);
			ProfileTab.findfNameBox(wd);	
			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProfileTab.findlNameBox(wd);
			return true;
		} catch (Throwable e) {
			return false;
		}

	}

	@Then("^Add/update resume button$")
	public static boolean seeAddResumeButton(WebDriver wd)   {
		try {
			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProfileTab.findAddResumeButton(wd);	
			return true;
		} catch (Throwable e) {
			return false;
		}

	}
	@Given("^I am on the profile tab$")
	public static boolean OnProfileTab(WebDriver wd)   {
		try {
			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			seeFirstAndLast(wd);
			return true;
		} catch (Throwable e) {
			return false;
		}

	}

	@When("^I click the first name text box$")
	public static boolean clickfNameBox(WebDriver wd)   {
		try {
			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProfileTab.clickfNameBox(wd);
			return true;
		} catch (Throwable e) {
			return false;
		}

	}

	@Then("^A cursor should appear in the text box$")
	public static boolean fNameBoxSelected(WebDriver wd)   {
		try {
			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProfileTab.fNameBoxSelected(wd);
			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			return true;
		} catch (Throwable e) {
			System.out.println("Cursor did not appear");
			return false;
			
		}

	}

//	@Then("^I should be able to type into it$")
//	public static boolean populatefName(WebDriver wd)   {
//		try {
//			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//			ProfileTab.populatefNameBox(wd);
//			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//			return true;
//		} catch (Throwable e) {
//			return false;
//		}
//
//	}

	@Given("^I clicked on the first name text box$")
	public static boolean fNameBoxClicked(WebDriver wd)   {
		try {
			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProfileTab.fNameBoxSelected(wd);
			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			return true;
		} catch (Throwable e) {
			System.out.println("First Name box was not clicked");
			return false;
			
		}

	}

//	@When("^I type in a value$")
//	public static boolean populatefName(WebDriver wd)   {
//		try {
//			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//			ProfileTab.populatefNameBox(wd);
//			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//			return true;
//		} catch (Throwable e) {
//			return false;
//		}
//
//	}
	
	@Then("^that value should appear in the text box$")
	public static boolean fNamePopulated(WebDriver wd)   {
		try {
			WebElement element = ProfileTab.findfNameBox(wd);
			WebElement element1 = ProfileTab.populatefNameBox(wd);
			if (element.getText().equals(element1.getText())) {
				return true;
			}
			return false;
		} catch (Throwable e) {
			return false;
		}

	}

	@When("^I click the last name text box$")
	public static boolean i_click_the_last_name_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I clicked on the last name text box$")
	public static boolean i_clicked_on_the_last_name_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the add/update resume button$")
	public static boolean i_click_on_the_add_update_resume_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^A new window should appear$")
	public static boolean a_new_window_should_appear()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to choose a file to upload from my pc$")
	public static boolean i_should_be_able_to_choose_a_file_to_upload_from_my_pc()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I selected a resume from my pc$")
	public static boolean i_selected_a_resume_from_my_pc()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the update resume button$")
	public static boolean i_click_on_the_update_resume_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^My new resume should file name should appear$")
	public static boolean my_new_resume_should_file_name_should_appear()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on a skill to add$")
	public static boolean i_click_on_a_skill_to_add()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The skill that was clicked should be removed from the Select a skill section$")
	public static boolean the_skill_that_was_clicked_should_be_removed_from_the_Select_a_skill_section()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The skill should appear under the Current skills section$")
	public static boolean the_skill_should_appear_under_the_Current_skills_section()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on a current skill$")
	public static boolean i_click_on_a_current_skill()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The skill that was clicked should be removed from the current skill section$")
	public static boolean the_skill_that_was_clicked_should_be_removed_from_the_current_skill_section()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The skill should appear in the Select a skill section$")
	public static boolean the_skill_should_appear_in_the_Select_a_skill_section()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on save skills button$")
	public static boolean i_click_on_save_skills_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Skills listed under the current skills should be saved to your profile$")
	public static boolean skills_listed_under_the_current_skills_should_be_saved_to_your_profile()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the add certification button$")
	public static boolean i_click_on_the_add_certification_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^A new window should pop up$")
	public static boolean a_new_window_should_pop_up()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to choose a file from my pc$")
	public static boolean i_should_be_able_to_choose_a_file_from_my_pc()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the certification name text box$")
	public static boolean i_click_on_the_certification_name_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I clicked on the certification name text box$")
	public static boolean i_clicked_on_the_certification_name_text_box()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I selected a certification from my pc$")
	public static boolean i_selected_a_certification_from_my_pc()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the update button$")
	public static boolean i_click_on_the_update_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^My new certification should appear under certifications$")
	public static boolean my_new_certification_should_appear_under_certifications()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on the remove certification button$")
	public static boolean i_click_on_the_remove_certification_button()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The selected certification should be removed from certifications section$")
	public static boolean the_selected_certification_should_be_removed_from_certifications_section()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on a certification$")
	public static boolean i_click_on_a_certification()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see some information$")
	public static boolean i_should_see_some_information()   {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}

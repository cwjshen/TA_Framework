package com.revature.cukes.vp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.pom.NavBar;
import com.revature.pom.vp.BatchesTabVP;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BatchesCukesVP {
	
	@Given("^that I click the batches tab$")
	public static boolean clickBatchesTab(WebDriver wd) {
		try {
			Thread.sleep(2000);
			NavBar.navigateToBatchesPage(wd).click();			
			return true;
		} catch (Throwable e) {
			return false;
		}

	}

	@Then("^I should see the Create New Batch section$")
	public static boolean createBatchSectionExists(WebDriver wd) {
		try {
			WebElement element = BatchesTabVP.findNewBatchSection(wd);
			if (element.getText().equalsIgnoreCase("create new batch")) {
				return true;
			}
			return false;
		} catch (Throwable e) {
			return false;
		}
	}

	@Then("^I should see the All Batches section$")
	public static boolean allBatchesSectionExists(WebDriver wd) {
		try { 
			WebElement element = BatchesTabVP.findAllBatchesSection(wd);
			if (element.getText().equalsIgnoreCase("all batches")) {
				return true;
			}
			return false;
		} catch (Throwable e) {
			return false;
		}
	}

	@Then("^I should see the Batch Timeline section$")
	public static boolean batchesTimelineSectionExists(WebDriver wd) {
		try {
			WebElement element = BatchesTabVP.findBatchesTimelineSection(wd);
			if (element.getText().equalsIgnoreCase("batch timeline")) {
				return true;
			}
			return false;
		} catch (Throwable e) {
			return false;
		}
	}

	@Given("^that the batches form is empty$")
	public static boolean formIsEmpty(WebDriver wd) {
		try {
			System.out.println(BatchesTabVP.findStartDateInput(wd).getText());
			BatchesTabVP.findCoreCurriculumSelection(wd);
			BatchesTabVP.findFocusDropdownSelection(wd);
			BatchesTabVP.findSkillsDropdownSelection(wd);
			
			if (!BatchesTabVP.findStartDateInput(wd).getText().equals("")) {
				return false;
			}
			if (!BatchesTabVP.findEndDateInput(wd).getText().equals("")) {
				return false;
			}
			
			return false;
		} catch (Throwable e) {
			return true;
		}
	
	}

	@When("^I click the create batch button$")
	public void i_click_the_create_batch_button_webdriver() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^All batches should not contain a new batch$")
	public void all_batches_should_not_contain_a_new_batch_webdriver() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
}

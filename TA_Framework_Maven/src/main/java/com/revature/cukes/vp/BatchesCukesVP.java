package com.revature.cukes.vp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.pom.NavBar;
import com.revature.pom.vp.BatchesTabVP;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BatchesCukesVP {
	
	@Given("^that I click the batches tab$")
	public static boolean clickBatchesTab(WebDriver wd) {
		try {
			Thread.sleep(2000);
			NavBar.navigateToBatchesPage(wd).click();	
			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
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
			if (!BatchesTabVP.findCoreCurriculumDropdown(wd).getText().equals("Core Curriculum")
					|| !BatchesTabVP.findFocusDropdown(wd).getText().equals("Focus")
					|| !BatchesTabVP.findSkillsDropdown(wd).getText().equals("Skills")
					|| !BatchesTabVP.findStartDateInput(wd).getAttribute("value").equals("")
					|| !BatchesTabVP.findEndDateInput(wd).getAttribute("value").equals("")
					|| !BatchesTabVP.findNameInput(wd).getAttribute("value").equals("")
					|| !BatchesTabVP.findTrainerDropdown(wd).getText().equals("Trainer")
					|| !BatchesTabVP.findCoTrainerDropdown(wd).getText().equals("Co-Trainer")
					|| !BatchesTabVP.findBuildingDropdown(wd).getText().equals("Building")
					|| !BatchesTabVP.findRoomDropdown(wd).getText().equals("Room")
					) {
				return false;
			}
			return true;
		} catch (Throwable e) {
			return false;
		}
	
	}

	@When("^I click the create batch button$")
	public static boolean createBatch(WebDriver wd) {
		try {
			BatchesTabVP.findCreateBatchButton(wd).click();
			return true;
		} catch (Throwable e) {
			return false;
		}
		
	}

	@Then("^All batches should not contain a new batch$")
	public static boolean isNewBatchAdded(WebDriver wd, String batch_name) {
		try {
			List<List<WebElement>> rows_with_fields = BatchesTabVP.findBatchTableBodyRowFields(wd);
			for (List<WebElement> row : rows_with_fields) {
				if (row.get(1).getAttribute("innerHTML").equals(batch_name)) {
					return true;
				}
			}
			return false;
		} catch (Throwable e) {
			return false;
		}
	}

	
}

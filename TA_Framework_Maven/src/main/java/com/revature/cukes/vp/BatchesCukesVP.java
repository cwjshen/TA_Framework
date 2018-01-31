package com.revature.cukes.vp;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.reporters.FileStringBuffer;

import com.revature.hibernate.dao.BatchDaoImp;
import com.revature.model.Batch;
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

	@Given("^that I refresh the page$")
	public static boolean refreshPageVP(WebDriver wd) {
		try {
			wd.navigate().refresh();
			return true;
		} catch (Throwable e) {
			return false;
		}
	}
	
	
	@Given("^that I pull dummy batch data from the database$")
	public static List<Batch> getBatchDummyData() {
		try {
			List<Batch> batches = new BatchDaoImp().getFullBatch();
			return batches;
		} catch (Throwable e) {
			return null;
		}
	}

	@When("^I insert all the batch data$")
	public static boolean insertAllBatchData(WebDriver wd, List<Batch> batches) {
		try {
			List<WebElement> core_curricula = BatchesTabVP.findCoreCurriculumSelections(wd);
			for (Batch b : batches) {
				
				System.out.println("Adding: " + b.getCurriculum());
				Thread.sleep(1000);
				BatchesTabVP.findCoreCurriculumDropdown(wd).click();
//				Thread.sleep(1000);
//				BatchesTabVP.findCoreCurriculumDropdown(wd).sendKeys(b.getCurriculum());
////				Thread.sleep(1000);
//				if (BatchesTabVP.findCoreCurriculumMenuContainer(wd).getAttribute("aria-hidden").equals("false")) {
//					BatchesTabVP.findCoreCurriculumDropdown(wd).sendKeys(Keys.RETURN);
//				}
//				
//				Thread.sleep(1000);
//				
//				
//				BatchesTabVP.findFocusDropdown(wd).click();
//				Thread.sleep(1000);
//				BatchesTabVP.findFocusDropdown(wd).sendKeys(b.getFocus());
////				Thread.sleep(1000);
//				BatchesTabVP.findFocusDropdown(wd).sendKeys(Keys.RETURN);
//				Thread.sleep(1000);
				
				
				
				// Select the curriculum
				for (WebElement c : core_curricula) {
					System.out.println(c.getAttribute("innerHTML"));
					if (c.getAttribute("innerHTML").contains(b.getCurriculum())) {
						c.click();
						break;
					}
				}
				
//				// Select the focus
//				 List<WebElement> foci = BatchesTabVP.findFocusDropdownSelections(wd);
//				 for (WebElement f : foci) {
//					 if (b.getFocus().equals(f.getAttribute("innerHTML"))) {
//						 f.click();
//					 }
//				 }
//				
//				// Select skills
//				List<WebElement> skills = BatchesTabVP.findSkillsDropdownSelectionsText(wd);
//				
//				// Parses the string from database into list of strings
//				// Could have been avoided if we had used join tables
//				List<String> batch_skills = Arrays.asList(b.getSkills().split("\\s*,\\s*"));
//				for (String batch_skill : batch_skills) {
//					for (WebElement skill : skills) {
//						if (batch_skill.equals(skill.getAttribute("innerHTML"))) {
//							skill.click();
//							break;
//						}
//					}
//				}
				
			}
			return true;
		} catch (Throwable e) {
			return false;
		}
	}

	@Then("^All batches should contain the new batch$")
	public void all_batches_should_contain_the_new_batch() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}

package com.revature.cukes.vp;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
				if (row.get(1).getAttribute("innerHTML").trim().equals(batch_name)) {
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

	@When("^I insert a single batch data$")
	public static boolean insertBatchData(WebDriver wd, List<Batch> batches) {
		try {
			List<WebElement> core_curricula = BatchesTabVP.findCoreCurriculumSelections(wd);
			int loopcounter = 0;
			for (Batch b : batches) {
							
				System.out.println("Batch number: " + loopcounter);
				boolean curriculum_found = false;
				boolean focus_found = false;
				boolean skill_found = false;
				boolean trainer_found = false;
				boolean location_found = false;
				
				Thread.sleep(1000);
				// Select the curriculum
				// =======================
				System.out.println("Selecting curriculum: " + b.getCurriculum());
				BatchesTabVP.findCoreCurriculumDropdown(wd).click();
				Thread.sleep(2000);
				for (WebElement c : core_curricula) {
					if (c.getAttribute("innerHTML").trim().equals(b.getCurriculum())) {
						c.click();
						curriculum_found = true;
						break;
					}
				}
				
				if (curriculum_found == false) {
					System.out.println("\t Curriculum not found...defaulting to first curricula");
					core_curricula.get(0).click();
				}

				BatchesTabVP.body(wd).click();					

				// Select the focus
				// =======================
				System.out.println("Selecting focus: " + b.getCurriculum());
				BatchesTabVP.findFocusDropdown(wd).click();
				Thread.sleep(2000);
				List<WebElement> foci = BatchesTabVP.findFocusDropdownSelections(wd);
				for (WebElement f : foci) {
					if ((f.getAttribute("innerHTML").trim().equals(b.getFocus()))) {
						focus_found = true;
						f.click();
					}
				}
				
				if (focus_found == false) {
//					System.out.println("Focus not found...");
					BatchesTabVP.body(wd).click();					
				}
				
//				// Select the skills
				// =======================
//				System.out.println("Selecting skills for " + b.getCurriculum());
//				BatchesTabVP.findSkillsDropdown(wd).click();
//				Thread.sleep(2000);
//				List<String> batch_skills = Arrays.asList(b.getSkills().split("\\s*,\\s*"));
//				List<WebElement> skills = BatchesTabVP.findSkillsDropdownSelectionsText(wd);
//				List<WebElement> skills_checkboxes = BatchesTabVP.findSkillsDropdownSelectionsCheckbox(wd);
//				
//				Actions actions = new Actions(wd);
//				
//				for (String batch_skill : batch_skills) {
//					skill_found = false;
//					System.out.print("\t Looking for " + batch_skill + "...");
//					for (WebElement s : skills) {
//						if (s.getAttribute("innerHTML").trim().equals(batch_skill)) {
//							System.out.println(batch_skill + " found!");
//							skill_found = true;
//							int found_skill_index = skills.indexOf(s);
//							if (!skills_checkboxes.get(found_skill_index).getAttribute("aria-selected").equals("true")) {
//								actions.moveToElement(skills_checkboxes.get(found_skill_index)).click().perform();
//							}
//							break;
//						}	
//					}
//					if (skill_found == false) {
//						System.out.println(batch_skill + " not found...");
//					}
//				}
				
				BatchesTabVP.body(wd).click();
				
				// === Select the date ===
				// =======================
				System.out.println("Selecting start date: ");
				// If the date in the database is invalid, this code selects the nearest monday!!!
				Calendar nearest_monday = Calendar.getInstance();
				nearest_monday.setTime(b.getStart_date());				
				nearest_monday.set(Calendar.YEAR, 2018);
				while (nearest_monday.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
					nearest_monday.add(Calendar.DATE, 1);
				}
				String startdate = new SimpleDateFormat("MM/dd/yyyy").format(nearest_monday.getTime());
				
				BatchesTabVP.findStartDateInput(wd).click();
				Thread.sleep(2000);
				BatchesTabVP.findStartDateInput(wd).clear();
				Thread.sleep(2000);
				BatchesTabVP.findStartDateInput(wd).sendKeys(startdate);
				System.out.println("\t" + BatchesTabVP.findStartDateInput(wd).getAttribute("value"));
				BatchesTabVP.body(wd).click();

				// End date and span is auto generated for us
				// Should probably have a separate test to test if end date is properly generated
				
				// === Input the name ===
				// =======================
				System.out.println("Selecting name");
				Thread.sleep(1000);
				BatchesTabVP.findNameInput(wd).clear();				
				BatchesTabVP.findNameInput(wd).sendKeys(b.getName());
				System.out.println("\t" + BatchesTabVP.findNameInput(wd).getAttribute("value"));
				
				BatchesTabVP.body(wd).click();
				
				// Select trainer
				// =======================
				System.out.println("Selecting trainer");
				BatchesTabVP.findTrainerDropdown(wd).click();
				Thread.sleep(2000);
				String batch_trainer = b.getTrainer();
				System.out.print("\t Looking for " + b.getTrainer() + "...");
				List<WebElement> dropdown_trainers = BatchesTabVP.findTrainerSelectionsText(wd);				
				
				for (WebElement trainer : dropdown_trainers) {
					if (trainer.getText().contains(batch_trainer)) {
						System.out.println(b.getTrainer() + " found!");
						trainer_found = true;
						trainer.click();
						break;
					}
				}
				
				if (trainer_found == false) {
					System.out.println(b.getTrainer() + " not found.");
					dropdown_trainers.get(0).click();
				}
				
				BatchesTabVP.body(wd).click();
				
				// Optional Co-Trainer
				// =======================

				
				// Location
				// =======================
				System.out.println("Selecting Location");
				BatchesTabVP.findLocationDropdown(wd).click();
				String location = b.getLocation();
				List<WebElement> dropdown_locs = BatchesTabVP.findLocationSelectionsText(wd);
				System.out.println("\t Looking for " + location + "...");
				Thread.sleep(2000);
				for (WebElement loc : dropdown_locs) {
					if (loc.getText().contains(location)) {
						System.out.println(location + " found!");
						location_found = true;
						loc.click();
						break;
					}
				}
				
				if (location_found == false) {
					System.out.println(location + " not found, defaulting to first location");
					dropdown_locs.get(0).click();
				}
				
				BatchesTabVP.body(wd).click();


//				// Building, optional
//				// =======================
				
//				// Room, optional
//				// =======================
				
				BatchesTabVP.body(wd).click();
				
				BatchesTabVP.findCreateBatchButton(wd).click();
				System.out.println("Submitted!");
				System.out.println(isNewBatchAdded(wd, b.getName()));
				
				loopcounter++;
			}
			return true;
		} catch (Throwable e) {
			return false;
		}
	}

	@Then("^All batches should contain the new batch$")
	public static boolean containsNewBatch(WebDriver wd, List<Batch> batches) {
		try {
			boolean added = false;
			for (Batch b : batches) {
				added = isNewBatchAdded(wd, b.getName());
				if (added == false) {
					return false;
				}
			}			
			return true;
		} catch (Throwable e) {
			return false;
		}

	}

	@Given("^that I pull dummy batch data from the database$")
	public static List<Batch> getAllBatchDummyData() {
		try {
			List<Batch> batches = new BatchDaoImp().getFullBatch();
			return batches;
		} catch (Throwable e) {
			return null;
		}
	}

	@When("^I insert all the batch data$")
	public static boolean insertAllBatchData(WebDriver wd, List<Batch> batches) {
		return insertBatchData(wd, batches);
	}

	@Then("^All batches should contain all new batches$")
	public static boolean containsAllNewBatches(WebDriver wd, List<Batch> batches) {
		return containsNewBatch(wd, batches);
	}

	
}

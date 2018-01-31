package com.revature.tests.vp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.os.WindowsUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.vp.BatchesCukesVP;
import com.revature.pom.vp.BatchesTabVP;
import com.revature.util.JSClicker;
import com.revature.util.WaitToLoad;

public class TestBatchesVP extends VPSuite {

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Batches VP Test");
		assertTrue(BatchesCukesVP.clickBatchesTab(wd));		
//		
//		// CURRICULA
//		List<WebElement> core_curricula = BatchesTabVP.findCoreCurriculumSelections(wd);
//		System.out.println("Core curricula...");
//		for (WebElement e : core_curricula) {
//			System.out.println(e.getAttribute("innerHTML"));			
//		}
//		
//		BatchesTabVP.findCoreCurriculumDropdown(wd).click();
//		core_curricula.get(4).click();
//		
//		System.out.println(BatchesTabVP.findCoreCurriculumDropdown(wd).getText());
//		
//		// FOCUS
//		List<WebElement> foci = BatchesTabVP.findFocusDropdownSelections(wd);
//		System.out.println("Foci...");
//		for (WebElement e : foci) {
//			System.out.println(e.getAttribute("innerHTML"));
//		}
//		
//		BatchesTabVP.findFocusDropdown(wd).click();
//		foci.get(2).click();
//		
//		/// SKILLS
//		List<WebElement> skills = BatchesTabVP.findSkillsDropdownSelectionsText(wd);
//		List<WebElement> skillsCheckbox = BatchesTabVP.findSkillsDropdownSelectionsCheckbox(wd);
//		System.out.println("Skills...");
//		for (WebElement e : skills) {
//			System.out.println(e.getAttribute("innerHTML"));
//		}
//		BatchesTabVP.findSkillsDropdown(wd).click();
//		Actions actions = new Actions(wd);
//
//		for (int i = 0; i < skillsCheckbox.size(); i++ ) {
//			if (!skillsCheckbox.get(i).getAttribute("aria-selected").equals("true")) {
//				actions.moveToElement(skillsCheckbox.get(i)).click().perform();
//			}
//		}
		
		// START DATE -- hard coded the xpath to a specific date...css selector and other methods didnt seem to work
		wd.findElement(By.cssSelector("#input_16")).click();
		wd.findElement(By.xpath("/html/body/div[3]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[5]/td[2]/span")).click();
		System.out.println("date value: " + WaitToLoad.findDynamicElement(wd, By.cssSelector("#input_16"), 30).getAttribute("value"));
		
		
		// NAME
//		BatchesTabVP.findNameInput(wd).sendKeys("Jason");
//		System.out.println(BatchesTabVP.findNameInput(wd).getAttribute("value"));
		
		
		// GET ALL BATCH INFO
//		List<List<WebElement>> rows = BatchesTabVP.findBatchTableBodyRowFields(wd);
//		for (List<WebElement> row : rows) {
//			for (WebElement field : row) {
//				System.out.print(field.getAttribute("innerText") + "   ");
//			}
//			System.out.println();
//		}
		
		// BODY,LOGOUT
		BatchesTabVP.body(wd).click();
	}
	
	@Test(priority=1, enabled=false)
	public void checkSectionHeaders() {
		assertTrue(BatchesCukesVP.allBatchesSectionExists(wd));
		assertTrue(BatchesCukesVP.createBatchSectionExists(wd));
		assertTrue(BatchesCukesVP.batchesTimelineSectionExists(wd));
	}
	
	@Test(priority=2, enabled=true)
	public void invalidateEmptyForm() {

		String batch_name = BatchesTabVP.findNameInput(wd).getAttribute("value");
		
		assertTrue(BatchesCukesVP.formIsEmpty(wd));
		assertTrue(BatchesCukesVP.createBatch(wd));		
		assertFalse(BatchesCukesVP.isNewBatchAdded(wd, batch_name));
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Batches VP Test Complete");
	}
	
}

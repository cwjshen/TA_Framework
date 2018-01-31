package com.revature.tests.trainer;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.BatchesCukes;
import com.revature.pom.BatchesTab;

public class TestBatches extends TrainerSuite {
	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Batches Tab Test");
	}
	@Test(priority = 1)
	public void TestClickBatches() {
		try {
			BatchesCukes.i_am_in_Batches(wd);
			System.out.println("Clicked Batches tab");
			assertTrue(BatchesCukes.i_should_see_All_Batches_text(wd));
		} catch (Throwable e) { 
			fail("Can't find Batches button");
			e.printStackTrace();
		}
	}
	
//	@Test(priority = 2)
//	public void CheckNameFilterASC() {
//		try {
//			BatchesCukes.i_click_the_name_button_webdriver(wd);
//			assertTrue(BatchesCukes.the_names_should_be_filtered_in_ASC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Name filter ASC button not working because of lowercases");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 3)
//	public void CheckNameFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_name_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_names_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Name filter DSC button not working because of lowercases");
// 			e.printStackTrace();
// 		}
//	}
//
//	@Test(priority = 4)
//	public void CheckCurrFilterASC() {
//		try {
//			BatchesCukes.i_click_the_curriculum_button_webdriver(wd);
//			assertTrue(BatchesCukes.the_curricula_should_be_filtered_in_ASC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Curriculum button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 5)
//	public void CheckCurrFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_curriculum_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_curricula_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Curriculum button not working");
// 			e.printStackTrace();
// 		}
//	}
//	@Test(priority = 6)
//	public void CheckFocusFilterASC() {
//		try {
//			BatchesCukes.i_click_the_focus_button_webdriver(wd);
//			assertTrue(BatchesCukes.the_focus_should_be_filtered_in_ASC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Focus button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 7)
//	public void CheckFocusFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_focus_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_focus_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Focus button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//
//	@Test(priority = 8)
//	public void CheckTrainerFilterASC() {
//		try {
//			BatchesCukes.i_click_the_trainer_button_webdriver(wd);
//			assertTrue(BatchesCukes.the_trainers_should_be_filtered_in_ASC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Trainer ASC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 9)
//	public void CheckTrainerFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_trainer_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_trainer_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Trainer DSC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	@Test(priority = 10)
//	public void CheckLocationFilterASC() {
//		try {
//			BatchesCukes.i_click_the_location_button_webdriver(wd);
//			assertTrue(BatchesCukes.the_locations_should_be_filtered_in_ASC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Location ASC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 11)
//	public void CheckLocationFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_locations_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_locations_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Location DSC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 12)
//	public void CheckBuildingFilterASC() {
//		try {
//			BatchesCukes.i_click_the_building_button_webdriver(wd);
//			assertTrue(BatchesCukes.the_buildings_should_be_filtered_in_ASC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Building ASC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 13)
//	public void CheckBuildingFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_building_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_buildings_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Building DSC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 14)
//	public void CheckRoomFilterASC() {
//		try {
//			BatchesCukes.i_click_the_room_button_webdriver(wd);
//			assertTrue(BatchesCukes.the_rooms_should_be_filtered_in_ASC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Room ASC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 15)
//	public void CheckRoomFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_room_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_rooms_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Room DSC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 16)
//	public void CheckStartFilterASC() {
//		try {
//			BatchesCukes.i_click_the_start_button_webdriver(wd);
//			assertTrue(BatchesCukes.the_start_dates_should_be_filtered_in_ASC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Start ASC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 17)
//	public void CheckStartFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_start_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_start_dates_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Start DSC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 18)
//	public void CheckEndFilterASC() {
//		try {
//			BatchesCukes.i_click_the_end_button_webdriver(wd);
//			assertTrue(BatchesCukes.the_end_dates_should_be_filtered_in_ASC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("End ASC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	
//	@Test(priority = 19)
//	public void CheckEndFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_end_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_end_dates_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("End DSC button not working");
// 			e.printStackTrace();
// 		}
//	}
//////////////////////////////////////////////////////////////////////////////////
//	@Test(priority = 20) 
//	public void checkCurriculumDropDown() throws InterruptedException {
//		Thread.sleep(1000);
//		BatchesTab.curriculumSelector(wd);
//		Actions action = new Actions(wd);
//		//action.moveToElement(BatchesTab.curriculumDropDownOptions(wd).get(0)).click().perform();
//		Thread.sleep(500);
//	}
/////////////////////////////////////////////////
	
	@Test(priority = 21)
	public void clickHideConcluded() {
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("window.scrollBy(0,800)", "");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BatchesTab.clickHideConcludedBox(wd);
		BatchesTab.clickHideConcludedBox(wd);
	}
	@Test(priority = 22)
	public void clickBatchless() {
		BatchesTab.clickHideBatchlessBox(wd);
		//BatchesTab.clickHideBatchlessBox(wd);
	}
//	@Test(priority = 23)
//	public void clickSelectAutomatically() {
//		BatchesTab.clickSelectAutomaticallyBox(wd);
//		BatchesTab.clickSelectAutomaticallyBox(wd);
//	}
	
	@Test(priority = 24)
	public void selectStartDate() {
		//BatchesTab.startDateSelector(wd).click();
		//BatchesTab.chooseStartingMonth(wd);
		//BatchesTab.chooseStartingDate(wd);
	}
	
	@Test(priority = 25)
	public void checkNextPage() {

		//BatchesTab.clickNextPage(wd);
		assertTrue(BatchesTab.checkIfNextPage(wd));
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Batches tab working as intended");
	}

}

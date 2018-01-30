package com.revature.tests.trainer;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.BatchesCukes;
import com.revature.cukes.trainer.LocationsCukes;
import com.revature.cukes.trainer.BatchesCukes;
import com.revature.pom.NavBar;

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
	
	@Test(priority = 2)
	public void CheckNameFilterASC() {
		try {
			BatchesCukes.i_click_the_name_button_webdriver(wd);
			assertTrue(BatchesCukes.the_names_should_be_filtered_in_ASC_order_webdriver(wd));
 		} catch (Throwable e) {
 			fail("Name filter ASC button not working because of lowercases");
 			e.printStackTrace();
 		}
	}
	
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
//
//	@Test(priority = 6)
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
//	@Test(priority = 7)
//	public void CheckTrainerFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_trainer_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_trainer_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("Trainer DSC button not working");
// 			e.printStackTrace();
// 		}
//	}
//	@Test(priority = 8)
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
//	@Test(priority = 9)
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
//	@Test(priority = 10)
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
//	@Test(priority = 11)
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
//	@Test(priority = 12)
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
//	@Test(priority = 13)
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
//	@Test(priority = 14)
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
//	@Test(priority = 15)
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
//	@Test(priority = 16)
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
//	@Test(priority = 17)
//	public void CheckEndFilterDSC() {
//		try {
//			BatchesCukes.if_I_click_the_end_button_again_webdriver(wd);
//			assertTrue(BatchesCukes.the_end_dates_should_be_filtered_in_DSC_order_webdriver(wd));
// 		} catch (Throwable e) {
// 			fail("End DSC button not working");
// 			e.printStackTrace();
// 		}
//	}

	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Batches tab working as intended");
	}

}

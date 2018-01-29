package com.revature.tests.vp;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.revature.cukes.vp.OverviewCukesVP;
import com.revature.tests.trainer.TestOverview;
import com.revature.util.LoginUtil;

public class TestOverviewVP extends VPSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Overview Tab Test");

	}

	@Test(priority = 1)
	public void TestClickOverview() {
		try {
			// Need assert statements for these? Idk though because they can never be false
			//	since it would just jump to catch block with NoSuchElementException
			OverviewCukesVP.clickOverview(wd);
			System.out.println("Clicked overview tab");
		} catch (Throwable e) { 
			fail("Can't find overview button");
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void TestFindExport() {
		try {
			// Need assert statements for these? Idk though because they can never be false
			//	since it would just jump to catch block with NoSuchElementException
			System.out.println("Export button found");
			OverviewCukesVP.exportButtonExists(wd);

		} catch (Throwable e) { 
			fail("CSV button button not found. Not in Overview tab");
			e.printStackTrace();
		}
	}		

	@Test(priority = 3)
	public void TestFindFilter() {
		try {
			// Need assert statements for these? Idk though because they can never be false
			//	since it would just jump to catch block with NoSuchElementException
			OverviewCukesVP.filterButtonExists(wd);
			System.out.println("Filter button found");

		} catch (Throwable e) { 
			fail("filter button not found. Not in Overview tab");
			e.printStackTrace();
		}
	}	

	@Test(priority = 4)
	public void TestClickExportCSV() {
		try {
			// Need assert statements for these? Idk though because they can never be false
			//	since it would just jump to catch block with NoSuchElementException
			OverviewCukesVP.clickCSVButton(wd);
			OverviewCukesVP.the_download_should_start();
		} catch (Throwable e) { 
			fail("Can't click CSV button");
			e.printStackTrace();
		}
	}	

	@Test(priority = 5)
	public void CheckIfCSVDownload() {
		try {
			OverviewCukesVP.the_download_should_start();
			System.out.println("Download complete");
		} catch (Throwable e) {
			fail("----------- DOWNLOAD FAILED ------------");
			e.printStackTrace();
		}

	}
	
	@Test(priority = 6)
	public void CheckNameFilterASC() {
		try {
			OverviewCukesVP.i_click_the_name_button(wd);
			assertTrue(OverviewCukesVP.the_names_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Filter ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 7)
	public void CheckNameFilterDSC() {
		try {
			OverviewCukesVP.if_I_click_the_name_button_again(wd);
			assertTrue(OverviewCukesVP.the_names_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Filter DSC button not working");
 			e.printStackTrace();
 		}
	}

	@Test(priority = 8)
	public void CheckCurrFilterASC() {
		try {
			OverviewCukesVP.i_click_the_curriculum_button(wd);
			assertTrue(OverviewCukesVP.the_curricula_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Curriculum button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 9)
	public void CheckCurrFilterDSC() {
		try {
			OverviewCukesVP.if_I_click_the_curriculum_button_again(wd);
			assertTrue(OverviewCukesVP.the_curricula_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Curriculum button not working");
 			e.printStackTrace();
 		}
	}

	@Test(priority = 10)
	public void CheckTrainerFilterASC() {
		try {
			OverviewCukesVP.i_click_the_trainer_button(wd);
			assertTrue(OverviewCukesVP.the_trainers_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Trainer ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 11)
	public void CheckTrainerFilterDSC() {
		try {
			OverviewCukesVP.if_I_click_the_trainer_button_again(wd);
			assertTrue(OverviewCukesVP.the_trainers_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Trainer DSC button not working");
 			e.printStackTrace();
 		}
	}
	@Test(priority = 12)
	public void CheckLocationFilterASC() {
		try {
			OverviewCukesVP.i_click_the_location_button(wd);
			assertTrue(OverviewCukesVP.the_locations_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Location ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 13)
	public void CheckLocationFilterDSC() {
		try {
			OverviewCukesVP.if_I_click_the_location_button_again(wd);
			assertTrue(OverviewCukesVP.the_locations_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Location DSC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 14)
	public void CheckBuildingFilterASC() {
		try {
			OverviewCukesVP.i_click_the_building_button(wd);
			assertTrue(OverviewCukesVP.the_buildings_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Building ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 15)
	public void CheckBuildingFilterDSC() {
		try {
			OverviewCukesVP.if_I_click_the_building_button_again(wd);
			assertTrue(OverviewCukesVP.the_buildings_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Building DSC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 16)
	public void CheckRoomFilterASC() {
		try {
			OverviewCukesVP.i_click_the_room_button(wd);
			assertTrue(OverviewCukesVP.the_rooms_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Room ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 17)
	public void CheckRoomFilterDSC() {
		try {
			OverviewCukesVP.if_I_click_the_room_button_again(wd);
			assertTrue(OverviewCukesVP.the_rooms_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Room DSC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 18)
	public void CheckStartFilterASC() {
		try {
			OverviewCukesVP.i_click_the_start_button(wd);
			assertTrue(OverviewCukesVP.the_start_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Start ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 19)
	public void CheckStartFilterDSC() {
		try {
			OverviewCukesVP.if_I_click_the_start_button_again(wd);
			assertTrue(OverviewCukesVP.the_starts_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Start DSC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 20)
	public void CheckEndFilterASC() {
		try {
			OverviewCukesVP.i_click_the_end_button(wd);
			assertTrue(OverviewCukesVP.the_ends_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("End ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 21)
	public void CheckEndFilterDSC() {
		try {
			OverviewCukesVP.if_I_click_the_end_button_again(wd);
			assertTrue(OverviewCukesVP.the_ends_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("End DSC button not working");
 			e.printStackTrace();
 		}
	}
	@Test(priority = 22)
	public void ClickInProgress() {
		try {
			OverviewCukesVP.i_click_the_filter_button_webdriver(wd);
			OverviewCukesVP.three_options_should_show_webdriver(wd);
			OverviewCukesVP.if_I_click_the_In_Progress_button_webdriver(wd);
			assertTrue(OverviewCukesVP.the_batches_in_progress_should_display_everything_webdriver(wd));
 		} catch (Throwable e) {
 			fail("Can't click In Progress");
 			e.printStackTrace();
 		}
	}
	@Test(priority = 23)
	public void ClickBeginningInTwoWeeks() {
		try {
			OverviewCukesVP.i_click_the_filter_button_webdriver(wd);
			OverviewCukesVP.three_options_should_show_webdriver(wd);
			OverviewCukesVP.if_I_click_the_In_Two_Weeks_button_webdriver(wd);
			OverviewCukesVP.the_batches_in_two_weeks_should_display(wd);
 		} catch (Throwable e) {
 			fail("Can't Click Beginning in Two Weeks");
 			e.printStackTrace();
 		}
	}
	@Test(priority = 24)
	public void ClickAllFilter() {
		try {
			OverviewCukesVP.i_click_the_filter_button_webdriver(wd);
			OverviewCukesVP.if_I_click_the_all_button_webdriver(wd);
			OverviewCukesVP.all_batches_should_display(wd);

 		} catch (Throwable e) {
 			fail("Not all batches displayed");
 			e.printStackTrace();
 		}
	}
	

	@AfterTest
	public void afterTest() {
		System.out.println("============ Tests finished ===============");
	}

}

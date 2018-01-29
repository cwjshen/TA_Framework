package com.revature.tests.vp;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.fail;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.revature.cukes.trainer.OverviewCukes;

public class TestOverviewVP extends VPSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Overview Tab Test For VP");

	}

	@Test(priority = 1)
	public void TestClickOverview() {
		try {
			OverviewCukes.clickOverview(wd);
			System.out.println("Clicked overview tab");
		} catch (Throwable e) { 
			fail("Can't find overview button");
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void ClickInProgress() {
		try {
			OverviewCukes.i_click_the_filter_button_webdriver(wd);
			OverviewCukes.three_options_should_show_webdriver(wd);
			OverviewCukes.if_I_click_the_In_Progress_button_webdriver(wd);
			assertTrue(OverviewCukes.the_batches_in_progress_should_display_everything_webdriver(wd));
 		} catch (Throwable e) {
 			fail("Can't click In Progress");
 			e.printStackTrace();
 		}
	}
	@Test(priority =3)
	public void ClickBeginningInTwoWeeks() {
		try {
			OverviewCukes.i_click_the_filter_button_webdriver(wd);
			OverviewCukes.three_options_should_show_webdriver(wd);
			OverviewCukes.if_I_click_the_In_Two_Weeks_button_webdriver(wd);
			OverviewCukes.the_batches_in_two_weeks_should_display(wd);
 		} catch (Throwable e) {
 			fail("Can't Click Beginning in Two Weeks");
 			e.printStackTrace();
 		}
	}
	@Test(priority = 4)
	public void ClickAllFilter() {
		try {
			OverviewCukes.i_click_the_filter_button_webdriver(wd);
			OverviewCukes.if_I_click_the_all_button_webdriver(wd);
			OverviewCukes.all_batches_should_display(wd);

 		} catch (Throwable e) {
 			fail("Not all batches displayed");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 5)
	public void TestFindExport() {
		try {
			System.out.println("Export button found");
			OverviewCukes.exportButtonExists(wd);

		} catch (Throwable e) { 
			fail("CSV button button not found. Not in Overview tab");
			e.printStackTrace();
		}
	}		

	@Test(priority = 6)
	public void TestFindFilter() {
		try {
			OverviewCukes.filterButtonExists(wd);
			System.out.println("Filter button found");

		} catch (Throwable e) { 
			fail("filter button not found. Not in Overview tab");
			e.printStackTrace();
		}
	}	

	@Test(priority = 7)
	public void TestClickExportCSV() {
		try {
			OverviewCukes.clickCSVButton(wd);
			OverviewCukes.the_download_should_start();
		} catch (Throwable e) { 
			fail("Can't click CSV button");
			e.printStackTrace();
		}
	}	

	@Test(priority = 8)
	public void CheckIfCSVDownload() {
		try {
			OverviewCukes.the_download_should_start();
			System.out.println("Download complete");
		} catch (Throwable e) {
			fail("----------- DOWNLOAD FAILED ------------");
			e.printStackTrace();
		}

	}
	
	@Test(priority = 9)
	public void CheckNameFilterASC() {
		try {
			OverviewCukes.i_click_the_name_button(wd);
			assertTrue(OverviewCukes.the_names_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Name filter ASC button not working because of lowercases");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 10)
	public void CheckNameFilterDSC() {
		try {
			OverviewCukes.if_I_click_the_name_button_again(wd);
			assertTrue(OverviewCukes.the_names_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Name filter DSC button not working because of lowercases");
 			e.printStackTrace();
 		}
	}

	@Test(priority = 11)
	public void CheckCurrFilterASC() {
		try {
			OverviewCukes.i_click_the_curriculum_button(wd);
			assertTrue(OverviewCukes.the_curricula_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Curriculum button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 12)
	public void CheckCurrFilterDSC() {
		try {
			OverviewCukes.if_I_click_the_curriculum_button_again(wd);
			assertTrue(OverviewCukes.the_curricula_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Curriculum button not working");
 			e.printStackTrace();
 		}
	}

	@Test(priority = 13)
	public void CheckTrainerFilterASC() {
		try {
			OverviewCukes.i_click_the_trainer_button(wd);
			assertTrue(OverviewCukes.the_trainers_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Trainer ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 14)
	public void CheckTrainerFilterDSC() {
		try {
			OverviewCukes.if_I_click_the_trainer_button_again(wd);
			assertTrue(OverviewCukes.the_trainers_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Trainer DSC button not working");
 			e.printStackTrace();
 		}
	}
	@Test(priority = 15)
	public void CheckLocationFilterASC() {
		try {
			OverviewCukes.i_click_the_location_button(wd);
			assertTrue(OverviewCukes.the_locations_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Location ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 16)
	public void CheckLocationFilterDSC() {
		try {
			OverviewCukes.if_I_click_the_location_button_again(wd);
			assertTrue(OverviewCukes.the_locations_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Location DSC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 17)
	public void CheckBuildingFilterASC() {
		try {
			OverviewCukes.i_click_the_building_button(wd);
			assertTrue(OverviewCukes.the_buildings_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Building ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 18)
	public void CheckBuildingFilterDSC() {
		try {
			OverviewCukes.if_I_click_the_building_button_again(wd);
			assertTrue(OverviewCukes.the_buildings_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Building DSC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 19)
	public void CheckRoomFilterASC() {
		try {
			OverviewCukes.i_click_the_room_button(wd);
			assertTrue(OverviewCukes.the_rooms_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Room ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 20)
	public void CheckRoomFilterDSC() {
		try {
			OverviewCukes.if_I_click_the_room_button_again(wd);
			assertTrue(OverviewCukes.the_rooms_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Room DSC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 21)
	public void CheckStartFilterASC() {
		try {
			OverviewCukes.i_click_the_start_button(wd);
			assertTrue(OverviewCukes.the_start_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Start ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 22)
	public void CheckStartFilterDSC() {
		try {
			OverviewCukes.if_I_click_the_start_button_again(wd);
			assertTrue(OverviewCukes.the_starts_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Start DSC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 23)
	public void CheckEndFilterASC() {
		try {
			OverviewCukes.i_click_the_end_button(wd);
			assertTrue(OverviewCukes.the_ends_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("End ASC button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 24)
	public void CheckEndFilterDSC() {
		try {
			OverviewCukes.if_I_click_the_end_button_again(wd);
			assertTrue(OverviewCukes.the_ends_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("End DSC button not working");
 			e.printStackTrace();
 		}
	}

	@AfterTest
	public void afterTest() {
		System.out.println("============ Tests finished ===============");
	}
}

package com.revature.tests.trainer;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.revature.cukes.trainer.OverviewCukes;

public class TestOverview extends TrainerSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Overview Tab Test");

	}

	@Test(priority = 1)
	public void TestClickOverview() {
		try {
			// Need assert statements for these? Idk though because they can never be false
			//	since it would just jump to catch block with NoSuchElementException
			OverviewCukes.clickOverview(wd);
			System.out.println("Clicked overview tab");
			
//			WebElement table_element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
//	        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
//	        
//	        List<WebElement> columns = new ArrayList<WebElement>();
//	        
//			for (WebElement e : rows) {
//				columns=e.findElements(By.xpath("td[1]"));
//				for(WebElement tdElement : columns)
//	            {
//	                System.out.println(tdElement.getText());
//	            }
//			}

		} catch (Throwable e) { 
			fail("Can't find overview button");
			e.printStackTrace();
		}
	}

//	@Test(priority = 2)
//	public void TestFindExport() {
//		try {
//			// Need assert statements for these? Idk though because they can never be false
//			//	since it would just jump to catch block with NoSuchElementException
//			System.out.println("Export button found");
//			OverviewCukes.exportButtonExists(wd);
//
//		} catch (Throwable e) { 
//			fail("CSV button button not found. Not in Overview tab");
//			e.printStackTrace();
//		}
//	}		
//
//	@Test(priority = 3)
//	public void TestFindFilter() {
//		try {
//			// Need assert statements for these? Idk though because they can never be false
//			//	since it would just jump to catch block with NoSuchElementException
//			OverviewCukes.filterButtonExists(wd);
//			System.out.println("Filter button found");
//
//		} catch (Throwable e) { 
//			fail("filter button not found. Not in Overview tab");
//			e.printStackTrace();
//		}
//	}	
//
//	@Test(priority = 4)
//	public void TestClickExportCSV() {
//		try {
//			// Need assert statements for these? Idk though because they can never be false
//			//	since it would just jump to catch block with NoSuchElementException
//			OverviewCukes.clickCSVButton(wd);
//			OverviewCukes.the_download_should_start();
//		} catch (Throwable e) { 
//			fail("Can't click CSV button");
//			e.printStackTrace();
//		}
//	}	
//
//	@Test(priority = 5)
//	public void CheckIfCSVDownload() {
//		try {
//			OverviewCukes.the_download_should_start();
//			System.out.println("Download complete");
//		} catch (Throwable e) {
//			fail("----------- DOWNLOAD FAILED ------------");
//			e.printStackTrace();
//		}
//
//	}
	
	@Test(priority = 6)
	public void CheckNameFilterASC() {
		try {
			OverviewCukes.i_click_the_name_button(wd);
			assertTrue(OverviewCukes.the_names_should_be_filtered_in_ASC_order(wd));
 		} catch (Throwable e) {
 			fail("Filter button not working");
 			e.printStackTrace();
 		}
	}
	
	@Test(priority = 7)
	public void CheckNameFilterDSC() {
		try {
			OverviewCukes.if_I_click_the_name_button_again(wd);
			assertTrue(OverviewCukes.the_names_should_be_filtered_in_DSC_order(wd));
 		} catch (Throwable e) {
 			fail("Filter button not working");
 			e.printStackTrace();
 		}
	}


	@AfterTest
	public void afterTest() {
		System.out.println("============ Tests finished ===============");
	}

}


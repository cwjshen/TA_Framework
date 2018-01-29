package com.revature.tests.vp;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.vp.BatchesCukesVP;

public class TestBatchesVP extends VPSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Batches VP Test");
		assertTrue(BatchesCukesVP.clickBatchesTab(wd));
	}
	
	@Test(priority=1, enabled=false)
	public void checkSectionHeaders() {
		assertTrue(BatchesCukesVP.allBatchesSectionExists(wd));
		assertTrue(BatchesCukesVP.createBatchSectionExists(wd));
		assertTrue(BatchesCukesVP.batchesTimelineSectionExists(wd));
	}
	
	@Test(priority=2)
	public void invalidateEmptyForm() {
		assertTrue(BatchesCukesVP.formIsEmpty(wd));
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Batches VP Test Complete");
	}
	
}

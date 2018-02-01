package com.revature.tests.vp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.vp.BatchesCukesVP;
import com.revature.hibernate.dao.BatchDaoImp;
import com.revature.model.Batch;
import com.revature.pom.vp.BatchesTabVP;

public class TestBatchesVP extends VPSuite {

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Batches VP Test");
		assertTrue(BatchesCukesVP.clickBatchesTab(wd));		
//		List<Batch> batches_to_add = new BatchDaoImp().getFullBatch();
//		BatchesCukesVP.insertAllBatchData(wd, batches_to_add);
		
		// BODY,LOGOUT
		BatchesTabVP.body(wd).click();
	}
	
	@Test(priority=1, enabled=true)
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
	
	@Test(priority=999999, enabled=true)
	public void refreshTest() {
		assertTrue(BatchesCukesVP.refreshPageVP(wd));
		assertTrue(BatchesCukesVP.createBatchSectionExists(wd));
	}
	
	@Test(priority=3, enabled=true)
	public void insertSingleBatch() {
		List<Batch> batches_to_add = new BatchDaoImp().getNBatches(1);
		assertNotNull(BatchesCukesVP.getBatchDummyData());
		assertTrue(BatchesCukesVP.insertBatchData(wd, batches_to_add));
		assertTrue(BatchesCukesVP.containsNewBatch(wd, batches_to_add));
	}

	@Test(priority=4, enabled=true)
	public void insertBatchStressTest() {
		List<Batch> batches_to_add = new BatchDaoImp().getFullBatch();
		assertNotNull(BatchesCukesVP.getBatchDummyData());
		assertTrue(BatchesCukesVP.insertAllBatchData(wd, batches_to_add));
		assertTrue(BatchesCukesVP.containsAllNewBatches(wd, batches_to_add));
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Batches VP Test Complete");
	}
	
}

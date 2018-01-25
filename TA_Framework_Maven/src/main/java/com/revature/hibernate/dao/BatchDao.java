package com.revature.hibernate.dao;

import java.util.List;
import com.revature.model.Batch;


public interface BatchDao {


	public void updateBatch(String batchName, String batchCurr,String batchTrainer, String batchLoc, String batchBuild,int batchRoom,
			String batchStart, String batchEnd);

	public void deleteBatch(String batchName);

	public List<Batch> getFullBatch();
	

}
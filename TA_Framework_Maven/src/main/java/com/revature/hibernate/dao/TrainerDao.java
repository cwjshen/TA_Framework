package com.revature.hibernate.dao;



import java.util.List;

import com.revature.model.Trainer;



public interface TrainerDao {

	public void updateTrainer(String fname, String lname,String resume, String skills,int id);
	public void deleteTrainer(int id);
	public List<Trainer> getAllTrainer();
	
	

}
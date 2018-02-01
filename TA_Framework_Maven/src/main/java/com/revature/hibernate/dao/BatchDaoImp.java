package com.revature.hibernate.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Batch;
import com.revature.util.HibernateUtil;

public class BatchDaoImp {

 
		@SuppressWarnings("unchecked")
		public List<Batch> getFullBatch(){
		      Session session = HibernateUtil.getSession().openSession();
		      @SuppressWarnings("unused")
			 Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
				List<Batch> batchs = session.createQuery("from Batch").list();
		         return batchs; 
		      } finally {
		         session.close(); 
		      }
		      
		   }
		   

		@SuppressWarnings("unchecked")
		public List<Batch> getNBatches(int n){
		      Session session = HibernateUtil.getSession().openSession();
		      @SuppressWarnings("unused")
			 Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
				List<Batch> batchs = session.createQuery("from Batch").setMaxResults(n).list();
		         return batchs; 
		      } finally {
		         session.close(); 
		      }
		      
		   }		

		/* Method to UPDATE salary for an employee */
		   public void updateBatch(String batchName, String batchCurr,String batchTrainer, String batchLoc, String batchBuild,int batchRoom, Date batchStart, Date batchEnd){
		      Session session = HibernateUtil.getSession().openSession();
		      Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		        
				Batch bat = (Batch)session.get(Batch.class, batchName); 
		         bat.setCurriculum(batchCurr);
		         bat.setTrainer(batchTrainer);
		         bat.setLocation(batchLoc);
		         bat.setBuilding(batchBuild);
		         bat.setRoom(batchRoom);
		         bat.setStart_date(batchStart);
		         bat.setEnd_date(batchEnd);
				 session.update(bat); 
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		   }
		   
		   /* Method to DELETE an employee from the records */
		  
		public void deleteBatch(String batchName){
		      Session session = HibernateUtil.getSession().openSession();
		      Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         Batch bat = (Batch)session.get(Batch.class, batchName); 
		         session.delete(bat); 
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		   }
		}

package com.revature.util;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Trainer;



public class TrainerDaoImp {

 
		   
		   /* Method to  READ all the batch data */
	     @SuppressWarnings("unchecked")
	    public List<Trainer> getAllTrainer(){
	      Session session = HibernateUtil.getSession().openSession();
	      @SuppressWarnings("unused")
		 Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
			List<Trainer> trains = session.createQuery("from Trainer").list();
	         return trains; 
	      } finally {
	         session.close(); 
	      }
	      
	   }
	   
		  	


		/* Method to UPDATE salary for an employee */
		   public void updateTrainer(String fname, String lname,String resume, String skills, int id){
		      Session session = HibernateUtil.getSession().openSession();
		      Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         Trainer tra = (Trainer)session.get(Trainer.class, id); 
		         tra.setFname(fname);
		         tra.setLname(lname);
		         tra.setResume(resume);
		         tra.setSkills(skills);
				 session.update(tra); 
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		   }
		   
		   /* Method to DELETE an employee from the records */
		   public void deleteTrainer(int id){
		      Session session = HibernateUtil.getSession().openSession();
		      Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         Trainer tra = (Trainer)session.get(Trainer.class, id); 
		         session.delete(tra); 
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		   } 
		}

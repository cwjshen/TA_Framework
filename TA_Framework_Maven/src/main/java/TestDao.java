import java.util.Iterator;

import com.revature.model.Batch;
import com.revature.hibernate.dao.BatchDaoImp;
import com.revature.hibernate.dao.TrainerDaoImp;

public class TestDao {

	public static void main(String[] args) {
		
		TrainerDaoImp tra = new TrainerDaoImp();

	     
	      /* List down all the employees */
		for (int i = 0; i < tra.getAllTrainer().size(); i++) {
	    	  System.out.println(tra.getAllTrainer().get(i));
	    	}
	            
	      
	      /* Update employee's records 
	      tra.updateTrainer("Olivia", "John", "Experience in programming", "java,sql,j2ee,php",2);
	      
	        Delete an employee from the database - 
	        tra.deleteTrainer(1); */

	      
	   BatchDaoImp batch = new BatchDaoImp();
	      
	      Iterator<Batch> it = batch.getFullBatch().iterator();
	      while (it.hasNext()) {
	        System.out.println((it.next()));
	      }
	      
	/*      for (int i = 0; i < batch.getFullBatch().size(); i++) {
	   	  System.out.println(batch.getFullBatch().get(i));
	     	}
	            
	       }

	        
	        // TODO: First create your model and add to models ArrayList, to prevent NullPointerException for trying this example

	        // Print the name from the list....
	     */   
	   }
	}

		




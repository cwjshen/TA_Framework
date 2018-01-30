package com.revature.pom.vp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VPSettingsTab {


	static WebElement e = null;
	public static WebElement getSettingsTabVP(WebDriver d) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a/span/span"));
		return e;
	}
	public static WebElement Timeline_Trainers_PP_VP(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"input_3\"]"));
		
		return e;
	}
	public static WebElement Reports_Outgoing_Grads_VP(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e  = d.findElement(By.xpath("//*[@id=\"input_4\"]"));
		return e ;
	}
	public static WebElement Reports_Candidates_Incoming_VP(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"input_5\"]"));
		return e;
	}
	public static WebElement Default_Batch_Location_VP(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"select_6\"]"));
		return e;
	}
	public static WebElement Default_Batch_Building_VP(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"select_8\"]"));
		return e;
	}
	public static WebElement Minimum_Batch_Size_VP(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"input_10\"]"));
		return e;
	}
	public static WebElement Maximum_Batch_Size_VP(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"input_11\"]"));
		return e;
	}
	public static WebElement Default_Batch_Length_VP(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"input_12\"]"));
		return e;
	}
	public static WebElement MinimumDayBetweenTrainerBatches_VP(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"input_13\"]"));
		return e;
	}

	public static WebElement SaveButton(WebDriver d) {
		try {
			Thread.sleep(1000);
		}	catch (InterruptedException e) {
				e.printStackTrace();
			}
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/section/button[1]/span"));
		return e;
			
		}

		public static String TimelineTrainers_PP(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		   String t = d.findElement(By.xpath("//*[@id=\"input_3\"]")).getAttribute("value");
		   System.out.println(t);
		   return t;
		}
		public static String ReportsOutgoing_Grads(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 String t  = d.findElement(By.xpath("//*[@id=\"input_4\"]")).getAttribute("value");
			 return t ;
		}
		public static String ReportsCandidates_Incoming(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String t = d.findElement(By.xpath("//*[@id=\"input_5\"]")).getAttribute("value");
			return t;
		}
		public static String DefaultBatch_Location(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 String t = d.findElement(By.xpath("//*[@id=\"select_6\"]")).getText();
			 return t;
		}
		public static String DefaultBatch_Building(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String t = d.findElement(By.xpath("//*[@id=\"select_8\"]")).getText();
			return t;
		}
		public static String MinimumBatch_Size(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String t = d.findElement(By.xpath("//*[@id=\"input_10\"]")).getAttribute("value");
			return t;
		}
		public static String MaximumBatch_Size(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    String t = d.findElement(By.xpath("//*[@id=\"input_11\"]")).getAttribute("value");
		    return t;
		}
		public static String DefaultBatch_Length(WebDriver d) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  String t = d.findElement(By.xpath("//*[@id=\"input_12\"]")).getAttribute("value");
			return t;
		}
		public static String MinimumDayBetweenTrainer_Batches(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  String t = d.findElement(By.xpath("//*[@id=\"input_13\"]")).getAttribute("value");
		  return t;
		}
		
	}
	



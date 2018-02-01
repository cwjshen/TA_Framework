package com.revature.pom.vp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CurriculaTabVP {

	static WebElement e = null;

	public static String getCurriculaTabValueVP(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String t = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a/span/span")).getText();
		return t;
	}

	public static WebElement getCurriculaTabVP(WebDriver d) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e =  d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a/span/span"));
		return e;
	}


	public static WebElement getCoreArrow(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"coreArrow\"]"));
		return e;
	}

	public static WebElement getFocusArrow(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"focusArrow\"]"));
		return e;
	}

	public static WebElement getSkillsArrow(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"skillArrow\"]"));

		return e;
	}

	public static WebElement getSkillName(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"input_1\"]"));

		return e;

	}

	public static WebElement getCreateButton(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"skill\"]/form/div/div/div"));

		return e;

	}

	public static WebElement getAddFocusButton(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[1]/md-toolbar/div/button[1]/md-icon"));

		return e;

	}

	public static WebElement deleteCoreCurricula(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[1]/button[2]/i"));

		return e;

	}

	public static WebElement deleteFocusCurricula(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[1]/button[2]/i"));

		return e;

	}

	public static WebElement confirmDeleteFocus(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[2]/span"));

		return e;

	}

	public static WebElement addButtonCore(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[1]/md-toolbar/div/button[1]/md-icon"));

		return e;
	}

	public static WebElement addCoreCurriculmName(WebDriver d) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.cssSelector("input[ng-model=\"curricI.name\"]"));

		//By.cssSelector("input[ng-model='form.address.city']"
		//<input aria-label="curriculumName" ng-model="curricI.name" class="ng-valid md-input ng-dirty ng-valid-parse
		//By.cssSelector("input#txtName[name=’taComment’]")
		////*[@id="focus"]/md-list/md-list-item[1]/button[1]/i
		return e;
	}
	
	public static WebElement editFocus(WebDriver d) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[1]/button[1]/i"));

		//By.cssSelector("input[ng-model='form.address.city']"
		//<input aria-label="curriculumName" ng-model="curricI.name" class="ng-valid md-input ng-dirty ng-valid-parse
		//By.cssSelector("input#txtName[name=’taComment’]")
		////*[@id="focus"]/md-list/md-list-item[1]/button[1]/i
		return e;
	}

	public static WebElement selectCoreCurriculmName(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		e = (d.findElement(By.cssSelector("#select_option_28 > div.md-container")));

		return e;

	}


	public static WebElement selectCoreCurriculmName2(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		e = (d.findElement(By.xpath("//*[@id=\"select_option_14\"]")));

		return e;

	}


	public static WebElement selectCoreCurriculmName3(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		e = (d.findElement(By.xpath("//*[@id=\"select_option_22\"]")));

		return e;

	}


	public static WebElement editCoreCurriculmName(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		e = (d.findElement(By.xpath("//*[@id=\"select_option_88\"]/div[2]")));

		return e;

	}


	public static WebElement editCoreCurriculmName2(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		e = (d.findElement(By.xpath("//*[@id=\"select_option_89\"]")));

		return e;

	}
	
	public static WebElement editfocusCurriculmName(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		e = (d.findElement(By.xpath("//*[@id=\"select_option_188\"]/div[2]")));

		return e;

	}


	public static WebElement editfocusCurriculmName2(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		e = (d.findElement(By.xpath("//*[@id=\"select_option_190\"]")));

		return e;

	}



	public static WebElement randomClick(WebDriver d) {
		//*[@id="focus"]/md-list/md-list-item[1]
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		e = (d.findElement(By.xpath("/html/body")));

		return e;
	}

	////*[@id="select_option_29"]/div[1]

	public static WebElement clickSkillsButton(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		e = (d.findElement(By.cssSelector("md-select[ng-model=\"curricI.skills\"]")));
		//*[@id="select_82"]
		//*[@id="select_4"]
		//*[@id="select_4"]
		return e;

	}

	public static WebElement selectSave(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[2]/span"));

		return e;
	}

	public static WebElement editButtonCurricula(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[1]/button[1]/i"));

		return e;
	}


	public static WebElement getCorCurriculaName(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[5]/div[1]/h3"));

		return e;

	}

	public static WebElement deletCorCurricula(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[2]/button[2]/i"));

		return e;
	}	
	
	public static WebElement deletFocuCurricula(WebDriver d) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e = d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[4]/button[2]/i"));

		return e;
	}	
	//*[@id="core"]/md-list/md-list-item[5]/div[1]/h3
	//*[@id="core"]/md-list/md-list-item[5]/button[2]/i
}








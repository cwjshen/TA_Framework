package com.revature.pom.vp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocationsVP {

	static WebElement e = null;

	public static WebElement findAddLocationButton(WebDriver d) {
		return d.findElement(By.id("locAdd"));
	}

	// Same XPath for Add Location name, Add Building name, Add Room name
	public static WebElement findNameField(WebDriver d) {
		return d.findElement(
				By.xpath("/html/body/div[3]/md-dialog/form/md-dialogue-content/div/div/md-input-container[1]/input"));
	}

	// Same XPath for Add Location city, Add Building city, Add Room city
	public static WebElement findCityField(WebDriver d) {
		return d.findElement(
				By.xpath("/html/body/div[3]/md-dialog/form/md-dialogue-content/div/div/md-input-container[2]/input"));
	}

	// Same XPath for Add Location city, Add Building city, Add Room city
	public static WebElement findStateDropDown(WebDriver d) {
		return d.findElement(By
				.xpath("/html/body/div[3]/md-dialog/form/md-dialogue-content/div/div/md-input-container[3]/md-select"));
	}

	// Same XPath for saving for Location/Building/Room
	public static WebElement saveForm(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialogue-actions/button"));
	}

	// iframe containing the form
	public static WebElement findIframe(WebDriver d) {
		return d.findElement(By.xpath("/html/body/iframe"));
	}
}
package com.revature.pom.vp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.util.WaitToLoad;

public class LocationsVP {

	static WebElement e = null;

	//For adding or editing
	public static WebElement findConfirmationMessage(WebDriver d) throws Throwable {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/md-toast/div/span"), 5);
	}

	//For deleting
	public static WebElement findDeleteMessage(WebDriver d) throws Throwable {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/md-toast[2]/div/span"), 5);
	}

	public static List<WebElement> getLocations(WebDriver d) {
		WebElement location_container = WaitToLoad.findDynamicElement(d,
				By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list"), 10);
		List<WebElement> locations = location_container
				.findElements(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list"));
		return locations;
	}

	public static WebElement findAddLocationButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.id("locAdd"), 10);
	}

	// Same XPath for Add Location name, Add Building name, Add Room name
	public static WebElement findLocationNameField(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.cssSelector("[ng-model='ldCtrl.location.name']"), 10);
	}

	// Same XPath for Add Location city, Add Building city, Add Room city
	public static WebElement findLocationCityField(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.cssSelector("[ng-model='ldCtrl.location.city']"), 10);
	}

	// Same XPath for Add Location city, Add Building city, Add Room city
	public static WebElement findLocationStateDropDown(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.cssSelector("[ng-model='ldCtrl.location.state']"), 10);
	}

	// Same XPath for saving for Location/Building/Room
	public static WebElement locationFormButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,
				By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]"), 10);
	}

	public static WebElement locationForm(WebDriver d) {
		// return WaitToLoad.findDynamicElement(d, By.name("locationForm"), 1); //THIS
		// MUST BE KEPT 1 SECOND
		return d.findElement(By.name("locationForm"));
	}

	// iframe containing the form
	// UNUSED/not working, replaced with locationFormClosed
	public static WebElement findIframe(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/iframe"), 10);
	}

	public static WebElement findLocationCheckBox(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,
				By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[1]/div[1]/div[1]/md-checkbox"), 10);
	}

	public static WebElement findBuildingCheckBox(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,
				By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list[1]/md-list-item[1]/div/div/md-checkbox"),
				10);
	}

	public static WebElement findAddBuildingButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.id("bldgAdd"), 10);
	}

	public static WebElement findAddRoomButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.id("roomAdd"), 10);
	}

	public static WebElement findBuildingNameField(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.cssSelector("[ng-model='bldgCtrl.building.name']"), 10);
	}

	public static WebElement findRoomNameField(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.cssSelector("[ng-model='rdCtrl.room.roomName']"), 10);
	}

	public static WebElement buildingFormButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,
				By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[1]"), 10);
	}

	public static WebElement buildingForm(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.name("buildingForm"), 5);
	}

	public static WebElement roomForm(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.name("roomForm"), 5);
	}

	public static WebElement findEditButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.id("locEdit"), 5);
	}

	public static WebElement findFirstBuilding(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,
				By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list[1]/md-list-item[1]/div/button"), 10);
	}

	public static WebElement findRoomCheckBox(WebDriver d) {
		// click on first building you can find first
		// then click on the first room you can find
		// there should be at least 1 room from the previous adding
		return WaitToLoad.findDynamicElement(d, By.xpath(
				"//*[@id=\"view\"]/md-card/md-content/md-list/md-list[1]/md-list-item[1]/div/div/md-list/md-list-item[1]/div/div/md-checkbox"),
				10);
	}
	
	public static WebElement findDeleteButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("//*[@id=\"view\"]/md-card/md-toolbar/button[5]"), 5);
	}
	
	public static WebElement confirmDelete(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("html/body/div[3]/md-dialog/div/md-dialog-actions/button"), 5);
	}
}
//If we need to use pure protractor to log in and do the Profile Tab test, we can use this
//Else, just continue using the WebDriver log in like the other Tests
/*
 describe('Profile Tab Protractor Test Login', function() {
 it('Should login', function() {
 var ptor = protractor.getInstance();
 var driver = ptor.driver;

 var findElementByName = function(name) {
 return driver.findElement(protractor.By.name(name));
 };

 driver.get(config.url);
 findElementByName('username').sendKeys("test.trainer@revature.com.int1");
 findElementByName('pw').sendKeys("trainer123");
 findElementByName('Login').click();
 });
 });
 */

//Alternate, independent login. Current working version.
//This is for running this protractor code by itself and not from the project.
//For testing the code invidually.
describe("Profile Tab Protractor Test (Open site from cmd): "
		+ "Go to site, login, click profile tab", function() {
	it("Should go to login page", function() {
		browser.waitForAngularEnabled(false);
		browser.get("https://dev.assignforce.revaturelabs.com");
		expect(
				browser.driver.findElement(by.name('Login')).getAttribute(
						"value")).toEqual("Log In to Sandbox");
	});
});

describe("Profile Tab Protractor Test (Login)", function() {
	it("Should login",
			function() {
				// driver.get(config.url);
				element(by.name('username')).sendKeys(
						"test.trainer@revature.com.int1");
				element(by.name('pw')).sendKeys("trainer123");
				element(by.name('Login')).click();
				// browser.waitForAngularEnabled(true);
			});

});

describe("Profile Tab Protractor Test (Click Profile Tab)", function() {
	it('Should be able to switch to Profile Tab', function() {
		browser.driver.sleep(10000);
		element(by.name("profile")).click();
		// If tab is clicked, that tab's class should be changed to this instead
		// of unselected
		expect(element(by.name("profile")).getAttribute("aria-selected"))
				.toEqual("true");
	});
});

describe("Profile Tab Protractor Test (Profile Subsection)", function() {
	// var firstNameField =
	// element(by.xpath("/html/body/div/div[2]/div/md-card[1]/md-content/div/div/form/md-input-container[1]/input"));
	// var lastNameField =
	// element(by.xpath("/html/body/div/div[2]/div/md-card[1]/md-content/div/div/form/md-input-container[2]/input"));

	var firstNameField = element(by.model("pCtrl.trainer.firstName"));
	var lastNameField = element(by.model("pCtrl.trainer.lastName"));

	// var firstNameField = element(by.id("//*[@id='input_1']"));
	// var lastNameField = element(by.id("//*[@id='input_2']"));
	// var formTest = element(by.name("nameForm"));
	it("Should input and detect that input is valid / field is not empty",
			function() {
				browser.driver.sleep(11000);

				// expect(formTest.getAttribute("name")).toEqual("nameForm");
				firstNameField.sendKeys("Sayaka");
				lastNameField.sendKeys("Miki");

				expect(firstNameField.getText()).toContain("Sayaka");
				//OR TRY:
				expect(firstNameField.getAttribute()).toEqual("Sayaka"));
				
				/*
				firstNameField.getAttribute("").then(
						function(value) {
							expect(value.toBe("false"));
						});*/
				// expect(lastNameField.getAttribute("aria-invalid").toEqual("false"));
			});
	/*
	 * it("When I change tabs away and change back to Profile Tab, the new names
	 * should be there", function(){ element(by.name("locations")).click();
	 * element(by.name("profile")).click();
	 * 
	 * expect(firstNameField.getText()).toEqual("Sayaka"); });
	 */
});
/*
 * // Test suite for clicking Profile Tab describe('Profile Tab Navbar Click',
 * function(){ var profileTab = element(by.href("profile"));
 * 
 * it('Should be able to switch to Profile Tab', function(){ profileTab.click(); //
 * If tab is clicked, that tab's class should be changed to this instead // of
 * unselected expect(profileTab.getAttribute("class").toEqual( "_md-nav-button
 * md-accent md-button ng-scope md-ink-ripple md-active md-primary")); }); });
 * 
 */
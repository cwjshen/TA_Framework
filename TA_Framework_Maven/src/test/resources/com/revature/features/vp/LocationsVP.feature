
@tag
Feature: Locations VP feature
  I want to use this template for my feature file

   @NavigateToLocationsTab
  Scenario Outline: Check if in Locations Tab for VP
    Given That I am initially in the Overview tab 
    When Click the Locations tab <webdriver>
    Then I should see the Revature HQ drop down <webdriver>
    And New York City drop down <webdriver>

 @AddLocation
	 Scenario Outline: Check Add Location
	 Given That I am in the Locations tab
	 When Click the Add Location button <webdriver>
	 And Fill out Location form and submit
	 Then I should see the new Location <webdriver>
	 
 @AddBuilding
	 Scenario Outline: Check Add Building
	 Given That I am in the Locations tab
	 When Click the Add Building button <webdriver>
	 And Fill out Building form and submit
	 Then I should see the new Building <webdriver>

@AddRoom
	 Scenario Outline: Check Add Room
	 Given That I am in the Locations tab
	 When Click the Add Room button <webdriver>
	 And Fill out Room form and submit
	 Then I should see the new Room <webdriver>


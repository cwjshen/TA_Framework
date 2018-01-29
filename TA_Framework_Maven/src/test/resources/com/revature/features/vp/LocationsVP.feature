
@tag
Feature: Locations VP feature
  I want to use this template for my feature file

   @tag1
  Scenario Outline: Check if in Locations Tab for VP
    Given The Locations Tab is selected <webdriver>
    When Click the Locations tab <webdriver>
    Then I should see the Revature HQ drop down <webdriver>
    And New York City drop down <webdriver>

 @tag2
	 Scenario Outline: Check Add Location
	 Given The Locations Tab is selected <webdriver>
	 When Click the Add Location button <webdriver>
	 And Fill out Location form and submit <webdriver>
	 Then I should see the new Location <webdriver>
	 
 @tag3
	 Scenario Outline: Check Add Building
	 Given The Locations Tab is selected <webdriver>
	 When Click the Add Building button <webdriver>
	 And Fill out Building form and submit <webdriver>
	 Then I should see the new Building <webdriver>

@AddRoom
	 Scenario Outline: Check Add Room
	 Given The Locations Tab is selected <webdriver>
	 When Click the Add Room button <webdriver>
	 And Fill out Room form and submit <webdriver>
	 Then I should see the new Room <webdriver>


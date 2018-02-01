
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
	 Then I should see the success message <webdriver>
	 And I should see the new Location <webdriver>
	 
	 @tag2.1
	 Scenario Outline: Check Add Location using a deleted name
	 Given The Locations Tab is selected <webdriver>
	 When Click the Add Location button <webdriver>
	 And Fill out Location form with an old deleted name and submit <webdriver> //this will fail
	 Then I should see the success message <webdriver>
	 And I should see the new Location <webdriver>
	 
 @tag3
	 Scenario Outline: Check Add Building
	 Given The Locations Tab is selected <webdriver>
	 And Click a Check Box next to a Location <webdriver> //span[@aria-label="Toggle  Mami's House, VA"
	 When Click the Add Building button <webdriver>
	 And Fill out Building form and submit <webdriver>
	 Then I should see the success message <webdriver>
	 And I should see the new Building <webdriver>
	 
	  @tag3.1
	 Scenario Outline: Check Add Building using a deleted name
	 Given The Locations Tab is selected <webdriver>
	 And Click a Check Box next to a Location <webdriver>
	 When Click the Add Building button <webdriver>
	 And Fill out Building form with an old deleted name and submit <webdriver> //this will fail
	 Then I should see the success message <webdriver>

@tag4
	 Scenario Outline: Check Add Room
	 Given The Locations Tab is selected <webdriver>
	 And Click a Check Box next to a Building <webdriver>
	 When Click the Add Room button <webdriver>
	 And Fill out Room form and submit <webdriver>
	 Then I should see the success message <webdriver>
	 
	 	  @tag4.1
	 Scenario Outline: Check Add Room using a deleted name
	 Given The Locations Tab is selected <webdriver>
	 And Click a Check Box next to a Building <webdriver>
	 When Click the Add Room button <webdriver>
	 And Fill out Room form with an old deleted name and submit <webdriver> //this will pass
	 Then I should see the success message <webdriver>
	 
@tag5
Scenario Outline: Update Location name with new name
Given The Locations Tab is selected <webdriver>
And Click a Check Box next to a Location <webdriver>
When Click the Edit button <webdriver>
And Fill out Location form with new name, city, state, and submit <webdriver>
Then I should see the success message <webdriver>

@tag5.1
Scenario Outline: Update Location name to an existing or deleted name
Given The Locations Tab is selected <webdriver>
And Click a Check Box next to a Location <webdriver>
When Click the Edit button <webdriver>
And Fill out Location form with original name, city, state, and submit <webdriver>
Then I should see the success message <webdriver>

@tag5.2
Scenario Outline: Update Location name to a name a location was edited to, but not created with
Given The Locations Tab is selected <webdriver>
And Click a Check Box next to a Location <webdriver>
When Click the Edit button <webdriver>
And Fill out Location form with previous edited name, city, state, and submit <webdriver> //this will fail
Then I should see the success message <webdriver>

@tag6
Scenario Outline: Update Building name with new name
Given The Locations Tab is selected <webdriver>
And Click a Check Box next to a Building <webdriver>
When Click the Edit button <webdriver>
And Fill out Building form with new name and submit <webdriver>
Then I should see the success message <webdriver>

@tag6.1
Scenario Outline: Update Building name to an existing or deleted name
Given The Locations Tab is selected <webdriver>
And Click a Check Box next to a Building <webdriver>
When Click the Edit button <webdriver>
And Fill out Building form with original name and submit <webdriver>
Then I should see the success message <webdriver>

@tag6.2
Scenario Outline: Update Building name to a name a building was edited to, but not created with
Given The Locations Tab is selected <webdriver>
And Click a Check Box next to a Building <webdriver>
When Click the Edit button <webdriver>
And Fill out Building form with previous edited name and submit <webdriver> //this will fail
Then I should see the success message <webdriver>

@tag7
Scenario Outline: Update Room name with new name
Given The Locations Tab is selected <webdriver>
When Click the first building drop down to expand <webdriver>
And Click a Check Box next to a Room <webdriver>
And Click the Edit button <webdriver>
And Fill out Room form with new name, city, state, and submit <webdriver>
Then I should see the success message <webdriver>

@tag7.1
Scenario Outline: Update Room name to an existing or deleted name
Given The Locations Tab is selected <webdriver>
When Click the first building drop down to expand <webdriver>
And Click a Check Box next to a Room <webdriver>
And Click the Edit button <webdriver>
And Fill out Room form with original name, city, state, and submit <webdriver>
Then I should see the success message <webdriver>

@tag7.2
Scenario Outline: Update Room name to a name a room was edited to, but not created with
Given The Locations Tab is selected <webdriver>
When Click the first building drop down to expand <webdriver>
And Click a Check Box next to a Room <webdriver>
And Click the Edit button <webdriver>
And Fill out Room form with previous edited name, city, state, and submit <webdriver> //this will fail
Then I should see the success message <webdriver>

@tag8
Scenario Outline: Delete Room
Given The Locations Tab is selected <webdriver>
When Click the first building drop down to expand <webdriver>
And Click a Check Box next to a Room <webdriver> 
And Click the Delete button <webdriver>
And Submit the Delete <webdriver>
Then I should see the success message <webdriver>

@tag8.1
Scenario Outline: Delete Buiding
Given The Locations Tab is selected <webdriver>
When Click a Check Box next to a Building <webdriver>
And Click the Delete button <webdriver>
And Submit the Delete <webdriver>
Then I should see the success message <webdriver>

@tag8.2
Scenario Outline: Delete Location
Given The Locations Tab is selected <webdriver>
When Click a Check Box next to a Location <webdriver>
And Click the Delete button <webdriver>
And Submit the Delete <webdriver>
Then I should see the success message <webdriver>
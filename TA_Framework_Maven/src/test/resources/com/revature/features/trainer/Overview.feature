#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Overview Tab for trainers
  Assignforce Overview tab scenarios

  @tag1
  Scenario Outline: Check if in Overview Tab for trainer
    Given That I am in the Overview tab 
    Given I am logged in as a trainer <webdriver>
    When Click the Overview tab <webdriver>
    Then I should see the Export to CSV button <webdriver>
    And Fiter button <webdriver>
    
  @tag2
  Scenario Outline: Check if CSV downloaded
		Given That I am in the Overview tab
		When I click the CSV button <webdriver>
		Then The download should start
		And it should be in the download location
		
	@tag3
	Scenario Outline: Click the Name button to sort data ASC/DSC
		Given That I am in the Overview tab
		When I click the name button <webdriver>
		Then The names should be filtered in ASC order <webdriver>
		And If I click the name button again <webdriver>
		Then The names should be filtered in DSC order <webdriver>
   	
  @tag4
	Scenario Outline: Click the Curriculum button to sort data ASC/DSC
		Given That I am in the Overview tab
		When I click the curriculum button <webdriver>
		Then The curricula should be filtered in ASC order <webdriver>
		And If I click the curriculum button again <webdriver>
		Then The curricula should be filtered in DSC order <webdriver>
		
	@tag5
	Scenario Outline: Click the Trainer button to sort data ASC/DSC
		Given That I am in the Overview tab
		When I click the trainer button <webdriver>
		Then The trainers should be filtered in ASC order <webdriver>
		And If I click the trainer button again <webdriver>
		Then The trainer should be filtered in DSC order <webdriver>
		
	@tag6
	Scenario Outline: Click the Location button to sort data ASC/DSC
		Given That I am in the Overview tab
		When I click the location button <webdriver>
		Then The locations should be filtered in ASC order <webdriver>
		And If I click the locations button again <webdriver>
		Then The locations should be filtered in DSC order <webdriver>
		
	@tag7
	Scenario Outline: Click the Building button to sort data ASC/DSC
		Given That I am in the Overview tab
		When I click the building button <webdriver>
		Then The buildings should be filtered in ASC order <webdriver>
		And If I click the building button again <webdriver>
		Then The buildings should be filtered in DSC order <webdriver>
		
	@tag8
	Scenario Outline: Click the Room button to sort data ASC/DSC
		Given That I am in the Overview tab
		When I click the room button <webdriver>
		Then The rooms should be filtered in ASC order <webdriver>
		And If I click the room button again <webdriver>
		Then The rooms should be filtered in DSC order <webdriver>
		
	@tag9
	Scenario Outline: Click the Start Date button to sort data ASC/DSC
		Given That I am in the Overview tab
		When I click the start button <webdriver>
		Then The start dates should be filtered in ASC order <webdriver>
		And If I click the start button again <webdriver>
		Then The start dates should be filtered in DSC order <webdriver>
		
	@tag10
	Scenario Outline: Click the End Date button to sort data ASC/DSC
		Given That I am in the Overview tab
		When I click the end button <webdriver>
		Then The end dates should be filtered in ASC order <webdriver>
		And If I click the end button again <webdriver>
		Then The end dates should be filtered in DSC order <webdriver>

 
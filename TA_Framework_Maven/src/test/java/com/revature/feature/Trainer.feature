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
Feature: Trainers Tab for trainers
  Assignforce Trainers tab scenarios

  @tag1
    Scenario: Check if in Trainers Tab for trainer
    Given That I am in the Trainers tab 
    When Click the Trainers tab <webdriver>
    Then I should see the View PTO Calendar button<webdriver>
    And Download Resume button <webdriver>
    
  @tag2
    Scenario: Check if PTO Calendar button works
    Given That I am in the Trainers tab 
    When Click the View PTO Calendar button <webdriver>
    Then I should see the PTO Calendar<webdriver>
    
  @tag3
  	Scenario: Checking if the new PTO request button on the PTO calendar works
  	Given that the PTO calendar is open
  	When I click the new PTO request button
  	Then A new window should appear which allows the user to enter a start date and an end date 
 
   @tag4
  	Scenario: Checking if the cancel button on the PTO calendar works
  	Given that the PTO calendar is open
  	When I click the cancel button
  	Then The PTO calendar should close
  	And I should see the Trainers tab	
    
  @tag5
    Scenario: Check if clicking on a trainer brings you to their profile
    Given That I am in the Trainers tab 
    When I click on a trainer <webdriver>
    Then I should see that trainers profile page<webdriver> 
    
  @tag6
    Scenario: Check if clicking on download resume button works
    Given That I am in the Trainers tab 
    When I click on the download resume button on a given trainer <webdriver>
    Then the download should start<webdriver>
    And I should see the file in the download location
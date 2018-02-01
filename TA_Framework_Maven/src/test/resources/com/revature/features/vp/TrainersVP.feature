#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario: List of steps for data-driven as an Examples and <placeholder>
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
Feature: Trainers Tab for VP
  Assignforce Trainers tab scenarios

  @tag1
    Scenario Outline: Check if in Trainers Tab for VP
    Given That I am logged in as a trainer VP <webdriver>
    When I click the Trainers tab <webdriver>
    Then I should see the View PTO Calendar button<webdriver>
    And Add Trainer button <webdriver>
    
  @tag2
    Scenario Outline: Check if the Add trainer button works
    Given That I am in the Trainers tab <webdriver>
    When Click the add trainer button <webdriver>
    Then A new window should appear which allows the user to enter a first name and last name<webdriver>  
  
  @tag3
    Scenario Outline: Check if I can enter text into the first name text box in the Add Trainers popup
    Given That the add trainer popup window is open <webdriver>
    When I click on the first name text box <webdriver>
    Then I should be able to enter text into the text box <webdriver>
  
  @tag4
    Scenario Outline: Check if I can enter text into the last name text box in the Add Trainers popup
    Given That the add trainer popup window is open <webdriver>
    When I click on the last name text box <webdriver>
    Then I should be able to enter text into the text box <webdriver>

  @tag5
    Scenario Outline: Check if the save button in the add trainers popup adds a new trainer 
    Given That the add trainer popup window is open <webdriver>
    And That there is text in the first and last name text boxes <webdriver>
    When I click on the save button <webdriver>
    Then A new trainer with the entered first and last names should appear under Inactive trainers <webdriver>

  @tag6
  	Scenario Outline: Checking if the cancel button on the add trainers popup works
  	Given that the add trainers popup window is showing <webdriver>
  	When I click the cancel button <webdriver>
  	Then The add trainers wndow should close <webdriver>
  	And I should see the Trainers tab	<webdriver>
  
  @tag7
    Scenario Outline: Check if clicking on download resume button works
    Given That I am in the Trainers tab <webdriver>
    When I click on the download resume button on a given trainer <webdriver>
    Then the download should start<webdriver>
    And I should see the file in the download location <webdriver>
    
  @tag8
    Scenario Outline: Check if the deactivate trainer button works
    Given That I am in the Trainers tab <webdriver>
    When Click the deactivate trainer button <webdriver>
    Then The deactivated trainer should not appear under trainers <webdriver>
    And The deactivated trainer should appear under inactive trainers <webdriver> 
  	
  @tag9
    Scenario Outline: Check if the reactivate trainer button works
    Given That I am in the Trainers tab <webdriver>
    When Click the reactivate trainer button <webdriver>
    Then The reactivated trainer should appear under trainers <webdriver>
   And The reactivated trainer should not appear under inactive trainers <webdriver>
   
  @tag10
    Scenario Outline: Check if clicking on a trainer brings you to their profile
    Given That I am in the Trainers tab <webdriver>
    When I click on a trainer <webdriver> 
    Then I should see that trainers profile page<webdriver> 
    
  @tag11
    Scenario Outline: Check if PTO Calendar button works
    Given That I am in the Trainers tab <webdriver>
    When Click the View PTO Calendar button <webdriver>
    Then I should see the PTO Calendar<webdriver> 
    
  @tag12
  	Scenario Outline: Checking if the new PTO request button on the PTO calendar works
  	Given that the PTO calendar is open <webdriver>
  	When I click the new PTO request button <webdriver>
  	Then A new window should appear which allows the user to enter a start date and an end date <webdriver>
    
  @tag13
  	Scenario Outline: Checking if the cancel PTO request button on the PTO calendar works
  	Given that the add PTO request popup is open <webdriver>
  	When I click the cancel PTO request button <webdriver>
  	Then I should see the PTO Calendar window <webdriver>	
  	
  @tag14
  	Scenario Outline: Checking if selecting a start date in the PTO request window works
  	Given that the add PTO request popup is open <webdriver>
  	When I click the start date text box <webdriver>
  	Then A drop down calendar should appear which allows me to select a date <webdriver>	
 
   @tag15
  	Scenario Outline: Checking if selecting an end date in the PTO request window works
  	Given that the add PTO request popup is open <webdriver>
  	When I click the end date text box <webdriver>
  	Then A drop down calendar should appear which allows me to select a date <webdriver> 
  	
  @tag16
  	Scenario Outline: Checking if the send button in the PTO request window works
  	Given that the add PTO request popup is open <webdriver>
  	And that there are dates in the start date and end date boxes
  	When I click the send <webdriver>
  	Then I should be redirected to a google signin page <webdriver>   	
 
   @tag17
  	Scenario Outline: Checking if the cancel button on the PTO calendar works
  	Given that the PTO calendar is open <webdriver>
  	When I click the cancel button <webdriver>
  	Then The PTO calendar should close <webdriver>
  	And I should see the Trainers tab	<webdriver>
   
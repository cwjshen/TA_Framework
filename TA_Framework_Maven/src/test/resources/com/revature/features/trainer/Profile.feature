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
Feature: Profile Tab for trainers
  Assignforce Profile tab scenarios

  @tag1
  Scenario: Navigate to Profile tab
    Given I am logged in as trainer  
    When I click on the Profile tab
    Then I should see first name and last name text boxes
    And Add/update resume button

  @tag2
  Scenario: Click the first name text box
    Given I am on the profile tab 
    When I click the first name text box
    Then A cursor should appear in the text box
    And I should be able to type into it
    
  @tag3
  Scenario: Enter a value into the first name text box
    Given I am on the profile tab 
    And I clicked on the first name text box
    When I type in a value
    Then that value should appear in the text box
    
  @tag4
  Scenario: Click the last name text box
    Given I am on the profile tab 
    When I click the last name text box
    Then A cursor should appear in the text box
    And I should be able to type into it 
    
  @tag5
  Scenario: Enter a value into the last name text box
    Given I am on the profile tab 
    And I clicked on the last name text box
    When I type in a value
    Then that value should appear in the text box       

  @tag6
  Scenario: Click the Add/Update Resume button
    Given I am on the profile tab 
    When I click on the add/update resume button
    Then A new window should appear
    And I should be able to choose a file to upload from my pc     
    
  @tag7
  Scenario: Click the Update Resume button
    Given I am on the profile tab 
    And I selected a resume from my pc
    When I click on the update resume button
    Then My new resume should file name should appear
    
  @tag8
  Scenario: Click on a skill to add
    Given I am on the profile tab 
    When I click on a skill to add
    Then The skill that was clicked should be removed from the Select a skill section
    And The skill should appear under the Current skills section     
    
  @tag9
  Scenario: Click on a current skill to remove
    Given I am on the profile tab 
    When I click on a current skill
    Then The skill that was clicked should be removed from the current skill section
    And The skill should appear in the Select a skill section     
    
  @tag10
  Scenario: Click on the save skills button
    Given I am on the profile tab 
    When I click on save skills button
    Then Skills listed under the current skills should be saved to your profile
    
  @tag11
  Scenario: Click on the add certifications button
    Given I am on the profile tab 
    When I click on the add certification button
    Then A new window should pop up
    And I should be able to choose a file from my pc    
    
  @tag12
  Scenario: Click on the certification name text box
    Given I am on the profile tab 
    When I click on the certification name text box
    Then A cursor should appear in the text box
    And I should be able to type into it     
    
  @tag13
  Scenario: Enter a value into the certification name text box
    Given I am on the profile tab 
    And I clicked on the certification name text box
    When I type in a value
    Then that value should appear in the text box
    
  @tag14
  Scenario: Click the Update certification button
    Given I am on the profile tab 
    And I selected a certification from my pc
    When I click on the update button
    Then My new certification should appear under certifications   
    
  @tag15
  Scenario: Click on the remove certifications button
    Given I am on the profile tab 
    When I click on the remove certification button
    Then The selected certification should be removed from certifications section
    
   @tag16
    Scenario: Click on a certification
    Given I am on the profile tab 
    When I click on a certification
    Then I should see some information

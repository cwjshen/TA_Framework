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

Feature: I want to check the VP Curricula Tab
  
	@tag1
	Scenario Outline: Verify that the VP Curricula feature works
	    Given I want to click on the curricula tab <webdriver>
	    And Check the first tab button to make sure it works <webdriver>
	    When I click the button it should toggle up or down <webdriver>
	    Then I click the other toggle button <webdriver>
	    
  @tag2
  Scenario Outline: Verify that the VP Curricula Settings is working
    Given then I got to the bottom of the page in curricula<webdriver>
    When I click the skills button to add skills in curricula <webdriver>
    And then I click the create button in curricula<webdriver>
    Then I click the plus button to add new curricula <webdriver>
    Then I re-click the tab buttons curricula<webdriver>
    
   @tag3
   Scenario Outline: Add new Curriculua
    Given I click the plus button <webdriver>
    When I add the Curriculum Name <webdriver>
    Then I select a skill <webdriver>
    Then I click the save button to save the new curricula <webdriver>
    Then I click the delete button in curricula <webdriver>
    Then I click the edit button in curricula<webdriver>
    Then I change the curricula <webdriver>
    Then I change the skills curricula<webdriver>
    Then I save the changes curricula<webdriver>
    Then I reload the page curricula<webdriver>
    
    
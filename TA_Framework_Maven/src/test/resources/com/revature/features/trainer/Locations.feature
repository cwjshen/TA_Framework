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
Feature: Locations Tab for VP
  Assignforce Locations tab scenarios

  @tag1
  Scenario Outline: Check if in Locations Tab for trainer
    Given The Locations Tab is selected
    Then I should see the Revature HQ drop down <webdriver>
    And New York City drop down <webdriver>

	 @tag2
	 Scenario Outline: Check if clicking drop downs hide/close
	 Given The Locations Tab is selected
	 Given Revature HQ and New York City are expanded
	 When Click the Revature HQ and New York City drop downs to close <webdriver>
	 Then Revature HQ and Yew York City style should be display none, meaning hidden <webdriver>
 
	 @tag3
	 Scenario Outline: Check if clicking drop downs unhide/expand
	 Given The Locations Tab is selected
	 Given Revature HQ and New York City are hidden
	 When Click the Revature HQ and New York City drop downs to expand <webdriver>
	 Then Revature HQ and Yew York City style should be display block, meaning expanded <webdriver>
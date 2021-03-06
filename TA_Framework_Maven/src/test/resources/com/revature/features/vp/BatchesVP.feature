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
Feature: Batches Tab 
  Feature file for batches tab

  Scenario Outline: Check that I am in the batches tab
    Given that I click the batches tab <webdriver>
		Then I should see the Create New Batch section <webdriver>
		Then I should see the All Batches section <webdriver>
		Then I should see the Batch Timeline section <webdriver>

  Scenario Outline: Invalidate Empty Batch Form
    Given that the batches form is empty <webdriver>
    When I click the create batch button <webdriver>
		Then All batches should not contain a new batch <webdriver>
		
	Scenario Outline: Refreshing the page
		Given that I refresh the page <webdriver>
		Then I should see the Create New Batch Section <webdriver>
		
	Scenario Outline: Creating a new batch from database dummy data
		Given that I pull dummy batch data from the database <webdriver>
		When I insert a single batch data <webdriver> <batches>
		When I click the create batch button <webdriver>
		Then All batches should contain the new batch <webdriver>
		
	Scenario Outline: Creating multiple batches stress test
		Given that I pull dummy batch data from the database <webdriver>
		When I insert all the batch data <webdriver> <batches>
		Then All batches should contain all new batches <webdriver>		

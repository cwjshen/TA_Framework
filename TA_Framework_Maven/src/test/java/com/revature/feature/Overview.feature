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
  Scenario: Check if CSV downloaded
		Given That I am in the Overview tab
		When I click the CSV button <webdriver>
		Then The download should start
		And it should be in the download location
   	

 
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
Feature: Reports Tab for trainers
  Assignforce Reports tab scenarios

  @tag1
  Scenario: Check if in Reports Tab for trainer
    Given That I am in the Reports tab 
    When Click the Reports tab <webdriver>
    Then I should see the Add new card button<webdriver>
    And Export to CSV button <webdriver>
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
Feature: VP Settings Tab
 

  @tag1
  Scenario: Checking VP Settings in Setting Tab
    Given I want to check the values on the setting tab <Webdriver>
    When I click the Timeline Trainers Per Page <Webdriver>
    When I click reports outgoing grads<Webdriver>
    When I click reports candidates incoming <Webdriver>
    When I click default batch location <Webdriver>
    When I click default batch building <Webdriver>
    When I click minimum batch size <Webdriver>
    When I click maximum batch size <Webdriver>
    When I click default batch length<Webdriver>
    When I click Minimum Day Between Trainer<Webdriver>
    Then I click the save button  <Webdriver>
    

  

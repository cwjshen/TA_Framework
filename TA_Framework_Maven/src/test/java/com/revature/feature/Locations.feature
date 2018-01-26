Feature: Locations Tab for trainers
  Assignforce Overview tab scenarios

  @tag1
  Scenario Outline: Check if in Locations Tab for trainer
    Given That I am in the Overview tab 
    Given I am logged in as a trainer <webdriver>
    When Click the Locations tab <webdriver>
    Then I should see the Revature HQ drop down <webdriver>
    And New York City drop down <webdriver>

 
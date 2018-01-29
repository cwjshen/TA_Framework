Feature: Locations Tab for trainers
  Assignforce Locations tab scenarios

  @tag1
  Scenario Outline: Check if in Locations Tab for trainer
    Given That I am initially in the Overview tab 
    When Click the Locations tab <webdriver>
    Then I should see the Revature HQ drop down <webdriver>
    And New York City drop down <webdriver>

	 @tag2
	 Scenario Outline: Check if clicking drop downs hide/expand
	 Given That I am in the Locations tab
	 Given Revature HQ and New York City are expanded
	 When Click the Revature HQ and New York City drop downs to close <webdriver>
	 Then Revature HQ and Yew York City style should be display none, meaning hidden <webdriver>
 
	 @tag3
	 Scenario Outline: Check if clicking drop downs unhide/expand
	 Given That I am in the Locations tab
	 Given Revature HQ and New York City are hidden
	 When Click the Revature HQ and New York City drop downs to expand <webdriver>
	 Then Revature HQ and Yew York City style should be display block, meaning expanded <webdriver>
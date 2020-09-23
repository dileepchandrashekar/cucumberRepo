Feature: Search and Place order for vegetables

@SmokeTest
Scenario: Search for items and Validate results
Given User is on GreenKart Landing Pages
When User searched for "Cucumber" vegetables
Then "Cucumber" results are displayeds 


@RegressionTest
Scenario Outline: Search for items and then move to checkout page
Given User is on GreenKart Landing Pages
When User searched for <Name> vegetables
And Added items to carts
And User proceeded to checkout page for purchases
Then Verify selected <Name> items are displayed in checkout pages  

Examples:
|Name    |
|Brinjal |
|Beetroot|
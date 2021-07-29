Feature: Seach and place order for vegetables

@SeleniumTest
  Scenario: Search for items and validate results
   Given User is on Greencart Landing page
    When User search for Cucumber vegetables
    Then "Cucumber" results are displayed

  @SeleniumTest
  Scenario Outline: Search for items and validate results
   Given User is on Greencart Landing page
    When User search for <Name> vegetables
    Then "Brinjal" results are displayed
    Examples:
    |Name|
    |Brinjal|    
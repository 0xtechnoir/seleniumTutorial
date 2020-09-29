Feature: Selenium Homepage
This feature verifies the functionality on Selenium Homepage

Scenario: Check that navigation elements on Selenium Homepage are displayed
Given I launch Chrome browser
When I open selenium Homepage
Then I verify that the header navbar is displayed
And the page displays the footer nav links
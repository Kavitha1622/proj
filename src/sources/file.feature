Feature: feature to test google search functionality
Scenario: Validate google search is  working

Given browser window is open
And user is on google is open
When user enters an text in search box
And click on search button
Then user is navigated to search results
And we get result
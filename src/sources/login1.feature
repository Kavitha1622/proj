@tag
Feature:  check login functionality


  

  Scenario: I am on the login page
    Given I want to open browser
    And i am on the login page
    When  enter username 
    And  enter password
    And clicks an login button
   Then I should be logged in





 Feature: Login functinality
 
  Scenario Outline: Multiple data
    Given I want to open browser
    And I want to navigate to login page
    When data is <username> and <password>
    And click on login button
    Then check whether user is login or not

    Examples: 
      | username | password | 
      |  Admin   |    admin | 
      |  Admin    |   admin123 | 

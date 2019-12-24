Feature: Login with multiple user by parameterization

Scenario: Website is launched
Given Site is launched here
 
  Scenario Outline: User login with multiple scanrios
    Given Webshop site is launched as syso
    Then user clicks on login button again
    And user enters the username "<uname>"
    Then user enters his/her password "<pwd>"
    Then clicks on login button again

    Examples: 
      | uname                 | pwd    |
      | rouhansingh@gmail.com | rohan123 |
      | rohansingh@gmail.com  | rohan12  |
      | rohan12@gmail.com     | rohan1   |

Feature: Login into application

  Scenario: Login with valid user and  valid password
    Given the user is on the login page
    And the user fills login equal "robson"
    And the user fills password equal "agapito"
    When the user clicks on Login button
    Then the user should see "Success Login!" into success page


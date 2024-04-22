Feature: Login Page

  @login
  Scenario: I want to Login
    Given I am on login screen and enter user pass
    Then I click on login button
    And I am landing on the admin dashboard screen


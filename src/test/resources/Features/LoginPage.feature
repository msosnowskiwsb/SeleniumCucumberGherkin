Feature: Test OrangeHRM Login Page

  Scenario: Check login with wrong credentials
    Given Open login page
    When User enters username i password
    And Click on login button
    Then The validation message is displayed
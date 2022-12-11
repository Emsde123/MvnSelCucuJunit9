# We can make @run global so it's applied to all the scenarios in this feature file.
# just changed it to @regression because it makes more sense.
# also added @login tag since we're working with login functionality.
@regression @login
Feature: This feature file will validate Login Page functionality.


#  The run tag is used to connect with the TestRunner class
@smoke @positive
  Scenario: User should be able to verify successful login with valid credentials
    Given user navigates to HRM Login Page
#    When user enters username
#    Then user enters password
   When user enters "yoll-student" username
   Then user enters "Bootcamp5#" password
    Then user clicks on login button
    And user should be able to verify account name on HRM homepage

@negative
  Scenario: User should not be able to login with invalid credentials
    Given user navigates to HRM Login Page
#    When user enters invalid username
#    Then user enters invalid password
  When user enters "InvalidUsername" username
  Then user enters "InvalidPassword" password
    Then user clicks on login button
    And user validates "Invalid credentials" error message

  @negative
  Scenario: User should not be able to login with empty username
    Given user navigates to HRM Login Page
#    When user enters empty username
#    Then user enters invalid password
    When user enters "" username
    Then user enters "InvalidPassword" password
    Then user clicks on login button
    And user validates "Username cannot be empty" error message


  @negative
  Scenario: User should not be able to login with empty password
    Given user navigates to HRM Login Page
#    When user enters invalid username
#    Then user enters empty password
    When user enters "yoll-student" username
    Then user enters "" password
    Then user clicks on login button
#    And user validates Password cannot be empty error message
    And user validates "Password cannot be empty" error message

  @negative
  Scenario: User should not be able to login with empty credentials
    Given user navigates to HRM Login Page
#    When user enters empty username
#    Then user enters empty password
    When user enters "" username
    Then user enters "" password
    Then user clicks on login button
    And user validates "Username cannot be empty" error message
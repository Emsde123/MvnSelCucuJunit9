# We can make @run global so it's applied to all the scenarios in this feature file.
# just changed it to @regression because it makes more sense.
# also added @login tag since we're working with login functionality.
@regression @login
Feature: This feature file will validate Login Page functionality.

  # Background is like a prerequisite, it is not required but we've taken a line
  # out for each step by using it, it needs to be a common step between all tests you're running.
  # Even though "Then user clicks on login button" is a step that's common for each case, but it's not a
  # pre-requisite, so we can't use it. If we reused the same username and password for each test case, we can add
  # all 4 steps to our background, not the case here though.
#Background: Given user navigates to HRM Login Page



#  The run tag is used to connect with the TestRunner class
@smoke @positive
  Scenario: User should be able to verify successful login with valid credentials
  Given user navigates to HRM Login Page
   When user enters "yoll-student" username
   Then user enters "Bootcamp5#" password
    Then user clicks on login button
    And user should be able to verify account name on HRM homepage


    # Scenario Outline accomplishes the same thing that we did with Data Provider. It allows
    # us to use different data for the same test case, like data provider.
  # We will parameterize further by adding <> to each parameter.
  # Whatever is inside the <> is the name of the parameter, not the data.
  @negative
    Scenario Outline: User should not be able to login with invalid credentials
    Given user navigates to HRM Login Page
      When user enters "<username>" username
      Then user enters "<password>" password
      Then user clicks on login button
      And user validates "<errorMessage>" error message
      #The example section will be created with our parameter names. It creates a table of our parameter names.
      Examples:
        | username        | password        |  errorMessage            |
        | InvalidUsername | invalidPassword | Invalid credentials      |
        |                 | invalidPassword | Username cannot be empty |
        | InvalidUsername |                 | Password cannot be empty |
        |                 |                 | Username cannot be empty |

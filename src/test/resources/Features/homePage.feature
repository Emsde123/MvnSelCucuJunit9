@regression @homePage
Feature: This feature file will validate Home Page functionality


  Scenario: User should be able to validate main tabs on HRM homepage
    Given user navigates to HRM Login Page
    When user enters "yoll-student" username
    Then user enters "Bootcamp5#" password
    Then user clicks on login button
    And user should be able to verify account name on HRM homepage
    And user verifies main tabs on HRM Homepage
    # This is a data table, it's a table with only one column. We will have 10 values in the tabname column (key)
    # We will convert this to a MapList to hold all of our values. It's connected to our above scenario. We need to
    # build a relationship between it and the HomePageSteps class.
      |tabname      |
      |Admin        |
      |PIM          |
      |Leave        |
      |Time         |
      |Recruitment  |
      |My Info      |
      |Performance  |
      |Dashboard    |
      |Directory    |
      |Maintenance  |

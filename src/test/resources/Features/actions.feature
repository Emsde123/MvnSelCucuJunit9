@regression @actions
Feature: This feature will validate Actions functionality



  Scenario: User should be able to hover over Admin tab on HRM Homepage
      Given user navigates to HRM Login Page
      When user enters "yoll-student" username
      Then user enters "Bootcamp5#" password
      Then user clicks on login button
      And user should be able to verify account name on HRM homepage
  Then user should be able to navigate to System Users page by doing hover over action



    Scenario: User should be able to perform right click on Context Menu Page
      Given user navigates to Context Menu Page
      Then user should be able to handle context click on Context Menu Page

      @run
    Scenario: User should be able to perform drag and drop action on Drag and Drop Page
        Given user navigates to Drag and Drop practice page
        Then user should be able to perform drag and drop action on Drag and Drop Page
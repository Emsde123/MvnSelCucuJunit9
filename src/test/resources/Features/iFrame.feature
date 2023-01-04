@regression @iFrame
Feature: This feature will validate editor page functionality


  Scenario: User should be able to enter a keyword into the text box on iFrames Page
    Given user navigates to iFrames page
    When user enters a keyword into the text box on iFrames page
    Then user should be able to verify the entered text on iFrames page
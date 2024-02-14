@login
Feature: Login App
  @logout
  Scenario: Login from Trello
    Given I click on login button from Trello Home page
    When I login to TRELLO portal web with TRELLO-USER-PASSWORD credentials
    Then Verify Trello Main page is displayed.


@regression @login
  Feature: Login
    @login_successful
    Scenario: Login Trello
      Given I click on login button from Trello Home page
      When I login to "TRELLO" portal web with "TRELLO-USER-PASSWORD" credentials
      Then Verify Trello Main page is displayed.

    Scenario: Login Successful
      Given I login to "TRELLO" portal web with "TRELLO-USER-PASSWORD" credentials
      When I click on "Start Product Trello" button on "StartAtlassian" page
      Then Verify Boards page is displayed.


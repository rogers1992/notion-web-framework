@regression @board
  Feature: Board

    Background:
      Given I click on login button from Trello Home page
      And I login to "TRELLO" portal web with "TRELLO-USER-PASSWORD" credentials


    Scenario: Create new board
      When I click on "Create new Board" button
      And I fill "Board Test Auto" on Board title field
      And I click on "Create" button
      Then Verify if "Board Test Auto" is displayed





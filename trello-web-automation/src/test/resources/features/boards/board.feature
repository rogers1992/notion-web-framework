@regression @board
  Feature: Board

    @loginTrello @deleteBoard
    Scenario: Create new board
      When I click on "Create new Board" button
      And I fill "Board Test Auto" on Board title field
      And I click on "Create" button
      Then Verify if "Board Test Auto" is displayed

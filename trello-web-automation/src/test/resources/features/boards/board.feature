@regression
  Feature: Board

    @loginTrello @deleteBoard @logout
    Scenario: Create new board
      When I click on "Create new Board" button
      And I fill "Board Test Auto" on Board title field
      And I click on "Create" button
      Then Verify if "Board Test Auto" is displayed

    @board @loginTrello @deleteBoard @logout
    Scenario Outline: Name Board Test
      When I click on "Create new Board" button
      And I fill "<nameBoard>" on Board title field
      And I click on "Create" button
      Then Verify if "<nameBoardCreated>" is displayed
      Examples:
        | nameBoard       | nameBoardCreated |
        | roger1234       | roger1234        |
        | Board Test Auto | Board Test Auto  |
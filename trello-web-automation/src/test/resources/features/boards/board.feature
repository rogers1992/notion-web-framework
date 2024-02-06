@regression
  Feature: Board

    @loginTrello @deleteBoard @logout
    Scenario: Create new board
      When I click on "Create new Board" button
      And I fill "Roger Test Auto" on Board title field
      And I click on "Create" button
      Then Verify if "Roger Test Auto" is displayed

    @board @loginTrello @deleteBoard @logout
    Scenario Outline: Name Board Test
      When I click on "Create new Board" button
      And I fill "<nameBoard>" on Board title field
      And I click on "Create" button
      Then Verify if "<nameBoardCreated>" is displayed
      Examples:
        | nameBoard       | nameBoardCreated |
        | roger1234       | roger1231        |
        | Board Test Auto | Board Test Aut   |
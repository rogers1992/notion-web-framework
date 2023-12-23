package automation.notion.ui.steps;

import automation.notion.core.ui.portals.trello.pages.board.CreateBoardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateBoardSteps {

    private final CreateBoardPage createBoardPage;
    public CreateBoardSteps(){
        createBoardPage = new CreateBoardPage();
    }
    @When("I click on \"Create new Board\" button")
    public void iClickOnCreateNewBoardButton() {
        createBoardPage.clickOnCreateNewBoardButton();
    }
    @And("I fill {string} on Board title field")
    public void iFillOnBoardTitleField(String boardTitle) {
        createBoardPage.fillOnBoardTitleField(boardTitle);
    }

    @And("I click on \"Create\" button")
    public void iClickOnButton() {
        createBoardPage.clickOnCreateButton();
    }
}

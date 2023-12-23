package automation.notion.ui.steps;

import automation.notion.core.ui.portals.trello.pages.TrelloMainHomePage;
import automation.notion.core.ui.portals.trello.pages.board.BoardPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BoardSteps {
    private final BoardPage boardPage;
    public BoardSteps(){ boardPage = new BoardPage();}
    @Then("Verify Boards page is displayed.")
    public void verifyBoardsPageIsDisplayed() {
        Assert.assertEquals(" ", boardPage.getBoardTitle());
    }

    @Then("Verify if {string} is displayed")
    public void verifyIsBoardTitleDisplayed(String boardTitle) {
        Assert.assertEquals(boardTitle, boardPage.getBoardTitle());
    }
}

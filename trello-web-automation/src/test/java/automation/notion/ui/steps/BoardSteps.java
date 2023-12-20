package automation.notion.ui.steps;

import automation.notion.core.ui.portals.trello.pages.TrelloMainHomePage;
import automation.notion.core.ui.portals.trello.pages.board.BoardPage;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class BoardSteps {
    @Then("Verify Boards page is displayed.")
    public void verifyBoardsPageIsDisplayed() {
        BoardPage boardPage = new BoardPage();
        Assertions.assertEquals(" ", boardPage.getBoardTitle());
    }
}

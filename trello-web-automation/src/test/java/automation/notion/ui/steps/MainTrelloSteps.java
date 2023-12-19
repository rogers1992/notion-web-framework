package automation.notion.ui.steps;

import automation.notion.core.ui.portals.trello.pages.TrelloMainHomePage;
import io.cucumber.java.en.Then;

public class MainTrelloSteps {
    @Then("Verify Trello Main page is displayed.")
    public void verifyTrelloMainPageIsDisplayed() {
        TrelloMainHomePage trelloMainHomePage = new TrelloMainHomePage();
        trelloMainHomePage.workSpaceIsDisplayed();
    }
}

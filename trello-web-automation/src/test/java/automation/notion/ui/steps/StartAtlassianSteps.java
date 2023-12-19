package automation.notion.ui.steps;

import automation.notion.core.ui.portals.trello.pages.startAtlassian.StartAtlassianPage;
import io.cucumber.java.en.When;

public class StartAtlassianSteps {
    @When("I click on \"Start Product Trello\" button on \"StartAtlassian\" page")
    public void clickOnStartProductTrelloButtonOnStartAtlassiaPage() {
        StartAtlassianPage startAtlassianPage = new StartAtlassianPage();
        startAtlassianPage.clickOnStartProductTrelloButton();
    }
}

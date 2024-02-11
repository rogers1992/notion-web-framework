package automation.notion.ui.steps;

import automation.core.ui.environment.EnvironmentManager;
import automation.notion.core.ui.portals.trello.pages.TrelloHomePage;
import automation.notion.core.ui.portals.trello.pages.login.LoginFactory;
import automation.notion.core.ui.portals.trello.pages.login.LoginFromTrelloPage;
import automation.notion.core.ui.portals.trello.pages.login.PortalWeb;
import automation.notion.core.ui.portals.trello.pages.login.UserTypes;
import io.cucumber.java.en.Given;

public class TrelloUrlSteps {
    @Given("I click on login button from Trello Home page")
    public void iClickOnLoginButtonFromTrelloHomePage() {
        EnvironmentManager environmentManager = EnvironmentManager.getInstance();
        environmentManager.setPortalWeb(PortalWeb.TRELLO.val());
        environmentManager.setUserType(UserTypes.TRELLO_USER_PASSSWORD.val());

        TrelloHomePage trelloHomePage = TrelloHomePage.getInstance();
        trelloHomePage.goToLogin();

    }
}

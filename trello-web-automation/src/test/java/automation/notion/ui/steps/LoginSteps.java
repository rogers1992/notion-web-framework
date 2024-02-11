package automation.notion.ui.steps;

import automation.core.ui.environment.EnvironmentManager;
import automation.notion.core.ui.portals.trello.helpers.LoginHelper;
import automation.notion.core.ui.portals.trello.pages.login.LoginFactory;
import automation.notion.core.ui.portals.trello.pages.login.LoginFromTrelloPage;
import automation.notion.core.ui.portals.trello.pages.login.PortalWeb;
import automation.notion.core.ui.portals.trello.pages.login.UserTypes;
import io.cucumber.java.en.Given;

public class LoginSteps {
    @Given("I login to TRELLO portal web with TRELLO-USER-PASSWORD credentials")
    public void iLoginToPortalWebWithCredentials() {
        LoginFromTrelloPage loginFromTrelloPage = LoginFactory.createLoginFromTrelloPage();
        loginFromTrelloPage.loginUserFromTrello();

    }
}

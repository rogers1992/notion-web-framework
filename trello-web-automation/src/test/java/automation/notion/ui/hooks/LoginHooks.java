package automation.notion.ui.hooks;

import automation.core.ui.environment.EnvironmentManager;
import automation.notion.core.ui.portals.trello.helpers.LoginHelper;
import automation.notion.core.ui.portals.trello.pages.TrelloHomePage;
import automation.notion.core.ui.portals.trello.pages.login.LoginFactory;
import automation.notion.core.ui.portals.trello.pages.login.LoginFromTrelloPage;
import automation.notion.core.ui.portals.trello.pages.login.PortalWeb;
import automation.notion.core.ui.portals.trello.pages.login.UserTypes;
import io.cucumber.java.Before;

public class LoginHooks {
    @Before
    public void loginTrello(){
        EnvironmentManager environmentManager = EnvironmentManager.getInstance();
        environmentManager.setPortalWeb(PortalWeb.TRELLO.val());
        environmentManager.setUserType(UserTypes.TRELLO_USER_PASSSWORD.val());

        TrelloHomePage trelloHomePage = TrelloHomePage.getInstance();
        trelloHomePage.goToLogin();
        LoginFromTrelloPage loginFromTrelloPage = LoginFactory.createLoginFromTrelloPage();
        loginFromTrelloPage.loginUserFromTrello();
    }
}

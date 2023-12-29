package automation.notion.core.ui.portals.trello.pages.login;

import automation.core.ui.environment.EnvironmentManager;
import automation.core.ui.webdrives.WebDriverManager;
import automation.notion.core.ui.portals.trello.pages.TrelloHomePage;
import automation.notion.core.ui.portals.trello.pages.TrelloMainHomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTrelloPageTest {
    @AfterEach
    void teardwon(){
        WebDriverManager.getInstance().quitWebDriver();
    }
    @Test
    void loginUserToTrello(){
        //Given
        EnvironmentManager environmentManager = EnvironmentManager.getInstance();
        environmentManager.setPortalWeb(PortalWeb.TRELLO.val());
        environmentManager.setUserType(UserTypes.TRELLO_USER_PASSSWORD.val());
        //When
        // loginUserPasswordPage = LoginFactory.createLoginPage(PortalWeb.TRELLO, UserTypes.TRELLO_USER_PASSSWORD);
        TrelloHomePage trelloHomePage = TrelloHomePage.getInstance();
        trelloHomePage.goToLogin();
        LoginFromTrelloPage loginFromtrelloPage = LoginFactory.createLoginFromTrelloPage();
        loginFromtrelloPage.loginUserFromTrello();

        //Then
        TrelloMainHomePage trelloMainHomePage = new TrelloMainHomePage();
        Assertions.assertTrue(trelloMainHomePage.workSpaceIsDisplayed());
        Assertions.assertEquals("Boards | Trello", trelloMainHomePage.getPageTitleText());
    }
}

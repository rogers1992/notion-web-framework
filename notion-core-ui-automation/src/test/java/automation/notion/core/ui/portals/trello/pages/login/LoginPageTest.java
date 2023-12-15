package automation.notion.core.ui.portals.trello.pages.login;

import automation.core.ui.environment.EnvironmentManager;
import automation.core.ui.webdrives.WebDriverManager;
import automation.notion.core.ui.portals.trello.pages.startAtlassian.StartAtlassianPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginPageTest {
    @AfterEach
    void teardwon(){
        WebDriverManager.getInstance().quitWebDriver();
    }
    @Test
    void loginUserInPortal(){
        //Given
        EnvironmentManager environmentManager = EnvironmentManager.getInstance();
        environmentManager.setPortalWeb(PortalWeb.TRELLO.val());
        environmentManager.setUserType(UserTypes.TRELLO_USER_PASSSWORD.val());
        //When
        LoginUserPasswordPage loginUserPasswordPage = LoginFactory.createLoginPage(PortalWeb.TRELLO, UserTypes.TRELLO_USER_PASSSWORD);
        loginUserPasswordPage.loginUserInPortal();

        //Then
        StartAtlassianPage startAtlassianPage = new StartAtlassianPage();
        Assertions.assertTrue(startAtlassianPage.isSwitchToLabelDisplayed());
    }
}
